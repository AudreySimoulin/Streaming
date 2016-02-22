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
    public void avance() {
        z++;
        y--;
      
    }
    
    public String toString(){
        return "Le poisson nage " + super.toString(); //Super fait référence aux parents (notion d'héritage)
    }
//    public String avance(){
//        return "le poisson nage";
//    }
//}
}