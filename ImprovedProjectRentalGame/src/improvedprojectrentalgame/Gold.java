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
public class Gold extends Silver{
    //atribut
    private int cashback;
    
    public void setCashback (int cb){
        this.cashback = cb;
    }
    
    public int getCashback(){
        return this.cashback;
    }
    
    //constructor
    Gold(){
        setbiayaSewa(30000);
        setDiskon(2);
        setPoin(5);
        setCashback(5000);
    }
}
