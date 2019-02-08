package com.pragmaticobjects.oo.tests.bdd;

/**
 * A When step that does nothing
 *
 * @author Romain Rochegude
 */
public class WhenNop implements Step.When<Void, Void> {
    @Override
    public final Void when(final Void sut) {
        return null;
    }
}
