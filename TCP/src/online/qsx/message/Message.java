package online.qsx.message;

import java.io.Serializable;

public class Message implements Serializable {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Message(String message) {
        super();
        this.message = message;
    }
}
