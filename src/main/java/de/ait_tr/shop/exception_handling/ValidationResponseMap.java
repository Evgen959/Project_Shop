package de.ait_tr.shop.exception_handling;

import java.util.List;
import java.util.Objects;

public class ValidationResponseMap {
    private List<String> messages;

    public ValidationResponseMap(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ValidationResponseMap that)) return false;
        return Objects.equals(messages, that.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(messages);
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
