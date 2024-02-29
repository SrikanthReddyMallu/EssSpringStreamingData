package MainClass;

import java.util.function.Supplier;
import java.util.Date;
public class SystemDate
{
    public static void main(String[] args)
    {
        Supplier<String> s=()->{
            String otp="";
            for (int i=0;i<2;i++)
            {
                otp=otp+(int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println(s.get());
    }
}
