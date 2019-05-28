/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IChess.ChessPosition;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author fauchetleo
 */
public class Board {
    
    // Dans le constructeur, init la list
    // Methode pour récupérer une piece
    
    Map<Piece, ChessPosition> cboard;
        
    IChess.ChessColor color = null;
    IChess.ChessType type = null;
    
    public Board(){
        cboard = new HashMap<Piece, ChessPosition>();
        for(int i = 0; i <= 7; i++){
            for(int j = 0; j <= 7; j++){
                cboard.put(null, new ChessPosition(i, j));
            }
        }
    }
}
