/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IChess.ChessColor;
import fr.rphstudio.chess.interf.IChess.ChessPosition;
import fr.rphstudio.chess.interf.IChess.ChessType;
import java.util.HashMap;

/**
 *
 * @author fauchetleo
 */
public class Board {
    
    // Dans le constructeur, init la list
    // Methode pour récupérer une piece
    
    private HashMap<ChessPosition, Piece> cboard;
    
    public Board(){
        
        ChessColor color = null;
        ChessType type = null;
        cboard = new HashMap<>();
        
        Piece piece = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_BISHOP);
        ChessPosition pos = new ChessPosition(5,3);
        
        cboard.put(pos, piece);
        
        
        /*for(int i = 0; i <= 7; i++){
            for(int j = 0; j <= 7; j++){
                if(j == 0 || j == 1){
                    color = IChess.ChessColor.CLR_BLACK;
                }
                else if(j == 6 || j == 7){
                    color = IChess.ChessColor.CLR_WHITE;
                }
                else{
                    continue;
                s}
                
                switch(i){
                    case 
                }
            }
        }*/
    }
    
    public Piece getPiece(ChessPosition pos){
        for(ChessPosition p : cboard.keySet()){
            if(p.equals(pos)){
                return cboard.get(p);
            }
        }
        return null;
    }
}
