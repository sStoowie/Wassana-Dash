/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ai;

import java.util.ArrayList;
import main.GamePanel;
import entity.Entity;

/**
 *
 * @author youngyeans
 */
public class PathFinder {
    GamePanel gp;
    Node[][] node;
    ArrayList<Node> pathList = new ArrayList<>();
    Node startNode, goalNode, currentNode;
    boolean goalReached = false;
    int step = 0;
    
    public PathFinder(GamePanel gp){
        
        this.gp = gp;
        instantiateNode();
    }
    public void instantiateNode(){
        
        node = new Node[gp.maxScreenCol][gp.maxScreenRow]; // col(x) : 16, row(y) : 12
        
        int col = 0;
        int row = 0;
        
        while((col < gp.maxScreenCol) && (row < gp.maxScreenRow)){
            
            node[col][row] = new Node(col, row);
            
            col++;
            if(col == gp.maxScreenCol){
                col = 0;
                row++;
            }
        }
    }
    public void resetNodes(){
        
        int col = 0;
        int row = 0;
        
        while((col <gp.maxScreenCol) && (row < gp.maxScreenRow)){
            
            //Reset open, checked and solid state
            node[col][row].open = false;
            node[col][row].checked = false;
            node[col][row].solid = false;
            
            col++;
            if(col == gp.maxScreenCol){
                col = 0;
                row++;
            }
        }
        
        //reset other settings
        //openList.clear();
        pathList.clear();
        goalReached = false;
        step = 0;
    }
    public void setNodes(int startCol, int startRow, int goalCol, int goalRow, Entity entity){
        
        resetNodes();
        
        // set Start and Goal node
        startNode = node[startCol][startRow];
        currentNode = startNode;
        goalNode = node[goalCol][goalRow];
    }
}