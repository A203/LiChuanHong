package day03;

public class Person {
	String name;
	int age;
	String address;
	Person(){}
	Person(String n,int a,String addr){
		name=n;
		age=a;
		address=addr;
	}
	void introduce(){
		System.out.println("��Һã�����"+name+",�ҽ���"+age+",������"+address);
	}
	public static void main(String[] args){
		Person p=new Person("Li ming",22,"USA");
		p.introduce();
	}
}
