//Figure class as Questioned
abstract class  Figure{
	double dim1;

	abstract void findArea(); 
	abstract void findPerimeter(); 
	
}

//Circle class Extends the figure class 
class Circle extends Figure{
	
	//parameterized constructor of circle class req circle radius 
	public Circle(double rad){
		dim1= rad;
		System.out.println("Circle :");
		System.out.println("Circle with Radius :"+dim1);
	}
	
	//implement the abstract method of Figure class for finding area
	void findArea() {
		
		System.out.println("Area of circle :"+3.14*dim1*dim1);
	}

	//implement the abstract method of Figure class for finding parameter
	void findPerimeter() {
		
		System.out.println("parameter of circle :"+2*3.14*dim1);
		System.out.println();
	}
	
}

//rectangle class extending figure class 
class Rectangle extends Figure{
	 double dim2;
	
	 //parameterized Constructor of rectangle class having parameter length and breadth
	 public Rectangle(double len,double bre){
		 dim1=len;
		 dim2=bre;
		 System.out.println("Rectangle :");
		 //printing the details of rectangle 
		 System.out.println("Rectangle with length :"+len+" breadth :"+bre);
	 }
	
	//implement the abstract method of Figure class for finding area
	void findArea() {
		System.out.println("Area Rectangle :"+dim1*dim2);
		
	}

	//implement the abstract method of Figure class for finding parameter of rectangle
	void findPerimeter() {
		
		System.out.println("Parameter of rectangle :"+2*(dim1+dim2));
		System.out.println();
	}
	
}

//Triangle class extends Figure class
class Triangle extends Figure{
	
	double dim2;
	double dim3;
	 
	//Parameterized constructor of triangle class takes parameter of different sides 
	public Triangle(double side1,double side2,double side3){
		dim1=side1;
		dim2=side2;
		dim3=side3;
		System.out.println("Triangle :");
		//print the details of a traingle
		System.out.println("Triangle with sides :"+side1+" - "+side2+" - "+side3);
		
	}

	//implement the abstract method of Figure class for finding area
	void findArea() {
		
		//calculating the semi-parameter of  the triangle using sides of triangle
		 double semiper = (dim1+dim2+dim3)/2;
		 
		 //using this semi-parameter calculating the area of triangle
		 double area = Math.sqrt(semiper*(semiper - dim1 )*( semiper-dim2 )*( semiper - dim2));
		 System.out.println("Area of the Triangle :"+area);
		 
		 
	}

	//implement the abstract method of Figure class for finding parameter
	void findPerimeter() {
		double par= dim1+dim2+dim3;
		System.out.println("Perimeter of the traingle is :"+par);
		System.out.println();
		
	}
	
}

public class AsignFiveOne {

	public static void main(String[] args) {
	
	//creating the object of circle class 
	Circle cri = new Circle(6);
	//calling the findarea method to calculate the area of circle
	cri.findArea();
	//calling the findparameter method using the cricle object  to calculae the parameter of circle
	cri.findPerimeter();
	
	//creating the object of rectangle class 
	Rectangle rec= new Rectangle(6,4);
	//calling the findarea method to calcuate the area of rectangle 
	rec.findArea();
	//calling the findparameter method uisg the rectangle class object to calculate the parameter 
	rec.findPerimeter();
	
	//creating the object of traingle class
	Triangle tri = new Triangle(5,6,4);
	//calling the findarea method with object of traingle class
	tri.findArea();
	//calling the findparameter method with object of triangle class
	tri.findPerimeter();
	
	
	
	
	
	
	

	}

}
