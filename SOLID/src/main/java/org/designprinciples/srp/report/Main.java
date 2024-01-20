package org.designprinciples.srp.report;

public class Main {
    public static void main(String[] args) {
        Report report = new Report("Monthly Report", "This is the sample content");
        report.generateReport();

        FileSaver fileSaver = new FileSaver();
        fileSaver.saveToFile(report);

        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(report);
    }
}
