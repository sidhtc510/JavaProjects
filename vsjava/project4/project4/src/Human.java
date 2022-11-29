public class Human {
    String name;
    int age;
    int child;

    public Human(String name, int age, int child) {
        this.name = name;
        this.age = age;
        this.child = child;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChild(){return child;}

    public void setChild(int child) {
        this.child = child;
    }

}
