package de.wurzlersteffen.bmi.controller;

/** 
 * BMICalculator ensures the check method is implemented
 * by any BMI Calculator Implementation
 * 
 * @since 1.0.0
 *
 */
public interface BMICalculator extends BMI {
	
	/**
	 * Calculates the BMI and compares it with the upper and 
	 * lower border
	 * 
	 * @param body Object of which the BMI shall be calculated
	 * @return "Overweight", "Normalweight" or "Underweight"
	 */
	public String check(BMIBody body);
}
