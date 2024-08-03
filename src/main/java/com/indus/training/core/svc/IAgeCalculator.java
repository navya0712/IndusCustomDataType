package com.indus.training.core.svc;

import com.indus.training.core.domain.AgeCalculatorInput;
import com.indus.training.core.domain.AgeCalculatorOutput;

/**
 * Description: The IAgeCalculator provides methods for calculating the age It
 * can be implemented to calculate the age based on the birth year and current
 * year
 */
public interface IAgeCalculator {

	/**
	 * Calculates the age based on the provided input.
	 *
	 * @param ageInObj an instance of {@link AgeCalculatorInput} containing the
	 *                 birth year and current year for age calculation
	 * @return an instance of {@link AgeCalculatorOutput} containing the birth year,
	 *         current year, and the calculated age
	 */
	public AgeCalculatorOutput calculateAge(AgeCalculatorInput ageInObj);

}
