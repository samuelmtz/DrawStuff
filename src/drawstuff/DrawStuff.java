/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.ApplicationStarter;

/**
 *
 * @author samuelmartinezdelcampo
 */
public class DrawStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startUp();
        // TODO code application logic here
        
    }

    private static void startUp() {
       ApplicationStarter.run("Apple Advertisement ", new AdEnvironment());
       //           ApplicationStarter.run("First Drawing", new DrawEnvironment());

    }

}
