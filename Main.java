package MainClass;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Main
{
   public String name;
   public double salary;

    public Main(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
 class EmpMain
{
    public static void main(String[] args)
    {
        ArrayList<Main> l=new ArrayList<Main>();
        l.add(new Main("srikanth",2000));
        l.add(new Main("sumanth",4000));
        l.add(new Main("venky",1000));
        l.add(new Main("Srinu",8000));
        l.add(new Main("suresh",10000));
        BiConsumer<Main,Double> c=(e,d)->e.salary=e.salary+d;
        for(Main l1:l)
        {
            c.accept(l1,500.0);
        }
        for(Main l1:l)
        {
            System.out.println("Employee name="+l1.name);
            System.out.println("Employee salary="+l1.salary);
            System.out.println();
        }
    }
}
