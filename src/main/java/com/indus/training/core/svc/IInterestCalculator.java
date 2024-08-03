package com.indus.training.core.svc;

import com.indus.training.core.domain.InterestCalculatorInput;
import com.indus.training.core.domain.InterestCalculatorOutput;

/**
 * The IInterestCalculator interface defines the contract for calculating
 * interest based on provided input data.
 */
public interface IInterestCalculator {

	/**
	 * Calculates the interest based on the provided input.
	 *
	 * @param intCalInpObj an instance of {@link InterestCalculatorInput} containing
	 *                     the necessary data (such as principal, rate, and time)
	 *                     for interest calculation
	 * @return an instance of {@link InterestCalculatorOutput} containing the
	 *         calculated interest and inputs provided
	 */
	public InterestCalculatorOutput calculateInterest(InterestCalculatorInput intCalInpObj);
}
