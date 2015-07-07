package day02;

import java.util.Scanner;
public class Suitang2 {
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	int day=scanner.nextInt();
	String monthstring="";
	switch(day)
	{
	case 1:monthstring="monday";break;
	case 2:monthstring="tuesday";break;
	case 3:monthstring="wednesday";break;
	case 4:monthstring="thurday";break;
	case 5:monthstring="friday";break;
	case 6:monthstring="saturday";break;
	case 7:monthstring="sunday";break;
	default:monthstring="error day";
	}
	System.out.println(monthstring);
	}

}
