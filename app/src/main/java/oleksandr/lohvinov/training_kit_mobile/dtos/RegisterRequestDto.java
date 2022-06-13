package oleksandr.lohvinov.training_kit_mobile.dtos;

public class RegisterRequestDto {

    private String name;
    private String lastName;
    private String email;
    private String password;
    private Integer[] organizations;
    private String role = "learner";

    public RegisterRequestDto() {
    }

    public RegisterRequestDto(String name,
                              String lastName,
                              String email,
                              String password,
                              Integer[] organizations,
                              String role) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.organizations = organizations;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer[] getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Integer[] organizations) {
        this.organizations = organizations;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
