package com.pragmaticobjects.oo.tests.bdd;

import com.pragmaticobjects.oo.tests.Assertion;

/**
 * Assertion that covers the 3 steps of BDD approach.
 *
 * @param <S> The system under test
 * @param <R> The result of the performed operation
 *
 * @author Romain Rochegude
 */
public class BehaviorAssertion<S, R> implements Assertion {

    private final Step.Given<S> given;
    private final Step.When<S, R> when;
    private final Step.Then<R> then;

    /**
     * Ctor.
     *
     * @param given The Given step
     * @param when The When step
     * @param then The Then step
     */
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
    public final void check() throws Exception {
        then.check(
                when.when(
                        given.given()
                )
        );
    }
}
