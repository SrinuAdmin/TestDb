package in.nit;

public class Demo {

	private Integer s=0;
	
	public Demo(int s) {
		this.s=s;
		System.out.println(s);
	}
	
	public String body() {
		return "Body of demo";
	}
}
