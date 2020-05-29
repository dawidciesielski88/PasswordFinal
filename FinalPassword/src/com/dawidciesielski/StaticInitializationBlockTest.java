package com.dawidciesielski;

public class StaticInitializationBlockTest {
    public static final String owner;

    static  {
        owner = "dawid";
        System.out.println("SIBTest static initialization block called");
    }

    public StaticInitializationBlockTest() {
        System.out.println("SIB constructor called");
    }
    static  {
        System.out.println("Second initialization block called");
    }
    public void someMethod() {
        System.out.println("someMethod called");
    }
}
