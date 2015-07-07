package day02;

public class S4 {
	public static void main(String[] args){
		int num=0;
		for(int i=1;i<=99;i++){
			if(i%5==0){
				System.out.println(i);
				//continue;
				break;
			}
			num++;
			
		}
		System.out.println("num"+num);	
	}

}
