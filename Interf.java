package MainClass;

 interface Interf {
     default void m1() {
         System.out.println("Left interface");
     }
 }
 interface Right {
     default void m1() {
         System.out.println("Right interface");
     }
 }
 class MainClass implements Interf,Right
 {
   public void m1()
   {
       System.out.println("override left and rigth");
       Interf.super.m1();
   }
    public static void main(String[] args) {
        MainClass m=new MainClass();



    }


 }
