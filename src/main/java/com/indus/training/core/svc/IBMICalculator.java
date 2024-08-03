package com.indus.training.core.svc;

import com.indus.training.core.domain.BMICalculatorInput;
import com.indus.training.core.domain.BMICalculatorOutput;

/**
 * The IBMICalculator interface defines the contract for calculating Body Mass
 * Index (BMI).
 */
public interface IBMICalculator {

	/**
	 * Calculates the Body Mass Index (BMI) based on the provided input.
	 *
	 * @param bMIInpObj an instance of {@link BMICalculatorInput} containing the
	 *                  weight and height for BMI calculation
	 * @return an instance of {@link BMICalculatorOutput} containing the weight,
	 *         height, and the calculated BMI
	 */
	public BMICalculatorOutput calculateBMI(BMICalculatorInput bMIInpObj);

}
