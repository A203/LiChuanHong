package day03;

public class Ani {
	public class Animal {
		public String string="A";
		public void hello(){
			System.out.println("A...");
		}
	}
	  class Cat extends Animal {
		public String string="B";
		public void hello(){
			System.out.println("B...");
		}
		public void main(String[] args){
			  Animal animal=new Animal();
			  animal.hello();
			  Cat cat=new Cat();
			  cat.hello();
			  Animal hellocat=new Cat();
			  hellocat.hello();
		  }
	}
}
