public class RefuelRequest extends UserRequest {

    public RefuelRequest(String requestMessage) {
        super(requestMessage);
    }

    @Override
    public String createNotification() {
        return String.format("Машина заправлена на колонке №%s на %sл\n", paramList.get(0), paramList.get(1));
    }
}
