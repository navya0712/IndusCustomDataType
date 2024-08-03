package com.indus.training.core.svc;

import com.indus.training.core.domain.InterestCalculatorInput;
import com.indus.training.core.domain.InterestCalculatorOutput;
import com.indus.training.core.impl.InterestCalculator;

import junit.framework.TestCase;

public class TestInterestCalculator extends TestCase {

	private InterestCalculator intCalObj = null;

	protected void setUp() throws Exception {
		intCalObj = new InterestCalculator();
	}

	protected void tearDown() throws Exception {
		intCalObj = null;
	}

	public void testCalculateInterest() {

		// 1. Inputs
		InterestCalculatorInput intCalInpObj = new InterestCalculatorInput();
		intCalInpObj.principal = 100;
		intCalInpObj.rate = 20.0;
		intCalInpObj.time = 2.0;

		// 2. Expected Result
		InterestCalculatorOutput ExpIntCalOupObj = new InterestCalculatorOutput();
		ExpIntCalOupObj.principal = 100;
		ExpIntCalOupObj.rate = 20.0;
		ExpIntCalOupObj.time = 2.0;
		ExpIntCalOupObj.interest = 40.0;

		// 3. Actual Result
		InterestCalculatorOutput ActualIntCalOupObj = intCalObj.calculateInterest(intCalInpObj);

		// 4. Assertion
		assertEquals(ExpIntCalOupObj.principal, ActualIntCalOupObj.principal, 0);
		assertEquals(ExpIntCalOupObj.rate, ActualIntCalOupObj.rate, 0);
		assertEquals(ExpIntCalOupObj.time, ActualIntCalOupObj.time, 0);
		assertEquals(ExpIntCalOupObj.interest, ActualIntCalOupObj.interest, 0);
	}

}
