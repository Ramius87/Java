package de.wurzlersteffen.bmi.controller;

/**
 * Class with to inner classes for implementing the BMICalculator Interface 
 * either as a summer or a winter version
 * 
 * @since 1.0.0
 *
 */
class BMICalculatorImpl {
	/**
	 * Constant which determines the additional tolerance for a 
	 * winter BMI Calculation
	 */
	public static final double TOLERANCE = 1.0;
	
	/**
	 * Summer version of BMI Calculator Implementation
	 * 
	 * @since 1.0.0
	 *
	 */
	class BMISummerCalculatorImpl implements BMICalculator {
		/**
		 * {@inheritDoc}
		 */
		public String check(BMIBody body) {
			double bmi = body.getWeight() / (body.getSize() * body.getSize());
			String result = null;
			
			if (bmi >= BMI_MAX) {
				result = "overweight";
			} else if (bmi < BMI_MIN) {
				result = "underweight";
			} else {
				result = "normalweight";
			}
			
			return result;
		}
	}
	
	/**
	 * Winter version of BMI Calculator Implementation
	 * 
	 * @since 1.0.0
	 *
	 */
	class BMIWinterCalculatorImpl implements BMICalculator {
		/**
		 * {@inheritDoc}
		 */
		public String check(BMIBody body) {
			double bmi = body.getWeight() / (body.getSize() * body.getSize());
			String result = null;
			
			if (bmi >= BMI_MAX + TOLERANCE) {
				result = "overweight";
			} else if (bmi < BMI_MIN) {
				result = "underweight";
			} else {
				result = "normalweight";
			}
			
			return result;
		}
	}
}
