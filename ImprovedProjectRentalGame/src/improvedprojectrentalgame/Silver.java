/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package improvedprojectrentalgame;

/**
 *
 * @author news
 */
public class Silver extends Member {
    //atribut
    private int biayaSewa;
    private int diskon;
    private int poin;
    private int biayaSementara;
    private int totalDiskon;
    private int totalBiaya;
    
    public void setbiayaSewa(int bs){
        this.biayaSewa = bs;
    }
    
    public void setDiskon(int d){
        this.diskon = d;
    }
    
    public void setPoin (int Pn){
        this.poin = Pn;
    }
    
    
    //constructor
    Silver(){
        setbiayaSewa(25000);
        setDiskon(1);
        setPoin(1);
    }
    
    int bonusDiskon(int durasiSewa){
        biayaSementara = durasiSewa * biayaSewa;
        totalDiskon = (biayaSementara * diskon)/100;
        totalBiaya = biayaSementara - totalDiskon;
        
        return totalBiaya;
    }
    
    int totalPoin (int durasiSewa){
        int jumlahPoin = durasiSewa * poin;
        return jumlahPoin;
    }
}
