package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscriptions;

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return this.subscriptions;
    }

    //- подписывает пользователя на пользователя user
    public void subscribe(User user) {
        this.subscriptions.add(user);// - эта строчка добавляет юзера в List<User> subscriptions
    }

    // возвращает True, если пользователь подписан на пользователя user и False, если не подписан.
    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    // возвращает True, если пользователь user является другом и False,
    // если пользователь user не является другом. Подумайте, что такое дружба в контексте соц. сетей.
    public boolean isFriend(User user) {
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    //- отправляет сообщение с текстом text пользователю user.
    // Здесь должен использоваться статический метод из MessageDatabase.
    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }


    //возвращает строковое представление пользователя (имя пользователя).

    @Override
    public String toString() {
        return userName;

    }
}
