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
public class Knight implements IMove {
    
    int [] x = {1, 2, 2, 1, -1, -2, -2, -1};
    int [] y = {2, 1, -1, -2, -2, -1, 1, 2};
    
    @Override
    public List<IChess.ChessPosition> getPossibleMoves(IChess.ChessPosition pos, Board board) {
        
    }
}
