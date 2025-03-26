package com.mg.java17;

public sealed interface SealedIntefaceTransaction permits Deposit {
    void execute();
}
