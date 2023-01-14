public class Teacher extends Worker{

    private int courseQuantity;


    public Teacher(String name, int age, String position, double wage) {
        super(name, age, position, wage);



    }

    @Override
    public String toString() {
        return "Teacher{" +
                " name = " + super.getName()+
                "courseQuantity=" + courseQuantity +
                '}';
    }
}
