import java.util.ArrayList;

public class MessagingService {
    
    private ArrayList<Message> messages;
    
    public MessagingService () {
        this.messages = new ArrayList<Message>();
    }
    
    // Objective: adds a message passed as a parameter to the messaging service
    // Constraint: message content is at most 280 characters long.
    public void add (Message message) {
        if (message.getContent().length() > 280) return;
        this.messages.add(message);
    }
    
    // Objective: returns the messages added to the messaging service.
    public ArrayList<Message> getMessages () {
        return this.messages;
    }
}
