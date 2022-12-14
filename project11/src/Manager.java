public class Manager extends Worker{
    private String status;

    public Manager(String name, int age, String position, double wage, String status) {
        super(name, age, position, wage);
        this.status = status;
    }



    @Override
    public String toString() {
        return "Manager{" +
                " name=" + getName() +
                ", age=" + getAge() +
                ", position=" + getPosition() +
                ", wage =" + getWage() +
                ", status='" + status + '\'' +
                '}';
    }
}
