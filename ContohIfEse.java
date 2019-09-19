public class contohifese{
public static void main (String args []){
		char hurufAwal = 'a';
		System.out.print("masukkan huruf awak nama anda : ");
		try {
			hurufAwal = (char)System.in.read();
		}catch(Exception e){
			System.out.println("Salah Input Huruf Awal");
		}
			
		if (hurufAwal == 'a')
			System.out.println("Apa namamu Amin?");
		else if (hurufAwal =='b')
			System.out,println("Apa namamu Bambang?");
		else if (hurufAwal =='c')
			System.out,println("Apa namamu ceceo?");
		else if (hurufAwal =='d')
			System.out,println("Apa namamu Daud?");
		else if (hurufAwal =='e')
			System.out,println("Apa namamu endang?");
		else 
			System.out.println("Aku tidak bisa menebak");
	}
}