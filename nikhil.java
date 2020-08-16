

//question-2





// Base class
import java.util.Scanner;
class Rectangle
{
int width,height;

public void display(int width,int height)
{
this.width=width;
this.height=height;
System.out.println(width+" "+height);

}
}
//derived class

class RectangleArea extends Rectangle
{
double area;
public void display()
{
double c=super.width;
double d=super.height;
area=c*d;

System.out.println("Area:"+area);

}

public static void main(String [] args)
{
 
Scanner sc=new Scanner(System.in);
int a,b;

a=sc.nextInt();
b=sc.nextInt();
RectangleArea r1=new RectangleArea();
r1.display(a,b);
//double c=sc.nextDouble();
//double d=sc.nextDouble();

r1.display();


}
}


