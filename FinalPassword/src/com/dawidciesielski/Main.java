package com.dawidciesielski;

public class Main {

    public static void main(String[] args) {
        int pw = 147147;
	    Password password = new ExtendedPassword(pw);
	    password.storePassword();

	    password.letMeIn(11222);
	    password.letMeIn(555888);
	    password.letMeIn(85958);
	    password.letMeIn(147147);

//		System.out.println("Main method called");
//		StaticInitializationBlockTest test = new StaticInitializationBlockTest();
//		test.someMethod();
//		System.out.println("Owner is " + StaticInitializationBlockTest.owner);
    }

}
