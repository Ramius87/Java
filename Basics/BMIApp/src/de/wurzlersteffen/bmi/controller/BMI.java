package de.wurzlersteffen.bmi.controller;

/**
 * Super-Inteface for BMI-Calculator
 * 
 * @since 1.0.0
 * @see <a href="https://en.wikipedia.org/wiki/Body_mass_index">Wikipedia</a> 
 */
public interface BMI {

	/**
	 * Constant to determine border to overweight
	 */
	public static final double BMI_MAX = 25.0;
	
	/**
	 * Constant to determine border to underweight
	 */
	public static final double BMI_MIN = 18.0;
	
	/**
	 *  Constant to determine maximum of results
	 *  which can be calculated within 1 program
	 *  start
	 */
	public static final int MAX_COUNT = 100;

}