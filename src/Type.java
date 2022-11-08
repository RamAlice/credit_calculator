public enum Type {
    HUMAN("human"),
    BUSINESS("business");

    private final String type;
    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
