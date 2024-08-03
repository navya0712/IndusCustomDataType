package com.indus.training.core.svc;

import com.indus.training.core.domain.CelsiusFahrenheitConverterInput;
import com.indus.training.core.domain.CelsiusFahrenheitConverterOutput;
import com.indus.training.core.impl.CelsiusFahrenheitConverter;

import junit.framework.TestCase;

public class TestCelsiusFahrenheitConverter extends TestCase {

	private CelsiusFahrenheitConverter celFahConObj = null;

	protected void setUp() throws Exception {
		celFahConObj = new CelsiusFahrenheitConverter();
	}

	protected void tearDown() throws Exception {
		celFahConObj = null;
	}

	public void testCelciusToFahrenheit() {

		// 1. Inputs
		CelsiusFahrenheitConverterInput celFahInpObj = new CelsiusFahrenheitConverterInput();
		celFahInpObj.param1 = 25.0;

		// 2. Expected Result
		CelsiusFahrenheitConverterOutput ExpCelFahObj = new CelsiusFahrenheitConverterOutput();
		ExpCelFahObj.param1 = 25.0;
		ExpCelFahObj.result = 77.0;

		// 3. Actual Result
		CelsiusFahrenheitConverterOutput ActCelFahObj = celFahConObj.celciusToFahrenheit(celFahInpObj);

		// 4. Assertion
		assertEquals(ExpCelFahObj.param1, ActCelFahObj.param1, 0);
		assertEquals(ExpCelFahObj.result, ActCelFahObj.result, 0);

	}

	public void testFahrenheitToCelsius() {

		// 1. Inputs
		CelsiusFahrenheitConverterInput celFahInpObj = new CelsiusFahrenheitConverterInput();
		celFahInpObj.param1 = 77.0;

		// 2. Expected Result
		CelsiusFahrenheitConverterOutput ExpCelFahObj = new CelsiusFahrenheitConverterOutput();
		ExpCelFahObj.param1 = 77.0;
		ExpCelFahObj.result = 25.0;

		// 3. Actual Result
		CelsiusFahrenheitConverterOutput ActCelFahObj = celFahConObj.FahrenheitToCelsius(celFahInpObj);

		// 4. Assertion
		assertEquals(ExpCelFahObj.param1, ActCelFahObj.param1, 0);
		assertEquals(ExpCelFahObj.result, ActCelFahObj.result, 0);
	}

}
