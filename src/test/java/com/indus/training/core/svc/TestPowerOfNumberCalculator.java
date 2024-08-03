package com.indus.training.core.svc;

import com.indus.training.core.domain.PowerOfNumberCalculatorInput;
import com.indus.training.core.domain.PowerOfNumberCalculatorOutput;
import com.indus.training.core.impl.PowerOfNumberCalculator;

import junit.framework.TestCase;

public class TestPowerOfNumberCalculator extends TestCase {

	private PowerOfNumberCalculator powCalObj = null;

	protected void setUp() throws Exception {
		powCalObj = new PowerOfNumberCalculator();
	}

	protected void tearDown() throws Exception {
		powCalObj = null;
	}

	public void testCalculatePower() {

		// 1. Inputs
		PowerOfNumberCalculatorInput powCalInpObj = new PowerOfNumberCalculatorInput();
		powCalInpObj.base = 2.0;
		powCalInpObj.exponent = 3.0;

		// 2. Expected Result
		PowerOfNumberCalculatorOutput ExpPowCalObj = new PowerOfNumberCalculatorOutput();
		ExpPowCalObj.base = 2.0;
		ExpPowCalObj.exponent = 3.0;
		ExpPowCalObj.result = 8.0;

		// 3. Actual Result
		PowerOfNumberCalculatorOutput ActPowCalObj = powCalObj.calculatePower(powCalInpObj);

		// 4. Assertion
		assertEquals(ExpPowCalObj.base, ActPowCalObj.base, 0);
		assertEquals(ExpPowCalObj.exponent, ActPowCalObj.exponent, 0);
		assertEquals(ExpPowCalObj.result, ActPowCalObj.result, 0);

	}

}
