/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepeda;

/**
 *
 * @author owner
 */
public class sepeda {
 private String merek;
 private String warna;
 private int jumlahroda;
 private String jenis;

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getJumlahpintu() {
        return jumlahroda;
    }

    public void setJumlahpintu(int jumlahpintu) {
        this.jumlahroda = jumlahroda;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
 
 public void tampilkandata(){
        System.out.println("merek sepeda :"+getMerek());
        System.out.println("warna sepeda :"+getWarna());
        System.out.println("total roda :"+getJumlahpintu());
        System.out.println("jenis sepeda :"+getJenis());
        
 }
 public void inputData(String m,String w,String j,int jp){
     setMerek(m);
     setWarna(w);
     setJenis(j);
     setJumlahRoda(jp);
 }

    private void setJumlahRoda(int jp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
