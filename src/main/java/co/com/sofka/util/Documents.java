package co.com.sofka.util;

public enum Documents {
    ID_DOCUMENTS("14566546723"),
    PASSPORT("APC1630165");

    private final String value;

    public String getValue () {
        return value;
    }

    Documents (String value) {
        this.value = value;
    }
}
