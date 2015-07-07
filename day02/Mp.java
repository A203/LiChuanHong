package day02;

public class Mp {
	public static void main(String[] args){
		int a[]={5,3,6,2};
		int temp=0;
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				//for( j=0;j<a.length;j++){
				//	   System.out.println(a[j]);
				//   }	
				}
		}
			for(int i=0;i<a.length;i++){
				   System.out.println(a[i]);
			   }
		


	}

}
