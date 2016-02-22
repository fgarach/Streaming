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
public abstract class Animal {
    
    
    private static int nbInstance =0;
    
    protected int x=0, y=0, z=0;
    
    public Animal(){
        nbInstance ++;
    }
    
    public static int getNbInstance(){
        return nbInstance;
    }
    
    abstract public String avance();
    
    public String avance(int n){
        
        String retour = " ";
        
        for(int i=0; i<n ; i++){
           // avance();
            retour = retour + avance() + " " ;
        }
        return retour ;
    }
    
//    public void recule(){
//        y--;
//    }
//    public void recule(int i){
//        y=y-i;
//    }
//    
//    public void gauche(){
//        x--;
//    }
//    public void gauche(int i){
//        x=x-i;
//    }
//    
//    public void droite(){
//        x++;
//    }
//    public void droite(int i){
//        x=x+i;
//    }
    
    public String position(){
        return x + " " + y + " " + z;
    }
    
    public String toString(){
        return this.getClass() +": " + x + ", "+ y + ", " + z;

    }
//    public Animal(){
//        
//        System.out.println("Animal");
//    }
//    public Animal(String nom){
//        this(); //appele le constructeur par défaut
//        System.out.println("Animal(String nom");
//    }
    
}
