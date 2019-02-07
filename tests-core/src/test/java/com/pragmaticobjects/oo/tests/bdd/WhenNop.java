package com.pragmaticobjects.oo.tests.bdd;

public final class WhenNop implements Step.When<Void, Void> {
    @Override
    public Void when(final Void sut) {
        return null;
    }
}
