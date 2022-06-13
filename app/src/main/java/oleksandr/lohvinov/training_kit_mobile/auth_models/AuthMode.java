package oleksandr.lohvinov.training_kit_mobile.auth_models;

public enum AuthMode {
    LOGIN(0),
    REGISTRATION(1);

    private final int value;

    private AuthMode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
