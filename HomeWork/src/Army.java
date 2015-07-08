
public class Army {
	int size=0;
	Weapon w[]=null;
	Army(){};
	public Army(int num){
		w=new Weapon[num];
	} 
	public void addWeapon(Weapon wa){
		if(size>=w.length){
			System.out.println("军队装备足够了");
			return;
		}
		else{
			w[size]=wa;
			size++;
			
		}
	}
	public void attackAll(){
		for(Weapon wea:w){
			if(wea!=null){
				wea.attack();
			}
		}
	}
	void moveAll(){
		for(Weapon wea:w){
			if(wea!=null){
				wea.move();
			}
		}
	}
	
}
