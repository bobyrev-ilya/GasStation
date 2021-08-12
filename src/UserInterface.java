import java.util.List;

public interface UserInterface {

    void showMenu(Driver driver);

    int readMessage();

    void requestParameters(String requestMessage);

    List<Integer> readParameters();

    void sendNotification(String notificationString);
}
