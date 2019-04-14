package by.belhard.j2.lesson4;

public enum Units {

    KILOS("кг."),
    LITERS("л."),
    PIECES("шт.");

    private String unitsName;

    Units(String unitsName) {
        this.unitsName = unitsName;
    }

    @Override
    public String toString() {
        return unitsName;
    }
}
