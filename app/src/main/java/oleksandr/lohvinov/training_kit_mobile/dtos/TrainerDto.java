package oleksandr.lohvinov.training_kit_mobile.dtos;

public class TrainerDto {
    private Integer id;
    private String displayName;
    private String email;

    public TrainerDto() {
    }

    public TrainerDto(Integer id, String displayName, String email) {
        this.id = id;
        this.displayName = displayName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
