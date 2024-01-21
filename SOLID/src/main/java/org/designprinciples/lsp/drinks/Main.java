package org.designprinciples.lsp.drinks;

public class Main {
    public static void main(String[] args) {
        Machine coffee = new CoffeeMachine();
        coffee.prepareDrink();

        Machine tea = new TeaMachine();
        tea.addMilk();
        tea.prepareDrink();
    }
}
