package com.indus.training.core.svc;

import com.indus.training.core.domain.CelsiusFahrenheitConverterInput;
import com.indus.training.core.domain.CelsiusFahrenheitConverterOutput;

/**
 * The ICelsiusFahrenheitConverter interface defines the contract for converting
 * temperatures between Celsius and Fahrenheit.
 */
public interface ICelsiusFahrenheitConverter {

	/**
	 * Converts a temperature from Celsius to Fahrenheit.
	 *
	 * @param celFahConInpObj an instance of {@link CelsiusFahrenheitConverterInput}
	 *                        containing the temperature in Celsius to be converted
	 * @return an instance of {@link CelsiusFahrenheitConverterOutput} containing
	 *         the converted temperature in Fahrenheit
	 */
	public CelsiusFahrenheitConverterOutput celciusToFahrenheit(CelsiusFahrenheitConverterInput celFahConInpObj);

	/**
	 * Converts a temperature from Fahrenheit to Celsius.
	 *
	 * @param celFahConInpObj an instance of {@link CelsiusFahrenheitConverterInput}
	 *                        containing the temperature in Fahrenheit to be
	 *                        converted
	 * @return an instance of {@link CelsiusFahrenheitConverterOutput} containing
	 *         the converted temperature in Celsius
	 */
	public CelsiusFahrenheitConverterOutput FahrenheitToCelsius(CelsiusFahrenheitConverterInput celFahConInpObj);
}
