/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import streaming.gui.JFramePrincipale;

/**
 *
 * @author admin
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ApplicationContext context = new FileSystemXmlApplicationContext("file:/C:\\Users\\admin\\Documents\\NetBeansProjects\\Streaming\\application-context.xml");
        context.getBean(JFramePrincipale.class).setVisible(true);
                
    }
    
}
