package day03;

public class Phone {
	String name;
	String brand;
	int price;
	void main(){
		System.out.println("打电话");
		}
		void sendMsg(){
			System.out.println("发消息");
		}
		
	public static void main(String[] args){
		Phone phone=new Phone();
		phone.name="note";
		phone.brand="爆米花";
		phone.price=99;
		System.out.println(phone.name+"\t"+phone.brand+"\t"+phone.price+"\t");
	}
}
