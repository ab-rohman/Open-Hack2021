import java.util.Scanner;
public class array{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int jumlah; 
		int arr[], bil[];

		System.out.print("Masukkan Jumlah Array: ");
		jumlah = sc.nextInt();

		arr = new int[jumlah];
		for (int i = 0; i<jumlah; i++){
			System.out.print("Masukkan Array ke-" +(i)+ ":");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i<jumlah; i++){		
		if (arr[i]%2==0){
			System.out.println("angka genap :" +arr[i]);
		}
		}
		for (int i = 0; i<jumlah; i++){		
		if (arr[i]%2==1){
			System.out.println("angka ganjil :" +arr[i]);
		}		
	}
}
}