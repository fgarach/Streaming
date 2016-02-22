/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import streaming.enumerations.TypeUtil;
import streaming.interfaces.Ensemble;
import streaming.interfaces.Liste;

/**
 *
 * @author admin
 */
public class InterfacesTest {
    
@Test
public void testSubst(){
    TypeUtil tu = TypeUtil.MODERATEUR;

    if (tu==TypeUtil.MODERATEUR){
        System.err.println("Moderateur");
    }
}
//@Test
    public void testTest(){
        
        Liste list = new Liste();
        list.ajouter("poisson");
        list.ajouter("oiseau");
        list.ajouter("serpent");
        list.ajouter("oiseau");        
        
        Ensemble ens = new Ensemble();
        ens.ajouter("poisson");
        ens.ajouter("oiseau");
        ens.ajouter("serpent");
        ens.ajouter("oiseau");
        
        list.Afficher();
        ens.Afficher();
        
//        for(int i =0; i<list.taille(); i++){
//            System.out.println("liste : " + list.getObject(i));
//        }
//        
//        for(int i =0; i<ens.taille(); i++){
//        System.out.println("ensemble :" + ens.getObject(i));
//        }
        

    
    
    
}
}
