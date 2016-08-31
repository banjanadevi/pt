interface I1
{
abstract double getArea();
abstract double getPerimeter();
}
abstract class shape
{

	protected String color;
	protected boolean filled; 
	public shape()
		{
			color="";
			filled=true;
		}
	public shape(String color,boolean filled)
		{
			this.color=color;
			this.filled=filled;
		}
	public String getColor()
		{
			return color;
		}
	public void setColor(String color)
		{
			this.color=color;
		}
	public boolean isFilled()
		{
			return filled;
		}
	public void setFilled(boolean filled)
		{
			this.filled=filled;
		}
	abstract String toString();
		
}
class circle extends shape implements I1
{
	protected double radius;
	public circle()
		{
			radius=1.0;
			color="";
			filled=true;
		}
	public circle(double radius)
		{
			this.radius=radius;
		}
	public circle(double radius,String color,boolean filled)
		{
			this.radius=radius;
			super.color=color;
			super.filled=filled;
		}
	public double getRadius()
		{
			return radius;
		}
	public void setRadius(double radius)
		{
			this.radius=radius;
		}
		public double getArea()
		{
			double a;
			a=3.14*(radius*radius);
			return a;
		}
		public double getPerimeter()
		{
			double p;
			p=2.0*(3.14*radius);
			return p;
		}
}
class rectangle extends shape implements I1
{
	protected double width,length;
	public rectangle()
		{
			width=1.0;
			length=1.0;
			filled=true;
			color="";
		}
	public rectangle(double width,double length)
		{
			this.width=width;
			this.length=length;
		}
	public rectangle(double width,double length,String color,boolean filled)
		{
			this.width=width;
			this.length=length;
			super.color=color;
			super.filled=filled;
		}
		public double getWidth()
		{
			return width;
		}
	public void setWidth(double width)
		{
			this.width=width;
		}
	public double getLength()
		{
			return length;
		}
	public void setLength(double length)
		{
			this.length=length;
		}
	public double getArea()
		{
			double a;
			a=length*width;
			return a;
		}
	public double getPerimeter()
		{
			double p;
			p=2.0*(length+width);
			return p;
		}
}
class square extends rectangle
{
	public square()
		{
			length=1.0;
			width=1.0;
			filled=true;
			color="";
		}
	public square(double side)
		{
			length=side;
			width=side;
		}
	public square(double side,String color,boolean filled)
		{
			this.color=color;
			this.filled=filled;
			length=side;
			width=side;
		}
	public void setSide(double side)
		{
			length=side;
			width=side;
		}
	public double getSide()
		{
			return length;
		}
	public void setWidth(double side)
		{
			width=side;
			length=side;
		}
	public void setLength(double side)
		{
			width=side;
			length=side;
		}
}


public class ShapeDriver
{
public static void main(String args[])
{
circle c1=new circle();
System.out.println("area of circle is+" "+c1.getArea());
System.out.println("perimeter of circle is+" "+c1.getPerimeter());

c1.setColor("yellow");
c1.setFilled(true);
System.out.println("after setting length and width of circle");
System.out.println("area of circle is+" "+c1.getColor());
System.out.println("area of circle is+" "+c1.getArea());
System.out.println("perimeter of circle is+" "+c1.getPerimeter());


circle c2=new circle(5.0);
System.out.println("area of circle is+" "+c2.getArea());
System.out.println("perimeter of circle is+" "+c2.getPerimeter());
circle c3=new circle(5.0,"green",true);
System.out.println("area of circle is+" "+c3.getArea());
System.out.println("perimeter of circle is+" "+c3.getPerimeter());


rectangle r1=new rectangle();
System.out.println("length of rectangle is+" "+r1.getLength());
System.out.println("width of rectangle is+" "+r1.getWidth());
System.out.println("area of rectangle is+" "+r1.getArea());
System.out.println("perimeter of rectangleis+" "+r1.getPerimeter());

r1.setLength(2.0);
r1.setWidth(3.0)
System.out.println("after setting length and width of rectangle");
System.out.println("length of rectangle is+" "+r1.getLength());
System.out.println("width of rectangle is+" "+r1.getWidth());
System.out.println("area of rectangle is+" "+r1.getArea());
System.out.println("perimeter of rectangleis+" "+r1.getPerimeter());

rectangle r2=new rectangle(3.0,2.0);
System.out.println("length of rectangle is+" "+r2.getLength());
System.out.println("width of rectangle is+" "+r2.getWidth());
System.out.println("area of rectangle is+" "+r2.getArea());
System.out.println("perimeter of rectangleis+" "+r2.getPerimeter());

rectangle r3=new rectangle(3.0,2.0,"yellow",true);
System.out.println("length of rectangle is+" "+r3.getLength());
System.out.println("width of rectangle is+" "+r3.getWidth());
System.out.println("area of rectangle is+" "+r3.getArea());
System.out.println("perimeter of rectangleis+" "+r3.getPerimeter());

square s1=new square();
System.out.println("area of rectangle is+" "+s1.getArea());
System.out.println("perimeter of rectangleis+" "+s1.getPerimeter());
System.out.println("length of rectangle is+" "+s1.getLength());
System.out.println("width of rectangle is+" "+s1.getWidth());


square s2=new square(5.0);
s2.setLength(2.0);
s2.setWidth(3.0);
System.out.println("area of rectangle is+" "+s2.getArea());
System.out.println("perimeter of rectangleis+" "+s2.getPerimeter());
System.out.println("length of rectangle is+" "+s2.getLength());
System.out.println("width of rectangle is+" "+s2.getWidth());

square s3=new square(5.0,"green",true);
s3.setLength(2.0);
s3.setWidth(3.0);
System.out.println("area of rectangle is+" "+s3.getArea());
System.out.println("perimeter of rectangleis+" "+s3.getPerimeter());
System.out.println("length of rectangle is+" "+s3.getLength());
System.out.println("width of rectangle is+" "+s3.getWidth());

}
}
