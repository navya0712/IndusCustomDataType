package com.indus.training.core.impl;

import com.indus.training.core.domain.InterestCalculatorInput;
import com.indus.training.core.domain.InterestCalculatorOutput;
import com.indus.training.core.svc.IInterestCalculator;

/**
 * The InterestCalculator class implements the IInterestCalculator interface to
 * provide functionality for calculating simple interest based on the provided
 * principal amount, rate of interest, and time period.
 */
public class InterestCalculator implements IInterestCalculator {

	/**
	 * Calculates simple interest based on the provided input data.
	 *
	 * @param intCalInpObj an instance of {@link InterestCalculatorInput} containing
	 *                     the principal amount, rate of interest, and time period
	 * @return an instance of {@link InterestCalculatorOutput} containing the
	 *         principal amount, rate of interest, time period, and the calculated
	 *         interest
	 */
	@Override
	public InterestCalculatorOutput calculateInterest(InterestCalculatorInput intCalInpObj) {
		InterestCalculatorOutput intCalOutObj = null;
		{
			double principal = intCalInpObj.principal;
			double rate = intCalInpObj.rate;
			double time = intCalInpObj.time;
			double interest = (principal * rate * time) / 100;
			intCalOutObj = new InterestCalculatorOutput();
			intCalOutObj.principal = principal;
			intCalOutObj.rate = rate;
			intCalOutObj.time = time;
			intCalOutObj.interest = interest;

		}
		return intCalOutObj;
	}

}
