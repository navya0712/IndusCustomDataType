package com.indus.training.core.svc;

import com.indus.training.core.domain.BMICalculatorInput;
import com.indus.training.core.domain.BMICalculatorOutput;
import com.indus.training.core.impl.BMICalculator;

import junit.framework.TestCase;

public class TestBMICalculator extends TestCase {

	private BMICalculator BMIcalObj = null;

	protected void setUp() throws Exception {
		BMIcalObj = new BMICalculator();
	}

	protected void tearDown() throws Exception {
		BMIcalObj = null;
	}

	public void testCalculateBMI() {

		// 1. Inputs
		BMICalculatorInput BMIInpObj = new BMICalculatorInput();
		BMIInpObj.height = 2.0;
		BMIInpObj.weight = 100.0;

		// 2. Expected Result
		BMICalculatorOutput BMIExpResult = new BMICalculatorOutput();
		BMIExpResult.height = 2.0;
		BMIExpResult.weight = 100.0;
		BMIExpResult.result = 25.0;

		// 3. Actual Result
		BMICalculatorOutput BMIActualResult = BMIcalObj.calculateBMI(BMIInpObj);

		// 4. Assertion
		assertEquals(BMIExpResult.height, BMIActualResult.height, 0);
		assertEquals(BMIExpResult.weight, BMIActualResult.weight, 0);
		assertEquals(BMIExpResult.result, BMIActualResult.result, 0);

	}

}
