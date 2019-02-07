package com.pragmaticobjects.oo.tests.bdd;

import static org.assertj.core.api.Assertions.fail;

public final class ThenFails implements Step.Then<Void> {
    @Override
    public void check(final Void result) {
        fail("FAIL, just as planned");
    }
}
