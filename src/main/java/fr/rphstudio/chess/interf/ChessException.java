package fr.rphstudio.chess.interf;

/**
 * Exception class used to contain all the exceptions in our application.
 * @author Romuald GRIGNON
 */
public class ChessException extends Exception
{

    /**
     *
     */
    public ChessException()
    {
        super();
    }

    /**
     *
     * @param message
     */
    public ChessException(String message)
    {
        super(message);
    }

    /**
     *
     * @param cause
     */
    public ChessException(Throwable cause)
    {
        super(cause);
    }

    /**
     *
     * @param message
     * @param cause
     */
    public ChessException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
    
    
