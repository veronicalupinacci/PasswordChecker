/**
 * Interface for the passwordChecker
 * 
 * @version March 30, 2023
 */

public interface PasswordChecker {
	// abstract methods
	public boolean checkLenght();

	public boolean checkSpecialCharacter();

	public boolean checkUpperCase();

	public boolean checkNumber();
}
