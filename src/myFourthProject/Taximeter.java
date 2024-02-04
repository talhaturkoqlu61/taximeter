package myFourthProject;
import java.util.Scanner;

public class Taximeter {
	public static void main(String[]args) {
		//description of variables
		double acilis=10,taximeterTotalCost,km,degiskenUcret=2.20;
		Scanner input=new Scanner(System.in);
		System.out.print("Lütfen gitmek istediğiniz mesafenin kilometre cinsinden uzunluğunu giriniz:");
		km=input.nextDouble();
		taximeterTotalCost=acilis+km*degiskenUcret;
		
		if(taximeterTotalCost>=20) {
			System.out.print("Toplam taksimetre ücretiniz:");
			System.out.println(taximeterTotalCost);
			
		}
		else {
			taximeterTotalCost=20;
			System.out.print("Toplam taksimetre ücretiniz:");
			System.out.println(taximeterTotalCost);
			
		}
	}

}
