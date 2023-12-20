import java.util.*;
class A
{
    double r;
    void get1(int a)
    {
       a=r;
    }
    void calculate1()
    {
       area=3.14*r*r;
    }
    void display1()
    {
       System.out.println("output:"area);
    }
}
class B extends A
{
    double h;
    void get2(int b)
    {
       b=h;
    }
    void calculate2()
    {
       area=3.14*r*r*h;
    }
    void display2()
    {
       System.out.println("output:"area);
    }
    public static void main(String[] args) 
    {    
        B obj = new B();
        obj.get1();
        obj.get2();
        obj.calculate1();
        obj.calculate2();
        obj.display2();
        obj.display2();
            }
}
