import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GasTerminal implements UserInterface{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void showMenu(Driver driver) {
        System.out.printf("%s, введите код операции: 1 - заправить; 2 - оплатить: ", driver.getLastName());
    }

    @Override
    public int readMessage() {
        return scanner.nextInt();
    }

    @Override
    public void requestParameters(String requestMessage) {
        System.out.printf("%s: ", requestMessage);
    }

    @Override
    public List<Integer> readParameters() {
        List<Integer> paramList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            paramList.add(readMessage());
        }
        return paramList;
    }

    @Override
    public void sendNotification(String notificationString) {
        System.out.println(notificationString);
    }
}
