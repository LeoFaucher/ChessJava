package fr.rphstudio.chess.interf;

/**
 * Exception used when an action is performed with a position outside of the chess board.
 * It extends the ChessException class.
 * @author Romuald GRIGNON
 */
public class OutOfBoardException extends ChessException
{

    /**
     *
     */
    public OutOfBoardException()
    {
        super();
    }

    /**
     *
     * @param message
     */
    public OutOfBoardException(String message)
    {
        super(message);
    }

    /**
     *
     * @param cause
     */
    public OutOfBoardException(Throwable cause)
    {
        super(cause);
    }

    /**
     *
     * @param message
     * @param cause
     */
    public OutOfBoardException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
    
    
