package day02;

public class Homewok1 {
	public static void main(String[] args){
		int num=0;
				for(int i=2,j;i<100;i++){
			int k=(int)Math.sqrt(i);
			for(j=2;j<=k;j++){
				if(i%j==0){
					break;
					}
			}
				if(j>k){
					num++;
					}
		}
		System.out.println("num"+num);	
		}
		}

