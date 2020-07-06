package com.github.cleydyr;

import static org.junit.Assert.assertTrue;

import javax.measure.Quantity;
import javax.measure.quantity.Length;

import org.junit.Test;

public class PimacoTagSheetTest {
	@Test
	public void shouldAnswerWithTrue()
	{
		PimacoTagSheet s1 = PimacoTagSheet._3080;

		assertTrue(_compare(s1.getHoriziontalSpacing(), 0.31));

		PimacoTagSheet s2 = PimacoTagSheet._3182;

		assertTrue(_compare(s2.getHoriziontalSpacing(), 0.52));

		assertTrue(_compare(s2.getVerticalSpacing(), 0));

		assertTrue(_compare(SheetSize.A4.getSheetHeight(), 29.7));

		assertTrue(_compare(SheetSize.A4.getSheetWidth(), 21));
		
		assertTrue(_compare(SheetSize.LETTER.getSheetHeight(),  27.94));

		assertTrue(_compare(SheetSize.LETTER.getSheetWidth(), 21.59));
	}

	private static boolean _compare(
		Quantity<Length> measure, double otherValue) {

		return _compareValuesWithError(
			measure.getValue().doubleValue(), otherValue, 1e6);
	}

	private static boolean _compareValuesWithError(
		double d1, double d2, double error) {

		return Math.abs(d1 - d2) < error;
	}
}
