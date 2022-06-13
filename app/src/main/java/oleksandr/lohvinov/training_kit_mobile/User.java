package oleksandr.lohvinov.training_kit_mobile;

public class User {

    private static User user = null;

    public static User Instance() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    private User() {

    }



}
