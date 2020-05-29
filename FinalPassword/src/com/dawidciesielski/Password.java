package com.dawidciesielski;

public class Password {

    private static final int key = 15151515;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt (int password) {
        return password ^ key;
    }

    public void storePassword () { //if its final you cannot override it
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn (int password) {
        if (encryptDecrypt(password)== this.encryptedPassword) {
            System.out.println("Welcome!!!");
            return true;
        } else {
            System.out.println("Try better next time ...");
        } return false;
    }
}

