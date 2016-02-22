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
//
//    private static int nbInstance = 0;

    protected int x = 0, y = 0, z = 0;
//
//    public Animal() {
//        nbInstance = nbInstance + 1;
//    }

//    public static int getNbInstance() {
//        return nbInstance;
//    }

    public String position() {
        return "Position : " + "x = " + x + " " + "y = " + y;
    }
    
    abstract public void avance();
    
    public void avance(int n){
        for(int i = 0; i<n; i++){
            avance();
        }
    }
    
    @Override
    public String toString(){
        return  ": " + "x = " + x + ";" + "y = " + y + ";" + "z = " + z;
    }
//
//    public void avancePas(int nbPas) {
//        y = y + nbPas;
//    }
//
//    public void recule() {
//        y--;
//    }
//
//    public void reculePas(int nbPas) {
//        y = y - nbPas;
//    }
//
//    public void gauche() {
//        x--;
//    }
//
//    public void gauchePas(int nbPas) {
//        x = x - nbPas;
//    }
//
//    public void droite() {
//        x++;
//    }
//
//    public void droitePas(int nbPas) {
//        x = x + nbPas;
//    }

//    public String position() {
//        return "Position : " + "x = " + x + " " + "y = " + y;
//    }

//    public String toString() {
//        return this.position();
//
//    }

//    // /!\ Pour le constructeur pas de void ou autre type de retour
//    public Animal (){
//          System.out.println("Animal()");
//    }
//    
//    public Animal(int nom){
//        System.out.println("Animal(int nom)");
//    }
//    
//    public Animal(String nom){
//        System.out.println("Animal(String nom)");
//    }
}
