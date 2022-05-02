package org.variable;

public class Data {
	public static String name ;

	private void Source() {
		 name="harish";
		System.out.println(" method calling"+name);
	}
	public static void main(String[] args) {
		Data d=new Data();
		System.out.println("before method calling"+name);
		d.Source();
		System.out.println("after method calling="+name);
		Data d2=new Data();
		System.out.println(name);
	}
	
}
