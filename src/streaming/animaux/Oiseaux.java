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
public class Oiseaux extends Animal {

    
    
    @Override
    public String toString(){
        return "oiseaux " + super.toString(); 
        }
    
    
    @Override
    public String avance() {
        z++;
        y++;
        return "vole";
    }
    
}
