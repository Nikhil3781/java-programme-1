
//question-7




import java.util.Scanner;
import java.util.*;
 class Traingle
{
int a,b,c;
double area;
int  s;
public void area(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;
//height=Math.sqrt(c*2-(a/2)*2);
s=(a+b+c)/(2);
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("AREA OF TRAINGLE :"+area);
//System.out.println(s);
}
}

class A{

public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
Traingle a1=new Traingle();
a1.area(a,b,c);
}
}


