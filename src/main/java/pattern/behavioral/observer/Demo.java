package pattern.behavioral.observer;

public class Demo {
    public static void main(String[] args) {
        User user = new User();
        user.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        user.events.subscribe("save", new LogOpenListener("/path/to/log/file.txt"));
        user.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            user.openFile("test.txt");
            user.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}