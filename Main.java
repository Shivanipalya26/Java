import java.util.Scanner;
class Area
{
    int len,bre,heig,base;
    Scanner sc=new Scanner(System.in);
    public void triangle()
    {
        System.out.println("Enter height and base of traingle:");
        heig=sc.nextInt();
        base=sc.nextInt();
    }
    public void rectangle()
    {
        System.out.println("Enter length and breadth of rectangle:");
        len=sc.nextInt();
        bre=sc.nextInt();
    }
}
class Areaoutput extends Area
{
    void areatriangle()
    {
        System.out.println("Area of triangle:"+((heig*base)/2));
    }
    void arearectangle()
    {
        System.out.println("Area of rectangle:"+(len*bre));
    }
}
class Main
{
    public static void main (String a[])
    {
        Areaoutput ob=new Areaoutput();
        ob.triangle();
        ob.rectangle();
        ob.areatriangle();
        ob.arearectangle();
    }
}