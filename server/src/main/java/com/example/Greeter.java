package com.example;

/**
 * This is a class.
 */
public class Greeter {

    /**
     * This is a constructor.
     */
    public Greeter() {

    }

    /**
     * Lets greet someone.
     *
     * @param someone someone to greet.
     * @return A strings with the greeting.
     */
    public final String greet(final String someone) {
        return String.format("Hello, %s!", someone);
    }
}
