package org.designprinciples.srp.report;

public class Report {
    private String title;
    private String content;

    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void generateReport() {
        System.out.println("--- Report ---");
        System.out.println("Title: " + this.title);
        System.out.println("Content: " + this.content);
    }
}
