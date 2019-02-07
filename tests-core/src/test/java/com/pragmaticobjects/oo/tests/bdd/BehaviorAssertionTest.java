package com.pragmaticobjects.oo.tests.bdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BehaviorAssertionTest {
    @Test
    public void assertAssertionFailsTest() {
        assertThatThrownBy(
                () ->
                        new BehaviorAssertion<>(
                                new GivenNop(),
                                new WhenNop(),
                                new ThenFails()
                        ).check()
        ).isInstanceOf(AssertionError.class);
    }

    @Test
    public void assertAssertionPassesTest() {
        assertThatCode(
                () ->
                        new BehaviorAssertion<>(
                                new GivenNop(),
                                new WhenNop(),
                                new ThenSucceeds()
                        ).check()
        ).doesNotThrowAnyException();
    }
}