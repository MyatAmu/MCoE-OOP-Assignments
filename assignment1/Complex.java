package assignment1;
import java.util.Scanner;

public class Complex{

	double real;
    double imag;                         //INSTANCE VARIABLES

    Complex(){

        double real=0;
        double imag=0;                     // DEAFULT VARIABLES
    }

    Complex(double real,double imag){

        this.real=real;
        this.imag=imag;
    }

    public static Complex add(Complex r1,Complex r2){

        Complex temp=new Complex(0,0);
        temp.real=r1.real+r2.real;
        temp.imag=r1.imag+r2.imag;
        return temp;
    }

    public static Complex sub(Complex r1,Complex r2){

        Complex temp=new Complex(0,0);
        temp.real=r1.real-r2.real;
        temp.imag=r1.imag-r2.imag;
        return temp;
    }

    public static Complex mul(Complex r1,Complex r2){

        Complex temp=new Complex(0,0);
        temp.real=(r1.real*r2.real)+(r1.imag*r2.imag*(-1));
        temp.imag=(r1.imag*r2.real)+(r1.real*r2.imag);
        return temp;
    }

    public static Complex div(Complex r1,Complex r2){

        Complex temp=new Complex(0,0);
        double z=((r2.real*(r2.real))+(r2.imag*(r2.imag)));
        temp.real=(((r1.real*r2.real)+(r1.imag*r2.imag))/z);
        temp.imag=(((r1.imag*r2.real)-(r1.real*r2.imag))/z);
        return temp;
    }

    public void show(){

        System.out.println(this.real+"+("+this.imag+")i");
    }


    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        Complex temp;
        
        while(true){
        	System.out.println("Enter real part of 1st no.");
        	float n1=sc.nextFloat();
        	System.out.println("Enter imaginary part of 1st no.");
        	float n2=sc.nextFloat();
        	Complex c1=new Complex(n1,n2);
        	System.out.println("Enter real part of 2nd no.");
        	float m1=sc.nextFloat();
        	System.out.println("Enter imaginary part of 2nd no.");
        	float m2=sc.nextFloat();
        	Complex c2=new Complex(m1,m2);
        
        	System.out.println("Enter ur choice");
        	System.out.println("1=Addition");
        	System.out.println("2=Subtraction");
        	System.out.println("3=Multiplition");
        	System.out.println("4=Division");
        	int a=sc.nextInt();
        
        	if(a==1){

        		temp=add(c1,c2);
        		temp.show();
            }

            else if(a==2){

                temp=sub(c1,c2);
                temp.show();
            }

            else if(a==3){
            	
            	temp=mul(c1,c2);
            	temp.show();
            }

            else if(a==4){

                temp=div(c1,c2);
                temp.show();
            }

            else{

                System.out.println("WRONG CHOICE");
            }

                  

            System.out.println("Do you want to start again???  Type 1=Yes and 0=No");
            int b=sc.nextInt();
            if(b==1){

            	continue;
            }

            else if(b==0){

                System.out.println("THANK YOU!!");
                break;
            }

            else{

                System.out.println("OOPS WRONG CHOICE");
                System.out.println("Here we go again");
            }
        }
    }
}
