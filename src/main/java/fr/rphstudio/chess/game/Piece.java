/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess.*;
import fr.rphstudio.chess.interf.IMove;

/**
 *
 * @author fauchetleo
 */
public class Piece {
    
    private ChessColor color;
    private ChessType type;

    private IMove move;
    
    // Faire Getter et Constructeur

    /**
     *
     * @param color
     * @param type
     * @param move
     */
    
    public Piece(ChessColor color, ChessType type, IMove move){
        this.color = color;
        this.type = type;
    }
    
    /**
     *
     * @return
     */
    public ChessType getType(){
        return this.type;
    }
    
    /**
     *
     * @return
     */
    public ChessColor getColor(){
        return this.color;
    }
    
    /**
     *
     * @param pos
     * @param brd
     * @return
     */
    public IMove getMoves(ChessPosition pos, Board brd){
        return this.move;
    }
}

