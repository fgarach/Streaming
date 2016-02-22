/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import static java.time.Clock.system;
import org.junit.Test;
import static org.junit.Assert.*;
import streaming.animaux.Animal;
import streaming.animaux.Oiseaux;
import streaming.animaux.Poisson;
import streaming.animaux.Serpent;
import streaming.animaux.Terminal;

/**
 *
 * @author admin
 */
public class ObjetTest {

//    @Test
//    public void test1() {
//        Animal a = new Animal();
//        a.recule();
//        a.gauche();
//        System.out.println(a.position());
//        a.avance(10);
//        a.droite(4);
//        System.out.println(a.position());
//        a.droite();
//        System.out.println(a);
//        
//        System.out.println(a.getNbInstance());
//    }
    //   @Test
    public void test2() {
        Terminal t1 = Terminal.creation();
        Terminal t2 = Terminal.creation();
        System.out.println(t1);
        System.out.println(t2);

    }

  //     @Test
    public void testPoisson() {
        Poisson p = new Poisson();
        System.out.println(p.avance(3));
        System.out.println(p);
//        System.out.println(p.avance());
//        System.out.println(p);
    }

    // @Test
    public void testSerpent() {
        Serpent s = new Serpent();
        System.out.println(s.avance());
        System.out.println(s);
        System.out.println(s.avance());
        System.out.println(s);
        System.out.println(s.avance());
        System.out.println(s);
    }

    //@Test
    public void testOiseau() {
        Oiseaux o = new Oiseaux();
        System.out.println(o.avance());
        System.out.println(o);
        System.out.println(o.avance());
        System.out.println(o);
    }

//    @Test
    public void plusieursAnimaux() {
        Animal[] tab = new Animal[5];
        tab[0] = new Oiseaux();
        tab[1] = new Serpent();
        tab[2] = new Serpent();
        tab[3] = new Poisson();
        tab[4] = new Poisson();

        tab[1].avance();

        for(Animal monAnimal : tab) {
            System.out.println(monAnimal.avance());
            System.out.println(monAnimal);
        }

    }
    
    @Test
    public void testSubstitution(){
        Animal a = new Poisson();
        Poisson p = (Poisson)a;
                
    }
}
