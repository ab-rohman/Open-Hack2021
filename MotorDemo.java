/**
 * Nama : Muhammad Rizqi Ardiansyah 
 * Kelas : MI 2D 
 * Absen : 19 
 * NIM : 2031710041
 */

public class MotorDemo {

    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahKecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        System.out.println("=====================");
        System.out.println("|  Tambah kecepatan |");
        System.out.println("=====================");  
        
        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        
        System.out.println("=====================");
        System.out.println("| Kurangi kecepatan |");
        System.out.println("=====================");   
        
        motor.kurangiKecepatan();
        motor.printStatus();

        motor.kurangiKecepatan();
        motor.printStatus();

        motor.kurangiKecepatan();
        motor.printStatus();

        motor.kurangiKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();

    }
}
