package com.indus.training.core.impl;

import com.indus.training.core.domain.PowerOfNumberCalculatorInput;
import com.indus.training.core.domain.PowerOfNumberCalculatorOutput;
import com.indus.training.core.svc.IPowerOfNumberCalculator;

/**
 * The PowerOfNumberCalculator class implements the
 * {@link IPowerOfNumberCalculator} interface to provide functionality for
 * calculating the power of a number based on the given base and exponent.
 */
public class PowerOfNumberCalculator implements IPowerOfNumberCalculator {

	/**
	 * Calculates the power of a base number raised to a specified exponent.
	 *
	 * @param powCalInpObj an instance of {@link PowerOfNumberCalculatorInput}
	 *                     containing the base number and the exponent
	 * @return an instance of {@link PowerOfNumberCalculatorOutput} containing the
	 *         base number, the exponent, and the calculated result
	 */
	@Override
	public PowerOfNumberCalculatorOutput calculatePower(PowerOfNumberCalculatorInput powCalInpObj) {

		PowerOfNumberCalculatorOutput powCalOutObj = null;
		{
			double base = powCalInpObj.base;
			double exponent = powCalInpObj.exponent;
			double result = Math.pow(base, exponent);
			powCalOutObj = new PowerOfNumberCalculatorOutput();
			powCalOutObj.base = base;
			powCalOutObj.exponent = exponent;
			powCalOutObj.result = result;

		}
		return powCalOutObj;
	}

}
