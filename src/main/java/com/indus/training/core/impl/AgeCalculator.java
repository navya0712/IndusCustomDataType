package com.indus.training.core.impl;

import com.indus.training.core.domain.AgeCalculatorInput;
import com.indus.training.core.domain.AgeCalculatorOutput;
import com.indus.training.core.svc.IAgeCalculator;

/**
 * The AgeCalculator class implements the {@link IAgeCalculator} interface to
 * provide the functionality for calculating age based on the provided birth
 * year and current year.
 */
public class AgeCalculator implements IAgeCalculator {

	/**
	 * Calculates the age based on the provided input data.
	 *
	 * @param ageInObj an instance of {@link AgeCalculatorInput} containing the
	 *                 birth year and current year
	 * @return an instance of {@link AgeCalculatorOutput} containing the birth year,
	 *         current year, and the calculated age
	 */
	@Override
	public AgeCalculatorOutput calculateAge(AgeCalculatorInput ageInObj) {
		AgeCalculatorOutput agecalOutObj = null;
		{
			int currentYear = ageInObj.currentYear;
			int birthYear = ageInObj.birthYear;
			int age = currentYear - birthYear;
			agecalOutObj = new AgeCalculatorOutput();
			agecalOutObj.currentYear = currentYear;
			agecalOutObj.birthYear = birthYear;
			agecalOutObj.age = age;

		}
		return agecalOutObj;
	}

}
