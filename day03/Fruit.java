package day03;

public class Fruit {
	String name;
	int price;
	String address;
   Fruit(){}
   Fruit(String n,int p,String addr){
	   name=n;
	   price=p;
	   address=addr;
   }
   public static void main(String[] arg){
	   Fruit fruit=new Fruit("Æ»¹û",5,"É½¶«");
	   System.out.println(fruit.name);
   }
}
