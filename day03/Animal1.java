package day03;

public abstract class Animal1 {
	public abstract void sleep(); 
}
class Horse extends Animal1{
	public  void sleep(){
		System.out.println("zhangzheshui");
	}
}
class Dog extends Animal1{
	public  void sleep(){
		System.out.println("pazheshui");
	}
}