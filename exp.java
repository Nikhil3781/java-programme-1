
//question-8





import java.util.Scanner;

class OnlyNumbers extends Exception 
{
OnlyNumbers(String s)
{
super (s);
}
}
class A
{


int b;
public static void check(int a) throws OnlyNumbers
{

if(a.isNum())
{
System.out.println((2/3)*a);

}
else 
{
throw new OnlyNumbers("Entered input is a String");
}
}
public static void main(String [] args)
{
try
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
check(a);
}
catch(Exception e)
{
System.out.println("exception occured");
}
}
}