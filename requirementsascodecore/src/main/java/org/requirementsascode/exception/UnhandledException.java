package org.requirementsascode.exception;

/**
 * Exception that is thrown when a system reaction throws an exception that is not handled.
 * 
 * @author b_muth
 *
 */
public class UnhandledException extends RuntimeException{
	private static final long serialVersionUID = 8510144283265242951L;
	
	public UnhandledException(Throwable uncaughtException) {
		super(uncaughtException);
	}
}
