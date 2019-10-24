/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livingthing;

/**
 *
 * @author Ekiw
 */
public class Human extends LivingThing {
    private String nama;
    public String getNama(){
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void walk(){
        System.out.println(getNama()+ " Sedang Berjalan");
    }
    public void breath(){
        System.out.println(getNama()+ " Bernafas");
}
   public void eat(){
        System.out.println(getNama()+ " Makan");
    }
}
