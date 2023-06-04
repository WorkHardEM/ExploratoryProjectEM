package reflaction.rabbit;

public class Rabbit {

    @Deprecated
    @RabbitAnnotations
    private String rabbitName;

    @Deprecated
    @RabbitAnnotations
    private String rabbitAge;

    public String getRabbitName() {
        return rabbitName;
    }

    public String getRabbitAge() {
        return rabbitAge;
    }
}
