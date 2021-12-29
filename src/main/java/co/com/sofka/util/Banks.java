package co.com.sofka.util;

public enum Banks {
    BBVA("BBVA"),
    BANCOLOMBIA("Bancolombia"),
    COLPATRIA("Colpatria"),
    DAVIVIENDA("Davivienda"),
    CITIBANK("Citibank");

    private final String value;

    public String getValue () {
        return value;
    }

    Banks (String value) {
        this.value = value;
    }
}
