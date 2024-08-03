package com.indus.training.core.impl;

import com.indus.training.core.domain.BMICalculatorInput;
import com.indus.training.core.domain.BMICalculatorOutput;
import com.indus.training.core.svc.IBMICalculator;

/**
 * The BMICalculator class implements the {@link IBMICalculator} interface to
 * provide the functionality for calculating Body Mass Index (BMI) based on the
 * provided weight and height.
 */
public class BMICalculator implements IBMICalculator {

	/**
	 * Calculates the Body Mass Index (BMI) based on the provided input data.
	 *
	 * @param bMIInpObj an instance of {@link BMICalculatorInput} containing the
	 *                  weight and height for BMI calculation
	 * @return an instance of {@link BMICalculatorOutput} containing the weight,
	 *         height, and the calculated BMI result
	 */
	@Override
	public BMICalculatorOutput calculateBMI(BMICalculatorInput bMIInpObj) {
		BMICalculatorOutput BMIOutObj = null;
		{
			double height = bMIInpObj.height;
			double weight = bMIInpObj.weight;
			double result = bMIInpObj.weight / Math.pow(bMIInpObj.height, 2);
			BMIOutObj = new BMICalculatorOutput();
			BMIOutObj.height = height;
			BMIOutObj.weight = weight;
			BMIOutObj.result = result;

		}
		return BMIOutObj;
	}

}
