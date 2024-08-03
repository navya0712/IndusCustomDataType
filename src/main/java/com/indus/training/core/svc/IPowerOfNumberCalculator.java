package com.indus.training.core.svc;

import com.indus.training.core.domain.PowerOfNumberCalculatorInput;
import com.indus.training.core.domain.PowerOfNumberCalculatorOutput;

/**
 * The IPowerOfNumberCalculator interface defines the contract for calculating
 * the power of a number.
 */
public interface IPowerOfNumberCalculator {

	/**
	 * Calculates the power of a number based on the provided input.
	 *
	 * @param powCalInpObj an instance of {@link PowerOfNumberCalculatorInput}
	 *                     containing the base number and the exponent for the power
	 *                     calculation
	 * @return an instance of {@link PowerOfNumberCalculatorOutput} containing the
	 *         result of the power calculation
	 */
	public PowerOfNumberCalculatorOutput calculatePower(PowerOfNumberCalculatorInput powCalInpObj);

}
