# Single Responsibility Principle (SRP)


The Single Responsibility Principle (SRP) states that a class should have only one reason to change, meaning it should have only one responsibility. Here's a simple Java example to illustrate the Single Responsibility Principle:

```java
// Violation of SRP - One class with multiple responsibilities

class Report {
    private String title;
    private String content;

    // Constructor, getters, and setters

    public void generateReport() {
        // Generate the report content
        // ...
    }

    public void saveToFile() {
        // Save the report to a file
        // ...
    }

    public void sendByEmail() {
        // Send the report via email
        // ...
    }
}
```

In this example, the `Report` class has multiple responsibilities: generating the report content, saving the report to a file, and sending the report via email. This violates the Single Responsibility Principle.

Now, let's refactor the code to adhere to SRP:

```java
// Adhering to SRP - Separate classes for each responsibility

class Report {
    private String title;
    private String content;

    // Constructor, getters, and setters

    public void generateReport() {
        // Generate the report content
        // ...
    }
}

class FileSaver {
    public void saveToFile(Report report) {
        // Save the report to a file
        // ...
    }
}

class EmailSender {
    public void sendByEmail(Report report) {
        // Send the report via email
        // ...
    }
}

```

In the refactored code, we've separated the responsibilities into three classes: `Report` for generating the report content, `FileSaver` for saving the report to a file, and `EmailSender` for sending the report via email. Each class now has a single responsibility, adhering to the Single Responsibility Principle. This makes the code more modular, easier to understand, and less prone to changes when one aspect of the system needs modification.