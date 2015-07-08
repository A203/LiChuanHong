
public class Demo {
	public static void main(String[] args){
		Army a=new Army(10);
		a.addWeapon(new Tank());
		a.addWeapon(new Flighter());
		a.addWeapon(new WarShip());
		a.attackAll();
		a.moveAll();
	}
	
}
