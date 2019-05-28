/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IChess.ChessColor;
import fr.rphstudio.chess.interf.IChess.ChessType;

/**
 *
 * @author fauchetleo
 */
public class Piece {
    
    private ChessColor color;
    private ChessType type;

    // Faire Getter et Constructeur
    
    public Piece(ChessColor color, ChessType type){
        this.color = color;
        this.type = type;
    }
    
    public ChessType getType(){
        return this.type;
    }
    
    public ChessColor getColor(){
        return this.color;
    }
}

