package day03;

public class Student {
	
	int num;
	String name;
	String address;
	void intrudution(){
		System.out.println("大家好，我叫"+name+"，今年20岁了，我在"+address);
	}
	public static void main(String[] args){
		Student s1=new Student();
		s1.num=2012214306;
		s1.name="Li Ming";
		s1.address="安徽省合肥市合肥工业大学";
		s1.intrudution();
	}
}
