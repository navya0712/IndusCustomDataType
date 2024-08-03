package com.indus.training.core.svc;

import com.indus.training.core.domain.PercentageCalculatorInput;
import com.indus.training.core.domain.PercentageCalculatorOutput;

/**
 * The IPercentageCalculator interface defines the contract for calculating
 * percentages based on provided input data.
 */
public interface IPercentageCalculator {

	/**
	 * Calculates the percentage based on the provided input.
	 *
	 * @param perCalInpObj an instance of {@link PercentageCalculatorInput}
	 *                     containing the necessary data for percentage computation
	 * @return an instance of {@link PercentageCalculatorOutput} containing the
	 *         calculated percentage
	 */
	public PercentageCalculatorOutput calculatePercentage(PercentageCalculatorInput perCalInpObj);

}
