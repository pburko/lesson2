package by.belhard.j2.lesson4;

public enum FreshStatus {
    FRESH("Свежий"),
    NOT_FRESH("Не свежий");

    private String FreshStatusName;

    FreshStatus(String FreshStatusName) {
        this.FreshStatusName = FreshStatusName;
    }

    @Override public String toString() {
        return FreshStatusName;
    }
}
