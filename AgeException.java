/**
 * 
 */
package BrandlExamDemo;

/**
 * @author nadiabrandl
 *
 */
public class AgeException extends Exception {

    public AgeException() {
	super("Age is invalid");
    }

    public AgeException(String message) {
	super(message);
    }
}
