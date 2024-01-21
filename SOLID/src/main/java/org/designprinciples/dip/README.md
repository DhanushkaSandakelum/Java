# Dependency Inversion Principle (DIP)

The Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules; both should depend on abstractions. Additionally, abstractions should not depend on details; details should depend on abstractions. In simpler terms, it encourages the use of abstractions (interfaces or abstract classes) to decouple high-level and low-level components.

Let's consider an example where we have a high-level module that sends messages, and we want to adhere to the Dependency Inversion Principle:

```java
// MessagingService.java (High-level module)
class MessagingService {
    private EmailService emailService;

    public MessagingService() {
        this.emailService = new EmailService(); // Dependency on a concrete class
    }

    public void sendMessage(String message, String recipient) {
        // Sending an email using the EmailService
        emailService.sendEmail(message, recipient);
    }
}

// EmailService.java (Low-level module)
class EmailService {
    public void sendEmail(String message, String recipient) {
        // Sending an email
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

```

In this example, the `MessagingService` is a high-level module that directly depends on the `EmailService` low-level module. This violates the Dependency Inversion Principle because the high-level module depends on a concrete implementation rather than an abstraction.

Now, let's refactor it to adhere to DIP by introducing an interface:

```java
// MessageSender.java (Abstraction)
interface MessageSender {
    void sendMessage(String message, String recipient);
}

// EmailService.java (Low-level module)
class EmailService implements MessageSender {
    @Override
    public void sendMessage(String message, String recipient) {
        // Sending an email
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

// MessagingService.java (High-level module)
class MessagingService {
    private MessageSender messageSender;

    public MessagingService(MessageSender messageSender) {
        this.messageSender = messageSender; // Dependency on an abstraction
    }

    public void sendMessage(String message, String recipient) {
        // Sending a message using the injected MessageSender
        messageSender.sendMessage(message, recipient);
    }
}

```

In the refactored code, we've introduced the `MessageSender` interface as an abstraction. The `EmailService` class now implements this interface, and the `MessagingService` class depends on the `MessageSender` interface rather than the concrete `EmailService` class. This adheres to the Dependency Inversion Principle, making the high-level module independent of the low-level details and allowing for more flexibility and extensibility. Now, you can easily introduce new message sending implementations without modifying the `MessagingService` class.