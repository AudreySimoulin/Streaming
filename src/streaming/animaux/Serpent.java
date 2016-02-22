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

private boolean estAlleAGauche = false;

    @Override
    public void avance() {
      z++;
      if(estAlleAGauche==false){
          x = x - 2;
          estAlleAGauche = true;
      }
      else{
          x = x + 2;
      }
          
    }
    public String toString(){
          return "Le serpent rampe " + super.toString() ;
    } 
}
