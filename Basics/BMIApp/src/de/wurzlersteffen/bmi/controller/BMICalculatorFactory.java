package de.wurzlersteffen.bmi.controller;

/**
 * Design Pattern <b>Factory Method</b> to create instances of 
 * Winter or Summer BMI Calculator Implementations
 * 
 * @since 1.0.0
 *
 */
public class BMICalculatorFactory {
	
	/**
	 * Constant which designates the value for the Winter Selection
	 */
	public final static int WINTER_SELECTION = 1;
	
	/**
	 * Creates an instance of an implementation of a winter or a summer BMI
	 * Calculator depending on the given parameter
	 * 
	 * @param selection designates whether winter or summer BMI Calculation 
	 * 					should be used
	 * @return An Implementation of either a winter or a Summer BMI Calculator
	 */
	public static BMICalculator createInstance(int selection) {
		if (selection == WINTER_SELECTION) {
			return new BMICalculatorImpl().new BMIWinterCalculatorImpl();
		} else {
			return new BMICalculatorImpl().new BMISummerCalculatorImpl();
		}
	}

}
