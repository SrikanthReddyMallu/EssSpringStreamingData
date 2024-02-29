package MainClass;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConMain
{
    public String name;
    public double salary;

    public BiConMain(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
class BiConMains
{
    public static void main(String[] args)
    {
        ArrayList<BiConMain> l=new ArrayList<BiConMain>();
        l.add(new BiConMain("srikanth",2000));
        l.add(new BiConMain("sumanth",4000));
        l.add(new BiConMain("venky",1000));
        l.add(new BiConMain("Srinu",8000));
        l.add(new BiConMain("suresh",10000));
        BiConsumer<BiConMain,Double> c=(e, d)->e.salary=e.salary+d;
        for(BiConMain l1:l)
        {
            c.accept(l1,500.0);
        }
        for(BiConMain l1:l)
        {
            System.out.println("Employee name="+l1.name);
            System.out.println("Employee salary="+l1.salary);
            System.out.println();
        }
    }
}
