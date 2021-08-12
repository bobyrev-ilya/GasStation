
import java.util.HashMap;
import java.util.Map;

public class GasStation {

    protected static UserInterface terminal;
    private Map<Integer, UserRequest> userAction = new HashMap<>();

    public GasStation(UserInterface terminal) {
        GasStation.terminal = terminal;
        initActionPool();
    }

    public static void main(String[] args) {
        Driver driver = new Driver("Ivanov", "123456");
        new GasStation(new GasTerminal()).startService(driver);
    }

    public void startService(Driver driver) {
        terminal.showMenu(driver);
        UserRequest selectedRequest = userAction.get(terminal.readMessage());
        if (selectedRequest == null) {
            throw new IllegalArgumentException("Неверный код операции");
        }
        selectedRequest.start();
    }

    private void initActionPool() {
        userAction.put(1, new RefuelRequest(Actions.REFUEL.getDescription()));
        userAction.put(2, new PaymentRequest(Actions.PAYMENT.getDescription()));
    }
}


