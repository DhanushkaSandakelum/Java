package org.designprinciples.isp.machines;

public class Main {
    public static void main(String[] args) {
        CoffeeMachineImpl coffeeMachine = new CoffeeMachineImpl();
        TeaMachineImpl teaMachine = new TeaMachineImpl();

        coffeeMachine.prepareCoffee();
        teaMachine.prepareTea();
    }
}
