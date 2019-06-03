/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IChess.*;
import fr.rphstudio.chess.interf.IMove;
import java.util.HashMap;

/**
 *
 * @author fauchetleo
 */
public class Board {
    
    // Dans le constructeur, init la list
    // Methode pour récupérer une piece
    
    private HashMap<ChessPosition, Piece> cboard;
    
    /**
     *
     */
    public Board(){
        
        ChessColor color = null;
        ChessType type = null;
        IMove move = null;
        cboard = new HashMap<>();
        
        //Afficher une seule piece
        /*Piece piece = new Piece(ChessColor.CLR_BLACK, ChessType.TYP_BISHOP);
        ChessPosition pos = new ChessPosition(5,3);        
        cboard.put(pos, piece);*/
        
        for(int i = 0; i <= 7; i++){
            for(int j = 0; j <= 7; j++){
                switch (j) {
                    case 0:
                    case 1:
                        color = IChess.ChessColor.CLR_BLACK;
                        break;
                    case 6:
                    case 7:
                        color = IChess.ChessColor.CLR_WHITE;
                        break;
                    default:
                        continue;
                }
                
                switch(i){
                    case 0:
                    case 7: 
                        type = ChessType.TYP_ROOK;
                        break;                    
                    case 1:
                    case 6:
                        type = ChessType.TYP_KNIGHT;
                        break;                        
                    case 2:
                    case 5:
                        type = ChessType.TYP_BISHOP;
                        break;
                    case 3:
                        type = ChessType.TYP_QUEEN;
                        break;
                    case 4:
                        type = ChessType.TYP_KING;
                        break;                    
                }
                
                if(j == 1 || j == 6){
                    type = ChessType.TYP_PAWN;
                }
                
                ChessPosition pos = new ChessPosition(i, j);
                Piece piece = new Piece(color, type, move);
                cboard.put(pos, piece);
            }
        }
    }
    
    /**
     *
     * @param pos
     * @return
     */
    public Piece getPiece(ChessPosition pos){
        for(ChessPosition p : cboard.keySet()){
            if(p.equals(pos)){
                return cboard.get(p);
            }
        }
        return null;
    }
    
    /**
     *
     * @param color
     * @return
     */
    public int getNbPiece(ChessColor color)
   {

       int count = 0;
       for(Piece p: cboard.values()){
           if(p.getColor() == color){
                count++;
           }
       }
       return count;
   }
}

    
