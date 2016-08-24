package com.ilyamur.topaz.aspectj;

import java.util.concurrent.atomic.AtomicLong;

public enum UserGetNameCounter {

    INSTANCE;

    private final AtomicLong c = new AtomicLong(0);

    public void inc() {
        c.incrementAndGet();
    }

    public long value() {
        return c.get();
    }
}
