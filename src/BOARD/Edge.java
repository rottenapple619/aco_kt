/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BOARD;

/**
 *
 * @author Marz
 */
public class Edge {
    
    private final Square startPos;
    private final Square destPos;
    private final int move;
    private int phermone;//or double
    
    Edge(Square startPos, Square destPos, int move){
        this.startPos = startPos;
        this.destPos = destPos;
        this.move = move;
    }
    
    public int getPhermone(){
        return this.phermone;
    }
    
    public void setPhermone(int value){
        this.phermone = value;
    }
    
}
