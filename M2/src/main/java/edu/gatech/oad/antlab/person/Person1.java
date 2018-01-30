package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 1
 *  returns their name and a
 *  modified string 
 *  
<<<<<<< HEAD:M2/src/main/java/edu/gatech/oad/antlab/person/Person1.java
 *  @author Matthew McKelvey
=======
 *  @author Bob
>>>>>>> f38f5aa09f0dd4e203bca0f63249dde5a6ce95d6:M2/src/main/java/edu/gatech/oad/antlab/person/Person1.java
 *  @version 1.1
 */
public class Person1 {
  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person1(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
<<<<<<< HEAD:M2/src/main/java/edu/gatech/oad/antlab/person/Person1.java
	  String front = input.substring(0, 2);
	  String back = input.substring(2, input.length());
	  return back + front;
=======
	  //Person 1 put your implementation here
	  return null;
>>>>>>> f38f5aa09f0dd4e203bca0f63249dde5a6ce95d6:M2/src/main/java/edu/gatech/oad/antlab/person/Person1.java
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

}
