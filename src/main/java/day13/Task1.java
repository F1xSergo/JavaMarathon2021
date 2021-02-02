package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Rob");
        User user2 = new User("Bob");
        User user3 = new User("Sos");

        user1.sendMessage(user2, "привет от Rob");
        user1.sendMessage(user2, "Как дела");

        user2.sendMessage(user1, "привет Роб");
        user2.sendMessage(user1, " я Боб");
        user2.sendMessage(user1, " как дела");

        user3.sendMessage(user1, "привет  я Сос");
        user3.sendMessage(user1, "ходили в школу");
        user3.sendMessage(user1, " как дела");

        user1.sendMessage(user3, "привет Сос");
        user1.sendMessage(user3, "помню");
        user1.sendMessage(user3, " как дела");

        user3.sendMessage(user1, " пошли бухать");

        MessageDatabase.showDialog(user1,user3);
    }
}
