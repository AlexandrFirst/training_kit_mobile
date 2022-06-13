package oleksandr.lohvinov.training_kit_mobile.dtos;

public class AbonementLearnerDto {

    private Integer id;
    private Integer trainingsLeft;
    private Integer daysLeft;

    public AbonementLearnerDto() {
    }

    public AbonementLearnerDto(Integer id, Integer trainingsLeft, Integer daysLeft) {
        this.id = id;
        this.trainingsLeft = trainingsLeft;
        this.daysLeft = daysLeft;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrainingsLeft() {
        return trainingsLeft;
    }

    public void setTrainingsLeft(Integer trainingsLeft) {
        this.trainingsLeft = trainingsLeft;
    }

    public Integer getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(Integer daysLeft) {
        this.daysLeft = daysLeft;
    }
}
