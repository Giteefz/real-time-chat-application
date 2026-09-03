public class Message {

    private User sender;
    private User receiver;
    private String content;

    public Message(User sender, User receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    public void showMessage() {
        System.out.println(sender.getUsername() + ": " + content);
    }
}