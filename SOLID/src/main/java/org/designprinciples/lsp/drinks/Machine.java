package org.designprinciples.lsp.drinks;

abstract class Machine {
    public abstract void prepareDrink();

    public void addMilk() {
        System.out.println("Milk is added");
    }
}
