/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.animaux;

/**
 *
 * @author admin
 */
public class Poisson extends Animal{
    
    
    @Override
    public String toString(){
        return "poisson " + super.toString(); 
        }

    
    @Override
    public String avance() {
        z++;
        y--;
        return "nage";
        

    }
    
}
