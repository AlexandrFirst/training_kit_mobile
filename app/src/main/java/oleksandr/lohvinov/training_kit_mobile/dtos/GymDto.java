package oleksandr.lohvinov.training_kit_mobile.dtos;

public class GymDto {
    private Integer id;
    private String title;
    private String address;

    public GymDto() {
    }

    public GymDto(Integer id, String title, String address) {
        this.id = id;
        this.title = title;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
