package day03;

public class Phone {
	String name;
	String brand;
	int price;
	void main(){
		System.out.println("��绰");
		}
		void sendMsg(){
			System.out.println("����Ϣ");
		}
		
	public static void main(String[] args){
		Phone phone=new Phone();
		phone.name="note";
		phone.brand="���׻�";
		phone.price=99;
		System.out.println(phone.name+"\t"+phone.brand+"\t"+phone.price+"\t");
	}
}
