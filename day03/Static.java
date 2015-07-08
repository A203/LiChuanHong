package day03;

public class Static {
	static int age=20;;
	void hello(){
		System.out.println("hello.....");
		}
	static void hi(){
		System.out.println("hi.....");
	}
	public static void main(String[] args){
		Static s=new Static();
		s.hello();
		s.hi();
		
		System.out.println("age="+age);
	}
}	