package com.github.pioneerredpanthers.prplib.command;

public abstract class Command {

    public void init() {}
    public void looep() {}

    public boolean schedule() {
        return true;
    }
}
