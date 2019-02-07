package com.pragmaticobjects.oo.tests.bdd;

import com.pragmaticobjects.oo.tests.Assertion;

public final class BehaviorAssertion<S, R> implements Assertion {

    private final Step.Given<S> given;
    private final Step.When<S, R> when;
    private final Step.Then<R> then;

    public BehaviorAssertion(
            final Step.Given<S> given,
            final Step.When<S, R> when,
            final Step.Then<R> then
    ) {
        this.given = given;
        this.when = when;
        this.then = then;
    }

    @Override
    public void check() throws Exception {
        then.check(
                when.when(
                        given.given()
                )
        );
    }
}
