/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

/**
 *
 * @author youngyeans
 */
import entity.Entity;
import entity.Player;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import main.GamePanel;

public class Table extends SuperObject{
    
   
    public Table(){
       
        
        name = "Table";
        width = 134;
        height = 173;
        
        
        try{
            image = ImageIO.read(new File("res/objects/table1.png"));
            
        }catch(IOException e){
            e.printStackTrace();
        }
        collision = true;
//        solidArea.width = width;
//        solidArea.height = height;
        solidArea = new Rectangle();
        solidArea.x = 7;
        solidArea.y = 29;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 120;
        solidArea.height = 100;
        
        } 
    
        
}
    
