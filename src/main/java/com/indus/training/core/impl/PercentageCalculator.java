package com.indus.training.core.impl;

import com.indus.training.core.domain.PercentageCalculatorInput;
import com.indus.training.core.domain.PercentageCalculatorOutput;
import com.indus.training.core.svc.IPercentageCalculator;

/**
 * The PercentageCalculator class implements the IPercentageCalculator interface
 * to provide functionality for calculating the percentage of a given value.
 */
public class PercentageCalculator implements IPercentageCalculator {

	/**
	 * Calculates the percentage of a given value based on the provided input data.
	 *
	 * @param perCalInpObj an instance of {@link PercentageCalculatorInput}
	 *                     containing the value and the percentage to be calculated
	 * @return an instance of {@link PercentageCalculatorOutput} containing the
	 *         original value, the percentage, and the calculated result
	 */
	@Override
	public PercentageCalculatorOutput calculatePercentage(PercentageCalculatorInput perCalInpObj) {

		PercentageCalculatorOutput perCalOutObj = null;
		{
			double param1 = perCalInpObj.param1;
			double param2 = perCalInpObj.param2;
			double result = (param1 * param2) / 100.0;
			perCalOutObj = new PercentageCalculatorOutput();
			perCalOutObj.param1 = param1;
			perCalOutObj.param2 = param2;
			perCalOutObj.result = result;

		}
		return perCalOutObj;
	}

}
