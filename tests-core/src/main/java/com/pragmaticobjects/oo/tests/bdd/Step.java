package com.pragmaticobjects.oo.tests.bdd;

/**
 * Interface to describe behavior-driven-development steps
 *
 * @author Romain Rochegude
 */
public interface Step {
    /**
     * Interface to describe the Given step.
     *
     * @param <S> The system under test
     */
    interface Given<S> {
        /**
         * Build the system under test instance.
         *
         * @return An instance of the system under test
         */
        S given();
    }

    /**
     * Interface to describe the When step.
     *
     * @param <S> The system under test
     * @param <R> The result of the performed operation
     */
    interface When<S, R> {
        /**
         * Perform the operation to test.
         *
         * @param sut The system under test
         * @return The result of the performed operation
         */
        R when(final S sut);
    }

    /**
     * Interface to describe the Then step.
     *
     * @param <R> The result of the performed operation
     */
    interface Then<R> {
        /**
         * Check the result of the performed operation.
         *
         * @param result The result of the performed operation
         */
        void check(final R result);
    }
}
