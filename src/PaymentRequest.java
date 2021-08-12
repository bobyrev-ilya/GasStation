public class PaymentRequest extends UserRequest {

    public PaymentRequest(String requestMessage) {
        super(requestMessage);
    }

    @Override
    public String createNotification() {
        return String.format("Машина заправлена на колонке №%s на %s$\n", paramList.get(0), paramList.get(1));
    }
}
