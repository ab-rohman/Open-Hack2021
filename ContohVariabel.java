public class ContohVariabel{

	public static void main(String[] args){

		String salahSatuHobySayaAdalah = "Futsal";
		boolean isPandai = true;
		char jenisKelamin = 'L';
		byte _umurSayaSekarang = 18;
		double $ipk = 3.24, tinggi = 1.70;
		System.out.println(salahSatuHobySayaAdalah);
		System.out.println("Apakah pandai? " + isPandai);
		System.out.println("Jenis kelamin: " + jenisKelamin);
		System.out.println("Umurku saat ini: " + _umurSayaSekarang);
		System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
}
}