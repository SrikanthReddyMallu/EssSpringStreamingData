package MainClass;

import java.util.function.Function;
import java.util.function.Predicate;

public class Person {
    String name;
    int marks;
    public Person(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
class main
{
    public static void main(String[] args)
    {
        Function<Person,String> f=s1->{
            int marks=s1.marks;
            String grade="";
            if(marks>=100) grade="Topper";
            else if(marks>=65) grade="First Class";
            else if(marks>=55) grade="Second Class";
            else if(marks>=45) grade="Third Class";
            else grade="Fail";
            return grade;

        };
     //   Predicate<Person> p2=s->s.marks>=65;
        Person[] p={
                new Person("srikanth",100),
                new Person("Upendra",65),
                new Person("Vishnu",55),
                new Person("Venkat",45),
                new Person("Dhamodhar",25),
        };
        for(Person p1:p)
        {
               System.out.println("Person name=" + p1.name);
               System.out.println("Person marks=" + p1.marks);
               System.out.println("person grade=" + f.apply(p1));
//            if(p2.test(p1)) {
//                System.out.println("Person name=" + p1.name);
//                System.out.println("Person marks=" + p1.marks);
//                System.out.println("person grade=" + f.apply(p1));
//            }
        }
    }
}

