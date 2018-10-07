package com.namlee.examples.design_pattern.creational_pattern.singleton_pattern;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.ofMillis;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

import org.junit.Test;

public abstract class SingletonTest<S> {

    private final Supplier<S> singletonInstanceMethod;

    public SingletonTest(Supplier<S> singletonInstanceMethod) {

        this.singletonInstanceMethod = singletonInstanceMethod;
    }

    @Test
    public void whenMultipleCalls_thenReturnTheSameObject() {

        S instance1 = this.singletonInstanceMethod.get();
        S instance2 = this.singletonInstanceMethod.get();
        S instance3 = this.singletonInstanceMethod.get();

        // check equals
        assertSame(instance1, instance2);
        assertSame(instance2, instance3);
        assertSame(instance3, instance1);
    }

    @Test
    public void testMultipleCallsReturnTheSameObjectInDifferentThreads() throws Exception {

        assertTimeout(ofMillis(10000), () -> {

            // Create 10000 tasks and inside each callable instantiate the singleton class
            final List<Callable<S>> tasks = new ArrayList<>();
            for (int i = 0; i < 10000; i++) {
                tasks.add(this.singletonInstanceMethod::get);
            }

            // Use up to 8 concurrent threads to handle the tasks
            final ExecutorService executorService = Executors.newFixedThreadPool(8);
            final List<Future<S>> results = executorService.invokeAll(tasks);

            // wait for all of the threads to complete
            final S expectedInstance = this.singletonInstanceMethod.get();
            for (Future<S> res : results) {
                final S instance = res.get();
                assertNotNull(instance);
                assertSame(expectedInstance, instance);
            }

            // tidy up the executor
            executorService.shutdown();
        });
    }

}
