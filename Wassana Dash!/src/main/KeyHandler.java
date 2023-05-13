package main;

import entity.Player;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyHandler implements KeyListener{
    public boolean upPressed, downPressed, leftPressed, rightPressed, pickUpPressed;
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //return integer keyCode (key event)
        int code = e.getKeyCode();
        // W Key
        if(code == KeyEvent.VK_UP){
            upPressed = true;
        }
        // S Key
        if(code == KeyEvent.VK_DOWN){
            downPressed = true;
        // A Key
        }
        if(code == KeyEvent.VK_LEFT){
            leftPressed = true;
        // D Key    
        }
        if(code == KeyEvent.VK_RIGHT){
            rightPressed = true;
        }
        if(code == KeyEvent.VK_Z){
            pickUpPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_UP){
            upPressed = false;
        }
        if(code == KeyEvent.VK_DOWN){
            downPressed = false;
        }
        if(code == KeyEvent.VK_LEFT){
            leftPressed = false;
        }
        if(code == KeyEvent.VK_RIGHT){
            rightPressed = false;
        }
        if(code == KeyEvent.VK_Z){
            pickUpPressed = false;
        }
    }
    
}
