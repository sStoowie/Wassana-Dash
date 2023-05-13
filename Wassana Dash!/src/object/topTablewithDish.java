/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;


import entity.Entity;
import entity.Player;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class topTablewithDish extends SuperObject{
    
public BufferedImage image1;
public BufferedImage image2;
   
    public topTablewithDish(){
       
        name = "Table";
        width = 134;
        height = 78;
        boolean hasPlate = false;
        
        
        try{
            image = ImageIO.read(new File("res/table/toptablewithdish.png"));
            
        }catch(IOException e){
            e.printStackTrace();
        }
        collision = true;
//        solidArea.width = width;
//        solidArea.height = hesight;
        solidArea = new Rectangle();
        solidArea.x = 7;
        solidArea.y = 29;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 120;
        solidArea.height = 100;
        
        
        }
    
    
        
        
}
    

