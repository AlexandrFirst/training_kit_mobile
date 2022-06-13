package oleksandr.lohvinov.training_kit_mobile.dtos;

public class CharacteristicDto {
    private Integer id;
    private String title;
    private String type;

    public CharacteristicDto() {
    }

    public CharacteristicDto(Integer id, String title, String type) {
        this.id = id;
        this.title = title;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
