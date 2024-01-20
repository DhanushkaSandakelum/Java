package org.designprinciples.srp.report;

public class FileSaver {
    public void saveToFile(Report report) {
        System.out.println("File Saved! " + report.getTitle());
    }
}
