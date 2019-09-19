import java.util.Scanner;
public class pesawat{
	public static void main (String [] args)
	{	
		Scanner input = new Scanner (System.in);
		
		int pesawat;
		
		System.out.print("Masukkan Pesawat : ");
		pesawat = input.nextInt();
		
		if(pesawat == 1){
			System.out.println("Garuda");}
		else if (pesawat == 2){
			System.out.println("Batik");}
		else if (pesawat == 3){
			System.out.println("Lion");}
			
		else
			 System.out.print("Maaf Anda Salah Memasukkan Pesawat");
}
}