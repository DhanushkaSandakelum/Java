package org.designprinciples.srp.report;

public class EmailSender {
    public void sendEmail(Report report) {
        System.out.println("Email Sent! " + report.getTitle());
    }
}
