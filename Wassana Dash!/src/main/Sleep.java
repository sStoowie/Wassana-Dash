/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author stewie.
 */
public class Sleep {
    public boolean checkFull = false;
    
    public Sleep(){

        try {
        Thread.sleep(5000);
        checkFull = true;

        } 
        catch (InterruptedException e) {
        e.printStackTrace();
        }
    }
}

