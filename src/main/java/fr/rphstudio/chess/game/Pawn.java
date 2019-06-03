/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IMove;
import java.util.*;

/**
 *
 * @author fauchetleo
 */
public class Pawn implements IMove {

    @Override
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        List<IChess.ChessPosition> list;
        list = new ArrayList<>();
        IChess.ChessPosition test;
        
        switch(board.getPiece(pos).getColor()) {
            case CLR_WHITE:
                test = new IChess.ChessPosition(pos.x, pos.y - 1);
                if(ChessUtil.isValidPosition(pos, test, board) == true) { 
                    list.add(test);
                }                
                break;
             
            case CLR_BLACK:
                test = new IChess.ChessPosition(pos.x, pos.y + 1);
                if(ChessUtil.isValidPosition(pos, test, board) == true) { 
                    list.add(test);
                }
                break;                 
        }        
        return list;
    }
    
}
