package com.indus.training.core.impl;

import com.indus.training.core.domain.CelsiusFahrenheitConverterInput;
import com.indus.training.core.domain.CelsiusFahrenheitConverterOutput;
import com.indus.training.core.svc.ICelsiusFahrenheitConverter;

/**
 * The CelsiusFahrenheitConverter class implements the
 * {@link ICelsiusFahrenheitConverter} interface to provide functionality for
 * converting temperatures between Celsius and Fahrenheit.
 */
public class CelsiusFahrenheitConverter implements ICelsiusFahrenheitConverter {

	/**
	 * Converts a temperature from Celsius to Fahrenheit.
	 *
	 * @param celFahConInpObj an instance of {@link CelsiusFahrenheitConverterInput}
	 *                        containing the temperature in Celsius to be converted
	 * @return an instance of {@link CelsiusFahrenheitConverterOutput} containing
	 *         the original temperature in Celsius and the converted temperature in
	 *         Fahrenheit
	 */
	@Override
	public CelsiusFahrenheitConverterOutput celciusToFahrenheit(CelsiusFahrenheitConverterInput celFahConInpObj) {

		CelsiusFahrenheitConverterOutput celFahConOutObj = null;
		{
			double param1 = celFahConInpObj.param1;
			double result = (9.0 / 5.0) * param1 + 32;
			celFahConOutObj = new CelsiusFahrenheitConverterOutput();
			celFahConOutObj.param1 = param1;
			celFahConOutObj.result = result;

		}
		return celFahConOutObj;
	}

	/**
	 * Converts a temperature from Fahrenheit to Celsius.
	 *
	 * @param celFahConInpObj an instance of {@link CelsiusFahrenheitConverterInput}
	 *                        containing the temperature in Fahrenheit to be
	 *                        converted
	 * @return an instance of {@link CelsiusFahrenheitConverterOutput} containing
	 *         the original temperature in Fahrenheit and the converted temperature
	 *         in Celsius
	 */
	@Override
	public CelsiusFahrenheitConverterOutput FahrenheitToCelsius(CelsiusFahrenheitConverterInput celFahConInpObj) {

		CelsiusFahrenheitConverterOutput celFahConOutObj = null;
		{
			double param1 = celFahConInpObj.param1;
			double result = (param1 - 32) * (5.0 / 9.0);
			celFahConOutObj = new CelsiusFahrenheitConverterOutput();
			celFahConOutObj.param1 = param1;
			celFahConOutObj.result = result;

		}
		return celFahConOutObj;
	}

}
