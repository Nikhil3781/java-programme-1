
//question-1




public class Main {
    interface Addition
    {
        int add(int a,int b);
    }

    interface Subtraction
    {
        int sub(int a,int b);
    }
    interface Multiplication
    {
        int mul(int a,int b);
    }
    interface Division
    {
        int div(int a,int b);
    }

    private int operate(int a,int b,Addition obj1)
    {
        return obj1.add(a,b);
    }

    public int operate1(int a,int b,Subtraction obj2)
    {
        return obj2.sub(a,b);
    }
    public int operate3(int a,int b,Multiplication obj3)
    {
        return obj3.mul(a,b);
    }
    public int operate4(int a,int b,Division obj4)
    {
        return obj4.div(a,b);
    }
    public static void main(String[] args) {
	// write your code here
        Addition myadd =(int x,int y)-> x+y;
        Subtraction mysub=(int x,int y)->x-y;
        Multiplication mymul=(int x,int y)->x*y;
        Division mydiv=(int x,int y)->x/y;
Main m1=new Main();
System.out.println("Addition is  :" +m1.operate(1,2,myadd));
System.out.println("Subtraction is :"+m1.operate1(3,1,mysub));
System.out.println("Multiplication :"+m1.operate3(1,2,mymul));
System.out.println("Division :"+m1.operate4(4,2,mydiv));

    }
}
