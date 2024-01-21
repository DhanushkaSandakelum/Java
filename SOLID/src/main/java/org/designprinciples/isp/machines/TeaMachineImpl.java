package org.designprinciples.isp.machines;

public class TeaMachineImpl implements ITeaMachine{
    @Override
    public void prepareTea() {
        System.out.println("Preparing Tea");
    }
}
