package day03;
class Calculator{
	static int num1=1;
	int num2=2;
	void a(){
		num1=9;
		num2=10;
	}
}
public class Sexe {
	
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		Calculator c2=new Calculator();
		c1.a();
		System.out.println("nun1:"+c2.num1);
		System.out.println("nun2:"+c2.num2);
	}

}
