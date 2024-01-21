package org.designprinciples.isp.machines;

public class CoffeeMachineImpl implements ICoffeeMachine{
    @Override
    public void prepareCoffee() {
        System.out.println("Preparing Coffee");
    }
}
