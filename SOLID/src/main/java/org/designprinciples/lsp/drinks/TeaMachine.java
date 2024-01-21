package org.designprinciples.lsp.drinks;

public class TeaMachine extends Machine{
    @Override
    public void prepareDrink() {
        System.out.println("Tea is prepared with Milk");
    }

    @Override
    public void  addMilk() {
        System.out.println("Milk is added to Tea");
    }
}
