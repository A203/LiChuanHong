package day03;

public class Person1 {
	String name;
	int age;
	String address;
	Person1(){}
	Person1(String name,int age){
		this.name=name;
		this.age=age;
		}
	Person1(String name,int age,String address){
		this(name,age);
		this.address=address;
	}
	void introduce(){
		System.out.println("��Һã�����"+name+",�ҽ���"+age+",������"+address);
	}
	public static void main(String[] args){
		Person p=new Person("Li ming",22,"USA");
		p.introduce();
	}
}
