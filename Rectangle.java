import java.util.Scanner;
public class Rectangle {
	String color;
	int width;
	int height;
	public Rectangle()
	{
		width=5;
		height=5;
		color="black";
	}
	public Rectangle(int w,int h,String c)
	{
		this.width=w;
		this.height=h;
		this.color=c;
	}
	// Copy Constructor
	public Rectangle(Rectangle r) {
		this.width=r.width;
		this.height=r.height;
		this.color=r.color;
	}
	// Changes the color of the rectangle by taking a parameter and prints out messages
	public void changeColor(String c) {
		this.color=c;
		System.out.println("New Color Is "+color);
	}
	// Changes the color of the rectangle by taking an input and prints out messages
	public void changeColor() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A New Color:");
		color=s.next();
		System.out.println("Color Has Changed.");
		System.out.println("New Color Is "+color);
	}
	// Swaps the colors of the rectangles
	public static void swap(Rectangle r1, Rectangle r2) {
		String tmp;
		tmp=r1.color;
		r1.color=r2.color;
		r2.color=tmp;
	}
	// Prints out whether two rectangles are equal or not
	// For rectangles to be equal their dimensions and colors should be the same
	public void equals(Rectangle r) {
		if (this.width==r.width&&this.height==r.height&&this.color==r.color)
		{
			System.out.println("These two rectangles are equal.");
		}
		else
		{
			System.out.println("These two rectangles are not equal.");
		}
	}
	// Returns a string which includes dimensions and color of a rectangle
	public String toString() {
		return "Width ="+width+", Height ="+height+", Color ="+color;
	}
	
	public static void main(String[] args) {
		Rectangle rectangle1=new Rectangle();
		Rectangle rectangle2=new Rectangle(rectangle1);
		rectangle1.equals(rectangle2);
		rectangle2.changeColor();
		rectangle1.equals(rectangle2);
		Rectangle rectangle3=new Rectangle(10,10,"cyan");
		Rectangle rectangle4=new Rectangle(6,5,"blue");
		rectangle4.changeColor();
		swap(rectangle3, rectangle4);
		System.out.println("Rectangle 3:"+rectangle3.toString());
		System.out.println("Rectangle 4:"+rectangle4.toString());
		
	}

}
