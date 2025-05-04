import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nihad
 */
public class MessagingService {
    private ArrayList<Message> messageList;
    
    public MessagingService() {
        messageList = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() < 281) {
            messageList.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return messageList;
    }
}
