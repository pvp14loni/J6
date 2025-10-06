package Slip1;

import java.util.Scanner;

abstract class Order{
	int id;
	String des;
	abstract void accept();
	abstract void display();
	
	
}
class Purchase extends Order
{
	String c_name;

	@Override
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cust name");
		 c_name=sc.next();
	}

	@Override
	void display() {
		System.out.println(" Customer name"+ c_name);
		// TODO Auto-generated method stub
		
	}
}
class Sale extends Order{
	String v_name;
	Scanner sc = new Scanner(System.in);
	@Override
	void accept() {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter vendor name");
		 v_name=sc.next();
			
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Vendor name "+v_name);
	}
	
}

public class Slip6_2 {

	public static void main(String[] args) {
		Purchase p[]=new Purchase[2];
//		p[0].accept();
//		p[0].display();
//		p[1].accept();
//		p[1].display();
//		p[2].accept();
//		p[2].display();
		p[0]=new Purchase();
		p[0].accept();
		p[0].display();
		

	}

}
