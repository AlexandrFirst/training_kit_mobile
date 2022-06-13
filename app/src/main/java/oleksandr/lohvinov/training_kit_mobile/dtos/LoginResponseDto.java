package oleksandr.lohvinov.training_kit_mobile.dtos;

public class LoginResponseDto {

    private Integer id;
    private String displayName;
    private String email;
    private OrganizationDto[] organizations;
    private TrainerDto[] trainers;
    private String role;
    private GymDto[] gyms;
    private CharacteristicDto[] characteristics;
    private String level;
    private String lang;
    private AbonementDto[] abonements;
    private AbonementLearnerDto[] learnerAbonements;

    public LoginResponseDto() {
    }

    public LoginResponseDto(Integer id, String displayName, String email, OrganizationDto[] organizations, TrainerDto[] trainers,
                            String role, GymDto[] gyms, CharacteristicDto[] characteristics, String level, String lang,
                            AbonementDto[] abonements, AbonementLearnerDto[] learnerAbonements) {
        this.id = id;
        this.displayName = displayName;
        this.email = email;
        this.organizations = organizations;
        this.trainers = trainers;
        this.role = role;
        this.gyms = gyms;
        this.characteristics = characteristics;
        this.level = level;
        this.lang = lang;
        this.abonements = abonements;
        this.learnerAbonements = learnerAbonements;
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

    public OrganizationDto[] getOrganizations() {
        return organizations;
    }

    public void setOrganizations(OrganizationDto[] organizations) {
        this.organizations = organizations;
    }

    public TrainerDto[] getTrainers() {
        return trainers;
    }

    public void setTrainers(TrainerDto[] trainers) {
        this.trainers = trainers;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public GymDto[] getGyms() {
        return gyms;
    }

    public void setGyms(GymDto[] gyms) {
        this.gyms = gyms;
    }

    public CharacteristicDto[] getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(CharacteristicDto[] characteristics) {
        this.characteristics = characteristics;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public AbonementDto[] getAbonements() {
        return abonements;
    }

    public void setAbonements(AbonementDto[] abonements) {
        this.abonements = abonements;
    }

    public AbonementLearnerDto[] getLearnerAbonements() {
        return learnerAbonements;
    }

    public void setLearnerAbonements(AbonementLearnerDto[] learnerAbonements) {
        this.learnerAbonements = learnerAbonements;
    }
}
