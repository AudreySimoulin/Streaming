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
public class Terminal {

    private static Terminal t = null;

    public static Terminal creation() {

        if (t == null) {
            t = new Terminal();
            return t;
        } else {
            return t;
        }

    }

    private Terminal() {

    }

}
