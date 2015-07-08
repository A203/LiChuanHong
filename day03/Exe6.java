package day03;
class B{
	static{
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
	B(){
		System.out.println(3);
	}
}
public class Exe6 {
	public static void main(String[] args){
		new B();
		new B();
	}
}
