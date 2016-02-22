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
public class Ensemble implements Collection, Affichage {

    int nbElem = 0;
    Object[] tabObjets = new Object[10];

    @Override
    public void ajouter(Object o) {

        boolean trouve = false;
        int i = 0;
        while (!trouve && i < nbElem) {
            if (tabObjets[i] == o) {
                trouve = true;
            }
            i++;
        }
        if (!trouve) {
            tabObjets[nbElem] = o;
            nbElem++;
        }
    }

    @Override
    public int taille() {
        return nbElem;
    }

    @Override
    public Object getObjet(int i) {
        return tabObjets[i];
    }

    @Override
    public void afficher() {
        for (int i = 0; i < nbElem; i++) {
            System.out.println(tabObjets[i]);
        }
    }

}
