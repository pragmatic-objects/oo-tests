package com.pragmaticobjects.oo.tests.bdd;

public interface Step {
    interface Given<S> {
        S given();
    }

    interface When<S, R> {
        R when(final S sut);
    }

    interface Then<R> {
        void check(final R result);
    }
}
