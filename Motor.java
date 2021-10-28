/**
 * Nama : Muhammad Rizqi Ardiansyah 
 * Kelas : MI 2D 
 * Absen : 19 
 * NIM : 2031710041
 */

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private boolean maxKec = false;
    private boolean minKec = false;

    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan() {
        maxKecepatan();
        if (maxKec == false) {
            if (kontakOn == true) {
                kecepatan += 50;
            } else {
                System.out.println("Kecepatan tidak bisa bertambah karena"
                        + " Mesin off! \n");
            }
        }
    }
    public void kurangiKecepatan() {
        minKecepatan();
        if (minKec == false) {
            if (kontakOn == true) {
                kecepatan -= 50;
            } else {
                System.out.println("Kecepatan tidak bisa berkurang karena"
                        + " Mesin off! \n");
            }
        }
    }
    public void printStatus(){
        if(kontakOn == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
    public void maxKecepatan(){
        if(kecepatan >= 150){
            maxKec = true;
            System.out.println("Kecepatan sudah maksimal");
        }
    }
    public void minKecepatan(){
        if(kecepatan <= 0){
            minKec = true;
            System.out.println("Motor sudah berhenti");
        }
    }
}
