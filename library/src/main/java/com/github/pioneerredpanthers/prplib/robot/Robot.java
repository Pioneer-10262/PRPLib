package com.github.pioneerredpanthers.prplib.robot;

import com.github.pioneerredpanthers.prplib.command.Command;

public abstract class Robot {
    private static Robot instance;

    public static Robot getInstance() {
        return instance;
    }

    public final void initialize() {
        if (instance != null) {
            throw new IllegalStateException("Robot already initialized");
        }

        instance = this;
    }

    public abstract void autonomousInit();
    public abstract void teleopInit();
    public abstract Command getAutonomousCommand();
}
