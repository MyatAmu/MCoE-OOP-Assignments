package assignment3;
import java.util.Scanner;

class Emp {
	String name;
	String ID;
	String address;
	int mobile;
	String email;
	double basic;
	double gross;
	double hra;
	double da;
	double net;
	double pf;
	double sf;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		name = scan.nextLine();
		System.out.println("Please enter your company ID");
		ID = scan.nextLine();
		System.out.println("Please enter your current address");
		address = scan.nextLine();
		System.out.println("Please enter your mobile number");
		mobile = scan.nextInt();
		System.out.println("Please enter your email id");
		email = scan.nextLine();
		System.out.println("Please enter your Basic Pay");
		basic = scan.nextDouble();
	}
	
	public void display() {
		System.out.println("The input information is :");
		System.out.println("NAME : "+name);
		System.out.println("ID : "+ID);
		System.out.println("MOBILE NO. : "+mobile);
		System.out.println("EMAIL ID : "+email);
		System.out.println("ADDRESS : "+address);
	}
	
	public void salary() {
		da = 0.097*basic;
		hra = 0.10*basic;
		pf = 0.12*basic;
		sf = 0.001*basic;
		gross = da + hra + basic;
		net = gross - (pf+sf);
		System.out.println("Your Net Salary is : "+net);
	}
}

class Programmer extends Emp{
	Programmer(){
		super();
	}
}

class TeamLead extends Emp{
	TeamLead(){
		super();
	}
}

class AsstManager extends Emp{
	AsstManager(){
		super();
	}
}

class Manager extends Emp{
	Manager(){
		super();
	}
}

class Employee{
	public static void main(String[]args) {
		int x;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number corresponding to your position in the company");
		System.out.println("1. Manager");
		System.out.println("2. Assistant Manager");
		System.out.println("3. Team Leader");
		System.out.println("4. Programmer");
		System.out.println("5. Exit");
		x = scan.nextInt();
		switch(x){
			case(1):{
				System.out.println("You have selected Manager");
				Manager m1 = new Manager();
				m1.input();
				m1.display();
				m1.salary();
				break;
			}
			case(2):{
				System.out.println("You have selected Assistant Manager");
				AsstManager m2 = new AsstManager();
				m2.input();
				m2.display();
				m2.salary();
				break;
			}
			case(3):{
				System.out.println("You have selected Team Leader");
				TeamLead tl = new TeamLead();
				tl.input();
				tl.display();
				tl.salary();
				break;
			}
			case(4):{
				System.out.println("You have selected Programmer");
				Programmer p1 = new Programmer();
				p1.input();
				p1.display();
				p1.salary();
				break;
			}
			case(5):{
				System.out.println("END");
				break;
			}
		}
	}
}