package PracticeOnShorts;

public class OOP {
    private String name;
    private int age;
    private char gender;
    private boolean isEmployed;

    public OOP(String name, int age, char gender, boolean isEmployed) {
        setName(name);
        setAge(age);
        setGender(gender);
        setEmployed(isEmployed);
    }

    public String toString() {
        return "OOP{" +
                "Name = " + getName() + '\'' +
                ", Age = " + getAge() +
                ", Gender = " + getGender() +
                ", Is employed = " + isEmployed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            throw new NullPointerException("Name can not be null");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( !(age >= 0 || age <= 120)){
            throw new RuntimeException("Age can not be negative or over hundred and twenty");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {

        isEmployed = employed;
    }
}
