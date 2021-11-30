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
public class Platinum extends Gold{
    //atribut
    private int bonus;
    
    //constructor
    Platinum(){
        setbiayaSewa (45000);
        setDiskon(3);
        setPoin(10);
        setCashback (10000);
    }
    
    int bonusSewa(int durasiSewa){
        bonus = durasiSewa * 5000;
        
        return bonus;
    }
}
