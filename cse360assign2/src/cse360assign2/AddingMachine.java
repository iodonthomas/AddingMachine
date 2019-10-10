/**
 * 
 * @author Don Thomas
 * Class ID: 70642 (Wednesday 9:40-10:30am)
 * Assignment 2
 *
 */

package cse360assign2;

/**
 * 
 * AddingMachine contains functions to add, subtract, 
 * return history of operations, return answer, and clear operations.
 *
 */

public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * 
	 * Constructor initializes history and answer variables.
	 * 
	 */
	
	public AddingMachine () {
		total = 0;  
		history = "0";
	}
	
	/**
	 * 
	 * return the answer variable.
	 * 
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * 
	 * Add input value to the total and to history.
	 * 
	 */
	
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	/**
	 * 
	 * Subtract input value to the total and add to history.
	 * 
	 */
	
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}
	
	/**
	 * 
	 * Return a string variable with history of all operations, not cleared.
	 * 
	 */
	
	public String toString () {
		return history;
	}
	
	/**
	 * 
	 * Sets variables back to constructor stage.
	 * History of operations and answer return to "0".
	 * 
	 */
	
	public void clear() {
		total = 0;
		history = "0";
	}
	
}
