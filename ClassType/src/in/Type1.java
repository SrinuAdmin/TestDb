package in;

import java.util.Date;

import in.nit.Demo;

public class Type1 {

	Integer a;
	String b=null;
	Demo demo;
	Date date;
	
	void get() {
		demo=new Demo(8);
		date=new Date(120, 4, 17);
		
		System.out.println(demo.body());
		System.out.println(date);	
		
	}
	public static void main(String[] args) {
		
		Type1 t=new Type1();
		t.get();
		
	}	

}
