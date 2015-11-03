/*
 * To change thi license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawstuff;

import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author samuelmartinezdelcampo
 */
public class AdEnvironment extends Environment {

    public AdEnvironment() {
        this.setBackground(new Color( 204, 229, 255));
    }
   Image logo;
    @Override
    public void initializeEnvironment() {
          logo = ResourceTools.loadImageFromResource("drawstuff/Apple_Logo_Blue_Transparent.png");
        this.setBackground(Color.white);
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.setColor(new Color(0, 153, 153, 180));
        graphics.fillOval(200, 200, 100, 100);

        graphics.setColor(new Color(255, 103, 255, 185));
        graphics.fillOval(900, 200, 40, 40);

        graphics.setColor(new Color(200, 158, 5, 185));
        graphics.fillOval(142, 57, 120, 120);

        graphics.setColor(new Color(240, 250, 25, 185));
        graphics.fillOval(550, 500, 56, 56);

        graphics.setColor(new Color(250, 18, 100, 185));
        graphics.fillOval(300, 77, 80, 80);

        graphics.setColor(new Color(100, 70, 150, 185));
        graphics.fillOval(740, 400, 66, 66);
        
          graphics.setColor(new Color(100, 10, 230,185));
        graphics.fillOval(1000, 27, 120, 120);
        
            graphics.setColor(new Color(33, 44, 235, 185));
        graphics.fillOval(55, 331, 90, 90);
        
          graphics.setColor(new Color(200, 100, 30, 185));
        graphics.fillOval(700, 56, 120, 120);
        
            graphics.setColor(new Color(133, 144, 35, 185));
        graphics.fillOval(677, 200, 90, 90);
        
         graphics.setColor(new Color(133, 144, 35, 185));
        graphics.fillOval(500, 331, 90, 90);
        
          graphics.setColor(new Color(00, 200, 130, 185));
        graphics.fillOval(600, 96, 120, 120);
        
            graphics.setColor(new Color(233, 244, 135, 185));
        graphics.fillOval(457, 150, 90, 90);
    
        int width = 100;
        int height = 200;
        graphics.setColor(Color.MAGENTA);
        
        graphics.setFont(new Font("Calibri", Font.ITALIC, 32));
        graphics.drawString("Apple Logo", 500, 160);
     
         if (logo != null){
            graphics.drawImage(logo, 530, 48, 60, 60, this); 
         }       
    }
    

}
