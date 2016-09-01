/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BOARD;

import java.util.ArrayList;

/**
 *
 * @author Marz
 */
public class Square {

    public static final int MOVE0 = 0;
    public static final int MOVE1 = 1;
    public static final int MOVE2 = 2;
    public static final int MOVE3 = 3;
    public static final int MOVE4 = 4;
    public static final int MOVE5 = 5;
    public static final int MOVE6 = 6;
    public static final int MOVE7 = 7;
    
    
    
    private final String ID;
    private final ArrayList<Edge> validMoves;
    private final int ROW;
    private final int COL;
    
    Square(String id, int row, int col){
        this.ID = id;
        this.ROW = row;
        this.COL = col;
        this.validMoves = new ArrayList<>();
    }
    
    
    
    public static Edge move(Square startPos, int move){
        Edge e = null;
        
        switch(move){
            case MOVE0:
                
                break;
            case MOVE1:
                
                break;
            case MOVE2:
                
                break;
            case MOVE3:
                
                break;
            case MOVE4:
                
                break;
            case MOVE5:
                
                break;
            case MOVE6:
                
                break;
            case MOVE7:
                
                break;
        }
        return e;
    }
}
