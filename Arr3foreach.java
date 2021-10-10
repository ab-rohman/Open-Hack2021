import java.util.Scanner;
public class Arr3foreach {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][] nilai=new int [2][3];
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++) {
                System.out.print("Masukkan nilai ke-[" + i + "][" + j + "] ");
                nilai[i][j] = input.nextInt();
            }
            System.out.println("--------------------------");
        }
        for (int angka[] : nilai){
            for (int i :angka) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}