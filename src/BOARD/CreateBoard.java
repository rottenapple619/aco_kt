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
public class CreateBoard {
    private static Board currBoard;
    
    public static Board getBoard(){
        return currBoard;
    }
    
    public static void generateBoard(int size){
        currBoard = new Board(size);
    }
    
}
