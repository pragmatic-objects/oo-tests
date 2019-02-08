package com.pragmaticobjects.oo.tests.bdd;

public class WhenNop implements Step.When<Void, Void> {
    @Override
    public final Void when(final Void sut) {
        return null;
    }
}
