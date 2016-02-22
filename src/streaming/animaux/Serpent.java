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
public class Serpent extends Animal {
    
    int i =0;
    @Override
    public String toString(){
        return "serpent " + super.toString(); 
        }

    @Override
    public String avance() {
        z++;
        if (i%2 == 0){
            x--;
            i++;
        }
        else{
            x++;
            i++;
        }
        return "sssssss";
    }
    
}
