public class ArrayInputLoop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int[] nilaiUAS = new int [6];
        
        int i;
        
        for (i=0; i<nilaiUAS.length;i++){
            System.out.println("Masukkan nilai UAS MHS ke-"+i+": ");
            nilaiUAS[i] = sc.nextInt();
        }
        for (int i = 0; i<nilaiUAS.length; i++){
        
        if (nilaiUAS[i] > 70){
            System.out.println("Mahasiswa ke-" + i+ "lulus!");
        }
        else {
            System.out.println("Mahasiswa ke-" + i + "tidak lulus !");
        }
        //for(int i =0; i < 6; i++){
            //System.out.println("Masukkan nilai UAS ke-" + i + ": ");
            //nilaiUAS[i] = sc.nextInt();
        //}
        
        //for(int i = 0; i < 6; i++){
            //System.out.println("Nilai UAS ke-" + i + " adalah : " + nilaiUAS[i]);
        //}
    }
    }

}
