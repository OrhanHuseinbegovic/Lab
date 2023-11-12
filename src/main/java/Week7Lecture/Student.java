package Week7Lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    private int age;
    private String name;
    private int gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public Student(String name, int gpa, int age) {
        this.name = name;
        this.gpa = gpa;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name: ".concat(this.name).concat(" GPA: ").concat(String.valueOf(this.gpa)).concat(" AGE: ".concat(String.valueOf(this.age))).concat("\n");
    }

    @Override
    public int compareTo(Student student){
        if(this.age == student.getAge()){
            return 0;
        }
        else if(this.age>student.getAge()) {
            return 1;
        }
        return -1;
    }
}

class StartMeUp{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Becir",8,88));
        students.add(new Student("Beciraga",6,70));
        students.add(new Student("Becirbeg",9,15));

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);

    }
}