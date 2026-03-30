package com.github.pioneerredpanthers.prplib.command;

import java.util.concurrent.ConcurrentMap;

public final class CommandScheduler {
    private static CommandScheduler instance;

    public static CommandScheduler getInstance() {
        if (instance == null) {
            instance = new CommandScheduler();
        }

        return instance;
    }

    public void run() {

    }
}
