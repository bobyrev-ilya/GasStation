import java.util.List;

public abstract class UserRequest {
    private String requestMessage;
    protected List<Integer> paramList;

    public UserRequest(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public void start(){
        GasStation.terminal.requestParameters(requestMessage);
        paramList = GasStation.terminal.readParameters();
        GasStation.terminal.sendNotification(createNotification());
    }

    public abstract String createNotification();
}
