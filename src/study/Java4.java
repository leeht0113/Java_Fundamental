package study;

import java.util.ArrayList;

public class Java4 {
	String name;
	double height;
	
	//encapsulation
	//name에 대한 setter
	public void setName(String name) {
		this.name = name;
	}
	
	//name에 대한 getter
	public String getName() {
		return name;
	}
	
	//height에 대한 setter
	public void setHeight(double height) {
		this.height = height;
	}
	
	//height에 대한 getter
	public double getHeight() {
		return height;
	}
	
	
	Java4(String name, double height) {   //new Java 4가 생성자를 호출
		this.name = name;
		this.height = height;
	}
	
	Java4(String name) {
		this.name = name;
	}
	
	Java4() {
		
	}
	
	
	public int plus(int first, int second) {
		
		return first + second;
	}
	
	public void print() {
		System.out.println(name + "," + height);
	}
	//오버로딩
	public void print(String msg) {
		System.out.println(msg);
	}
	public void print(int msg) {
		System.out.println(msg);
	}
	
	public ArrayList<Customer> list(){
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(new Customer("성영한1"));
		list.add(new Customer("성영한2"));
		list.add(new Customer("성영한3"));
		list.add(new Customer("성영한4"));
		
		return list;
	}
	
	public static void main(String[] args) {
		Java4 j = new Java4();
		ArrayList<Customer> list = new Java4().list(); //ArrayList는 메인에서 주로 호출
		
		for(Customer cust : list) {
			System.out.println(cust.name);
		}
		
		
		Java4 j1 = new Java4("a1",170.2); //객체 선언
		//j1.name = "a1";			//객체 선언
		//j1.height = 170.2;
		j1.print();
		int result1= j1.plus(100, 2000);
		
		System.out.println(result1);
		System.out.println(j1.getName());
		System.out.println(j1.getHeight());
		
		Java4 j2 = new Java4();
		//j2.name = "a2";
		//j2.height = 180.3;
		j2.setName("a2");
		j2.setHeight(180.3);
		
		j2.print();
		int result2 = j2.plus(10, 20);
		
		System.out.println(result2);
		System.out.println(j2.getName());
		System.out.println(j2.getHeight());
		
		
		Java4 j3 = new Java4("a3");
		//j3.name = "a3";
		j3.setHeight(150.4);
		j3.print();
		
		System.out.println(j3.getName());
		System.out.println(j3.getHeight());
		
		Java4 j4 = j1;
		
		Java4 j5 = new Java4("a4", 190.1);
		double height = new Java4("a4",190.1).getHeight();
		System.out.println(height);
		
		System.out.println(new Java4("a4",190.1).getHeight());
		
	}

}
