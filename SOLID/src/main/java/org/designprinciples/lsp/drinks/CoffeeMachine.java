package org.designprinciples.lsp.drinks;

public class CoffeeMachine extends Machine{
    @Override
    public void prepareDrink() {
        System.out.println("Coffee is prepared");
    }
}
