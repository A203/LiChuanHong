package day03;

public class Student {
	
	int num;
	String name;
	String address;
	void intrudution(){
		System.out.println("��Һã��ҽ�"+name+"������20���ˣ�����"+address);
	}
	public static void main(String[] args){
		Student s1=new Student();
		s1.num=2012214306;
		s1.name="Li Ming";
		s1.address="����ʡ�Ϸ��кϷʹ�ҵ��ѧ";
		s1.intrudution();
	}
}
