public class ChatApp {

    public static void main(String[] args) {

        User rachel = new User("Rachel");
        User john = new User("John");

        Message message1 = new Message(
                rachel,
                john,
                "Hi John!"
        );

        Message message2 = new Message(
                john,
                rachel,
                "Hi Rachel!"
        );

        Message message3 = new Message(
                rachel,
                john,
                "How are you?"
        );

        message1.showMessage();
        message2.showMessage();
        message3.showMessage();
    }
}