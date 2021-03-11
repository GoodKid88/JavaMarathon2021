package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User user1, User user2) {
        for (Message mes : messages) {
            if (mes.getSender().equals(user1) && mes.getReceiver().equals(user2)) {
                System.out.println(user1.getUsername() + ": " + mes.getText());
            } else if (mes.getSender().equals(user2) && mes.getReceiver().equals(user1)) {
                System.out.println(user2.getUsername() + ": " + mes.getText());
            }
        }
    }
}
