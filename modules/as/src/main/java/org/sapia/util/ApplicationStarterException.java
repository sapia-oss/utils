package org.sapia.util;


// Import of Sun's JDK classes
// ---------------------------
import java.io.PrintStream;
import java.io.PrintWriter;


/**
 * This exception is thrown by the <CODE>ApplicationStarter</CODE> when an
 * error prevent it from starting an application.
 *
 * @author Jean-Cedric Desrochers
 * <dl>
 * <dt><b>Copyright:</b><dd>Copyright &#169; 2002-2003 <a href="http://www.sapia-oss.org">Sapia Open Source Software</a>. All Rights Reserved.</dd></dt>
 * <dt><b>License:</b><dd>Read the license.txt file of the jar or visit the
 *        <a href="http://www.sapia-oss.org/license.html">license page</a> at the Sapia OSS web site</dd></dt>
 * </dl>
 */
public class ApplicationStarterException extends Exception {
  /////////////////////////////////////////////////////////////////////////////////////////
  /////////////////////////////////  INSTANCE ATTRIBUTES  /////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////////////////

  /** The source error that is encapsulated in this exception. */
  private Throwable _theSourceError;

  /////////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////  CONSTRUCTORS  /////////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Creates a new ApplicationStarterException instance with the arguments passed in.
   *
   * @param aMessage The message describing the error.
   * @param aSourceError The source error to encapsulate.
   */
  public ApplicationStarterException(String aMessage, Throwable aSourceError) {
    super(aMessage);
    _theSourceError = aSourceError;
  }

  /////////////////////////////////////////////////////////////////////////////////////////
  //////////////////////////////////  ACCESSOR METHODS  ///////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Returns the source error encapsulated in this exception.
   *
   * @return The source error encapsulated in this exception.
   */
  public Throwable getSourceError() {
    return _theSourceError;
  }

  /////////////////////////////////////////////////////////////////////////////////////////
  //////////////////////////////////  OVERRIDEN METHODS  //////////////////////////////////
  /////////////////////////////////////////////////////////////////////////////////////////

  /**
   * Prints the stack trace of this exception to the standard error stream.
   */
  public void printStackTrace() {
    printStackTrace(System.err);
  }

  /**
   * Prints the stack trace of this exception to the print writer passed in.
   */
  public void printStackTrace(PrintWriter anOutput) {
    super.printStackTrace(anOutput);

    if (_theSourceError != null) {
      anOutput.print("\n---> NESTED EXCEPTION IS: ");
      _theSourceError.printStackTrace(anOutput);
    }
  }

  /**
   * Prints the stack trace of this exception to the print stream passed in.
   */
  public void printStackTrace(PrintStream anOutput) {
    super.printStackTrace(anOutput);

    if (_theSourceError != null) {
      anOutput.print("\n---> NESTED EXCEPTION IS: ");
      _theSourceError.printStackTrace(anOutput);
    }
  }
}
