/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.interfaces;

/**
 *
 * @author admin
 */
public class Ensemble implements Collection, Affichable {
    int nbElem = 0;
    Object[] tabObjet = new Object[10]; //jamais plus de 10 objet dans notre liste

    @Override
    public void ajouter(Object o) {
        
        int i=0;
        boolean memeElement = false;
        
        while (memeElement==false && i<nbElem){
            if (tabObjet[i]==o){
                memeElement=true;
            }
            i++;
        }
        if (memeElement==false){
            tabObjet[nbElem] = o;
            nbElem++;  
        }       
    }

    @Override
    public int taille() {
        return nbElem;
    }

    @Override
    public Object getObject(int i) {
        return tabObjet[i];
    }

    @Override
    public void Afficher() {
        for(int i=0; i<nbElem; i++){
            System.out.println(tabObjet[i] + " ");
        }
    }

}
