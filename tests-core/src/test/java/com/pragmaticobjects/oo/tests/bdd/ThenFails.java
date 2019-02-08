package com.pragmaticobjects.oo.tests.bdd;

import static org.assertj.core.api.Assertions.fail;

public class ThenFails implements Step.Then<Void> {
    @Override
    public final void check(final Void result) {
        fail("FAIL, just as planned");
    }
}
