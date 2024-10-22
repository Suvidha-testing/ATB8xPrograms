package Static;

public class Lab35 {

    public static void main(String[] args) {

        Student s1=new Student(23);
        Student s2=new Student(33);
        System.out.println(s1.age);

        System.out.println(Student.name);

    }


}


class Student {

    int age;
    static String name;

    public Student(int age) {
        this.age = age;
    }


    {
        System.out.println("IIB");
    }

    static
    {

        System.out.println("SIB");
    }
}
