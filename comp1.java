
//question-5



import java.util.*;
 class ComplexNumber{
   //for real and imaginary parts of complex numbers
   double real, img;
	
   //constructor to initialize the complex number
   ComplexNumber(double r, double i){
	this.real = r;
	this.img = i;
   }
	
   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
   {
	//creating a temporary complex number to hold the sum of two numbers
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        
        //returning the output complex number
        return temp;
    }
public static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2)
   {
	//creating a temporary complex number to hold the sum of two numbers
        ComplexNumber temp1 = new ComplexNumber(0, 0);

        temp1.real = c1.real - c2.real;
        temp1.img = c1.img - c2.img;
        
        //returning the output complex number
        return temp1;
    }
public static ComplexNumber mul(ComplexNumber c1, ComplexNumber c2)
   {
	//creating a temporary complex number to hold the sum of two numbers
        ComplexNumber temp2 = new ComplexNumber(0, 0);

        temp2.real = c1.real * c2.real;
        temp2.img = c1.img * c2.img;
        
        //returning the output complex number
        return temp2;
    }

    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     double a=sc.nextDouble();
     double b=sc.nextDouble();
     double c=sc.nextDouble();
     double d=sc.nextDouble();
	ComplexNumber c1 = new ComplexNumber(a,b);
	ComplexNumber c2 = new ComplexNumber(c,d);
        ComplexNumber temp = sum(c1, c2);
ComplexNumber temp1 = sub(c1, c2);
  ComplexNumber temp2=mul(c1,c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
         System.out.printf("Sub is: "+ temp1.real+" + "+ temp1.img +"i");
 System.out.printf("Mul is: "+ temp2.real+" + "+ temp2.img +"i");

    }
}
