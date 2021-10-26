/**
 *
 * @author Rizqi Ardiansyah
 */
public class SepedaGunung extends Sepeda{
    
    private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue){
        tipeSuspensi = newValue;
    }
    
    public void cetakStatus(){
        super.cetakStatus(); 
//        super berfungsi untuk mempresentasikan objek dari
//        class induk (yang di Extends), sehingga hasilnya sesuai 
//        class yang di Extends
        System.out.println("Tipe suspensi: "+tipeSuspensi);
    }
}
