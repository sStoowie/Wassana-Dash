package object;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Key extends SuperObject{
    public OBJ_Key(){
        name = "Key";
        
        width = 48;
        height = 48;
        collision = true;
        
        
        try{
            image = ImageIO.read(new File("res/objects/noodle.png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
