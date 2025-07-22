public class Student {

    //constructor = a special method within a class

    String name = "Spongebob";
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        this.name = name; // this refers to the object we are constructing
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }

}
