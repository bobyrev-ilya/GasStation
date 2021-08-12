public enum Actions {
    PAYMENT("Введите номер колонки и количество литров"),
    REFUEL("Введите номер колонки и сумму оплаты");

    private final String description;

    Actions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
