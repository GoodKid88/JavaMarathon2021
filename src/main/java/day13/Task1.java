package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Andrei");
        User user2 = new User("Bob");
        User user3 = new User("Sam");

        user2.subscribe(user1);
        user1.subscribe(user2);

        System.out.println(user2.isSubscribed(user1));
        System.out.println(user1.isSubscribed(user2));
        System.out.println(user1.isFriend(user2));
        System.out.println(user2.isFriend(user1));

        user1.sendMessage(user2, "Hi");
        user1.sendMessage(user2, "How are u");

        user2.sendMessage(user1, "hello");
        user2.sendMessage(user1, "i'm ok");
        user2.sendMessage(user1, "How are u");

        user3.sendMessage(user1, "whatsup");
        user3.sendMessage(user1, "what's your name");
        user3.sendMessage(user1, "where are you from");

        user1.sendMessage(user3, "hello");
        user1.sendMessage(user3, "Andre");
        user1.sendMessage(user3, "from Russia");

        user3.sendMessage(user1, "buy");

        MessageDatabase.showDialog(user1, user2);
        System.out.println("********************************");
        MessageDatabase.showDialog(user1, user3);
        System.out.println("********************************");
    }
}
