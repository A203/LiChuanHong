package day03;
class A{
	static A instance=new A(1);
	static int num1=5;
	int num2;
	A(int num3){
		num2=num1-num3;
	}
}

public class Exe5 {
	public static void main(String[] args){
		System.out.println(A.instance.num2);
		System.out.println(new A(1).num2);
	}
}
