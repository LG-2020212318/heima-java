package day9;

public class Student {
    //1、私有成员变量
    //2、空参构造
    //3、带全部参数的构造方法
    //3、get、set方法
    private int age;
    private String name;
    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
