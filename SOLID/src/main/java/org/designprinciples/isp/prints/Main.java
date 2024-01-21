package org.designprinciples.isp.prints;

public class Main {
    public static void main(String[] args) {
        CompactMachine compactMachine = new CompactMachine();

        compactMachine.create("Sample Document");
        compactMachine.print();
        compactMachine.scan();
    }
}
