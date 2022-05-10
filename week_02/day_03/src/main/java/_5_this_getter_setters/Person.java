package _5_this_getter_setters;

public class Person {
    //characteristics
    private String name;
    private String mobile;
    private int age;

    public Person(String name, String mobile, int age) {
        this.name = name;
        this.mobile = mobile;
        this.age = age;
    }

    //command + N, getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", age=" + age +
                '}';
    }
}
