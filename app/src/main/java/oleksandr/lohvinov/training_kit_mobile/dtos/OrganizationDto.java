package oleksandr.lohvinov.training_kit_mobile.dtos;

public class OrganizationDto {
    private Integer id;
    private String title;
    private String logo;

    public OrganizationDto() {
    }

    public OrganizationDto(Integer id, String title, String logo) {
        this.id = id;
        this.title = title;
        this.logo = logo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
