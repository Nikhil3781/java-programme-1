//question-4




class circle
{
private double radius=1.0;
private String color="red";
double area;
circle()
{
}
circle(double radius)
{
this.radius=radius;
}

public void getRadius()
{
System.out.println(radius);
}
public void getArea()
{
area=3.14*radius*radius;
System.out.println(area);
}

public static void main(String [] args)
{
circle c1=new circle();
c1.getRadius();
c1.getArea();
}
}

