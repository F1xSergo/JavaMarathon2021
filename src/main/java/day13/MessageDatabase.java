package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    // этот метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text.
    // Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
    public static void addNewMessage(User sender, User receiver, String text) {
        messages.add(new Message(sender, receiver, text));
    }

    public static List<Message> getMessages() { //- возвращает список всех сообщений в “базе данных”.
        return messages;
    }

    // этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат вывода должен быть таким:
//    user1: Привет!
//    user2: Привет, user1!
//    user1: Как у тебя дела?
//    user2: Все ок, спасибо :)
    public static void showDialog(User u1, User u2) {
        for (Message message : messages) {
            if (message.getSender() == u1 && message.getReceiver() == u2
                    || message.getSender() == u2 && message.getReceiver() == u1) {
                System.out.println(message.getSender() + ": " + message.getText());
            }
        }
    }
}
