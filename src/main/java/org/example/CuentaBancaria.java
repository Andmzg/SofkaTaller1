package org.example;

public class CuentaBancaria {


    private int accountNumber;
    protected boolean activated;

    // Methods


    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}