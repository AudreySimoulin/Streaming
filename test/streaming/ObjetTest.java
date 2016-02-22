/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import static org.junit.Assert.*;
import streaming.animaux.Animal;
import streaming.animaux.Oiseau;
import streaming.animaux.Poisson;
import streaming.animaux.Serpent;
import streaming.animaux.Terminal;
import streaming.enumeration.TypeUtil;
import streaming.interfaces.Collection;
import streaming.interfaces.Ensemble;
import streaming.interfaces.Liste;

/**
 *
 * @author admin
 */
public class ObjetTest {

    //@Test
//    public void test1() {
//        Animal a = new Animal();
////       a.gauchePas(4);
////       System.out.println(a);
////       a.avancePas(5);
////       a.gauchePas(2);
//        System.out.println(a.avance());
//        Animal a2 = new Animal();
//        //System.out.println("Nb d'animaux : " +a.getNbInstance());
//    }
    
    //@Test
    public void test2(){
        Terminal t1 = Terminal.creation();
        Terminal t2 = Terminal.creation();
        System.out.println(t1);
        System.out.println(t2);


}
    
   // @Test
    public void testPoisson(){
        Poisson p = new Poisson();
        p.avance();
        
        System.out.println(p);
        
    }
    
    //@Test
    public void testSerpent(){
        Serpent s = new Serpent();
        s.avance();
        System.out.println(s);
        s.avance();
        System.out.println(s);
    }
    
   // @Test
    public void testOiseau(){
        Oiseau o = new Oiseau();
        o.avance();
        System.out.println(o);
    }
    
    //@Test
    public void testTab(){
        Animal[] animal = new Animal[6];
        animal[0] = new Poisson();
        animal[1] = new Serpent();
        animal[2] = new Oiseau();
        animal[3] = new Poisson();
        animal[4] = new Serpent();
        animal[5] = new Oiseau();
        
        animal[1].avance();
        //System.out.println(animal[1]);
        
        for(Animal a : animal){
            a.avance(3);
            System.out.println(a);
        }
    }
    
    @Test
    public void testEnsemble(){
        Ensemble e = new Ensemble();
        
        e.ajouter("o");
        e.ajouter("b");
        e.afficher();
       
        
        Liste l = new Liste();
        
        l.ajouter("Y");
        l.ajouter("o");
        l.afficher();
               
    }
    
    @Test
    public void testSubstitution(){
        TypeUtil tu = TypeUtil.MODERATEUR;
        
        if (tu == TypeUtil.MODERATEUR){
            System.out.println("Modérateur");
        }
    }
    
}


