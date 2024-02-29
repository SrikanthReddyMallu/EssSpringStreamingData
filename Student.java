package MainClass;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
    String name;
    int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
class MainClasses
{
    public static void main(String[] args)
    {
        Function<Student,String> f= s1->{
            int marks=s1.marks;
            String grade="";
            if(marks>=100) grade="Topper";
            else if(marks>=65) grade="First Class";
            else if(marks>=55) grade="Second Class";
            else if(marks>=45) grade="Third Class";
            else grade="Fail";
            return grade;

        };
           Predicate<Student> p2= s->s.marks>=65;
        Consumer<Student> c=s1->{
            System.out.println("The student name="+s1.name);
            System.out.println("The student marks="+s1.marks);
            System.out.println("The grade is"+f.apply(s1));
        };
//        Student[] p={
//                new Student("srikanth",100),
//                new Student("Upendra",65),
//                new Student("Vishnu",55),
//                new Student("Venkat",45),
//                new Student("Dhamodhar",25),
//        };
        ArrayList<Student> l=new ArrayList<Student>();
        {
            l.add(new Student("srikanth",100));
            l.add( new Student("Upendra",65));
            l.add(new Student("Vishnu",55));
            l.add(new Student("Venkat",45));
            l.add(new Student("Dhamodhar",25));
        }
        for(Student p1:l)
        {
            c.accept(p1);
        }
//        for(Student p1:l)
//        {
//
//            if(p2.test(p1)) {
//                System.out.println("Person name=" + p1.name);
//                System.out.println("Person marks=" + p1.marks);
//                System.out.println("person grade=" + f.apply(p1));
//                System.out.println();
//            }
//        }
    }
}
