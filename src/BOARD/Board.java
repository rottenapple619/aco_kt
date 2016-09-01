/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BOARD;

import java.util.HashMap;

/**
 *
 * @author Marz
 */
public class Board {
    
    private final int MAX_ROW;
    private final int MAX_COL;
    private final HashMap<Integer, Square> tiles;
    
    Board(int maxrow, int maxcol){
        this.MAX_ROW = maxrow;
        this.MAX_COL = maxcol;
        this.tiles = new HashMap<>();
    }

    Board(int size) {
        this.MAX_ROW = size;
        this.MAX_COL = size;
        this.tiles = new HashMap<>();
    }
}
