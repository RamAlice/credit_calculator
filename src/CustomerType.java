public enum CustomerType {
    HUMAN("human"),
    BUSINESS("business");

    private final String type;
    CustomerType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
