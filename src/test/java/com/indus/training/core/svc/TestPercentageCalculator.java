package com.indus.training.core.svc;

import com.indus.training.core.domain.PercentageCalculatorInput;
import com.indus.training.core.domain.PercentageCalculatorOutput;
import com.indus.training.core.impl.PercentageCalculator;

import junit.framework.TestCase;

public class TestPercentageCalculator extends TestCase {

	private PercentageCalculator testCalObj = null;

	protected void setUp() throws Exception {
		testCalObj = new PercentageCalculator();
	}

	protected void tearDown() throws Exception {
		testCalObj = null;
	}

	public void testCalculatePercentage() {

		// 1. Inputs
		PercentageCalculatorInput perCalInObj = new PercentageCalculatorInput();
		perCalInObj.param1 = 100.0;
		perCalInObj.param2 = 20.0;

		// 2. Expected Result
		PercentageCalculatorOutput ExpPerCalOutObj = new PercentageCalculatorOutput();
		ExpPerCalOutObj.param1 = 100.0;
		ExpPerCalOutObj.param2 = 20.0;
		ExpPerCalOutObj.result = 20.0;

		// 3. Actual Result
		PercentageCalculatorOutput ActPerCalOutObj = testCalObj.calculatePercentage(perCalInObj);

		// 4. Assertion
		assertEquals(ExpPerCalOutObj.param1, ActPerCalOutObj.param1, 0);
		assertEquals(ExpPerCalOutObj.param2, ActPerCalOutObj.param2, 0);
		assertEquals(ExpPerCalOutObj.result, ActPerCalOutObj.result, 0);

	}

}
