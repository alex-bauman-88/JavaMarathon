package day13;

import java.time.LocalDateTime;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private LocalDateTime date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = LocalDateTime.now();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return "FROM: " + sender + newline +
                "TO: " + receiver + newline +
                "ON: " + date + newline +
                text  + newline;
    }
}
