package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new <User>ArrayList();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User users : subscriptions) {
            if (users.equals(user)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        for (User user1 : subscriptions) {
            if (user1.equals(user)) {
                for (User user2 : user.subscriptions) {
                    if (user2.equals(this))
                        return true;
                }
            }
        }
        return false;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
