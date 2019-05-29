/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.interf;

import fr.rphstudio.chess.game.Board;
import fr.rphstudio.chess.interf.IChess.ChessPosition;
import java.util.List;

/**
 *
 * @author fauchetleo
 */
public interface IMove {
    public List<ChessPosition> getPossibleMoves(ChessPosition pos, Board board);
}
