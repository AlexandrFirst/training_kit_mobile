package oleksandr.lohvinov.training_kit_mobile.auth_models;

public class UserCredentials {
    private String authToken;

    public UserCredentials() {
    }

    public UserCredentials(String authToken) {
        this.authToken = authToken;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
