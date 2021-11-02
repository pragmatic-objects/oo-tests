package com.pragmaticobjects.oo.tests.bdd;

/**
 * A Given step that does nothing
 *
 * @author Romain Rochegude
 */
public class GivenNop implements Step.Given<Void> {
    @Override
    public final Void given() {
        return null;
    }
}
