package co.com.sofka.util;

public enum Phone {
    FIRST_NUMBER("3003003030"),
    SECOND_NUMBER("3089995045");

    private final String value;

    public String getValue () {
        return value;
    }

    Phone (String value) {
        this.value = value;
    }
}
