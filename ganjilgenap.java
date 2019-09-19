import java.util.Scanner;
public class ganjilgenap
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("Masukkan nilai = ");
		nilai = input.nextInt();
		
	//posisi if berjalan
	if(nilai % 2 == 0){
			System.out.println("angka yang di masukkan adalah GENAP");
		}
		else
			System.out.println("angka yang di masukkan adalah GANJIL");
	}
}