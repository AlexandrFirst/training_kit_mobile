package oleksandr.lohvinov.training_kit_mobile.dtos;

public class AbonementDto {

    private Integer id;
    private String title;
    private Integer price;
    private Integer amountDays;
    private Integer amountTrainings;

    public AbonementDto() {
    }

    public AbonementDto(Integer id, String title, Integer price, Integer amountDays, Integer amountTrainings) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.amountDays = amountDays;
        this.amountTrainings = amountTrainings;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAmountDays() {
        return amountDays;
    }

    public void setAmountDays(Integer amountDays) {
        this.amountDays = amountDays;
    }

    public Integer getAmountTrainings() {
        return amountTrainings;
    }

    public void setAmountTrainings(Integer amountTrainings) {
        this.amountTrainings = amountTrainings;
    }
}
