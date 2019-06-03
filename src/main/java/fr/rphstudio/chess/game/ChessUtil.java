/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess.ChessPosition;

/**
 *
 * @author fauchetleo
 */
public class ChessUtil {
               
    /**
     *
     */
    public ChessUtil(){
        
    }
    
    /**
     *
     * @param pos
     * @param test
     * @param board
     * @return
     */
    public static boolean isValidPosition(ChessPosition pos, ChessPosition test, Board board){        
        if(test.x >= 0 && test.x <= 7 && test.y >= 0 && test.y <= 7 && (board.getPiece(test) == null || (board.getPiece(test) != null && board.getPiece(test).getColor() != board.getPiece(pos).getColor()))){}
        return true;
    }
}
