package assignment4;
import java.util.Scanner; 

abstract class shape{
	double val1;
	double val2;


    void input() {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Base : ");
	    val1 = scan.nextDouble();
	    System.out.println("Enter Height : ");
	    val2 = scan.nextDouble();
    }
    
    void ip() {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter Length : ");
	    val1 = scan.nextDouble();
	    System.out.println("Enter Breadth : ");
	    val2 = scan.nextDouble();
    }
    abstract void area();
}

class triangle extends shape{
	void area() {
		double area;
		area = 0.5*val1*val2;
		System.out.println("Area of Triangle is : "+area);
	}
}

class rectangle extends shape{
	void area() {
		double area;
		area = val1*val2;
		System.out.println("Area of Rectangle is : "+area);
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int ch;
	    boolean k = true;
	    Scanner sc = new Scanner (System.in);
	    do {
	    	System.out.println("***********************************");
	    	System.out.println("Choose shape for area calculation : \n1.Triangle  \n2.Rectangle  \n3.EXIT");
	    	System.out.println("Enter the Choice : ");
                ch = sc.nextInt();
	    	switch(ch) {
	    	case 1 :
	    		shape s1 = new triangle();
	    		s1.input();
	    		s1.area();
	    		break;
	    		
	    	case 2 :
	    		shape s2 = new rectangle();
	    		s2.ip();
	    		s2.area();
	    		break;
	    		
	    	case 3 :
	    		k =false;
	    		System.out.println("EXIT SUCCESSFUL");
	    		break;
	    	}
	    }while(k);
	    k = true;
	}
}