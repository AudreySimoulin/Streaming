/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.Exercice;

/**
 *
 * @author admin
 */
public class Client {
    
    private String nom;
    private String prenom;
    private Double solde;
    private Byte age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }
    
    public Client(String n, String p, Long s, String a){
        this.nom = n;
        this.prenom = p;
        this.solde = (double) s;
        this.age = Byte.parseByte(a);
       
    }
    public String toString(){
        return(nom+ " " + prenom + "\n solde : " + solde + " euros" +  "\n age : " + age + " ans");
        
    }
    
} 
