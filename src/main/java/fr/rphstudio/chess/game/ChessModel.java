/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.EmptyCellException;
import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.OutOfBoardException;
import java.util.*;

/**
 *
 * @author fauchetleo
 */
public class ChessModel implements IChess {
    
    private static ChessModel instance; 
    private Board grid;
    
    private ChessModel(){
        grid = new Board();
    }

    /**
     *
     * @return
     */
    public static IChess getInstance() {
        if(instance == null){
            instance = new ChessModel();
        }
        return instance;
    }

    @Override
    public void reinit() {
        this.grid = new Board();
    }

    @Override
    public ChessType getPieceType(ChessPosition p) throws EmptyCellException, OutOfBoardException {
        
        Piece piece = grid.getPiece(p);
        
        if(piece == null){
            throw new EmptyCellException();
        }        
        return piece.getType();
    }

    @Override
    public ChessColor getPieceColor(ChessPosition p) throws EmptyCellException, OutOfBoardException {
        
        Piece piece = grid.getPiece(p);
        
        if(piece == null){
            throw new EmptyCellException();
        }        
        return piece.getColor();
    }

    @Override
    public int getNbRemainingPieces(ChessColor color) {
        
        return grid.getNbPiece(color);
    }

    @Override
    public List<ChessPosition> getPieceMoves(ChessPosition p) {
        return new ArrayList<>();
    }

    @Override
    public void movePiece(ChessPosition p0, ChessPosition p1) {
        
    }

    @Override
    public ChessKingState getKingState(ChessColor color) {
        return ChessKingState.KING_SAFE;
    }

    @Override
    public List<ChessType> getRemovedPieces(ChessColor color) {
        return new ArrayList<>();
    }

    @Override
    public boolean undoLastMove() {
        return false;
    }

    @Override
    public long getPlayerDuration(ChessColor color, boolean isPlaying) {
        return 0;
    }
    
}
