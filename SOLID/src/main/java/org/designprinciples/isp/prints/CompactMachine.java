package org.designprinciples.isp.prints;

public class CompactMachine implements IDocument, IPrinter, IScanner{
    private String document;

    @Override
    public void create(String doc) {
        document = doc;
    }

    @Override
    public void print() {
        System.out.println("Printing: " + this.document);
    }

    @Override
    public void scan() {
        System.out.println("Scanning: " + this.document);
    }
}
