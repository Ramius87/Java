package de.wurzlersteffen.bmi.controller;

/** 
 * Interface to implement the methods of a Body,
 * which are needed for BMI calculation
 * 
 * since 1.0.0
 *
 */
public interface BMIBody {

	/**
	 * Returns weight of a BMIBody in kg
	 * 
	 * @return Weight in kg of a BMIBody
	 */
	public double getWeight();
	
	/**
	 * Returns size of a BMIBody in m
	 * 
	 * @return Size in m of a BMIBody
	 */
	public double getSize();
	
}
