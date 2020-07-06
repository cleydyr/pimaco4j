package com.github.cleydyr;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

public class PimacoLabelSheetTest {
	private static final double _MAXIMUM_ERROR = 1e-6;

	@Test
	public void shouldAnswerWithTrue()
	{
		PimacoLabelSheet s1 = PimacoLabelSheet._3080;

		assertTrue(_compare(s1.getHoriziontalSpacing(), 0.31));

		PimacoLabelSheet s2 = PimacoLabelSheet._3182;

		assertTrue(_compare(s2.getHoriziontalSpacing(), 0.52));

		assertTrue(_compare(s2.getVerticalSpacing(), 0));

		assertTrue(_compare(SheetSize.A4.getSheetHeight(), 29.7));

		assertTrue(_compare(SheetSize.A4.getSheetWidth(), 21));
		
		assertTrue(_compare(SheetSize.LETTER.getSheetHeight(),  27.94));

		assertTrue(_compare(SheetSize.LETTER.getSheetWidth(), 21.59));

		Optional<PimacoLabelSheet> s3 = PimacoLabelSheet.getByCode("A4365");

		assertTrue(s3.isPresent());

		assertTrue(s3.get().getColumns() == 2);

		assertFalse(PimacoLabelSheet.getByCode("B4365").isPresent());
	}

	private static boolean _compare(
		double measure, double otherValue) {

		return _compareValuesWithError(measure, otherValue, _MAXIMUM_ERROR);
	}

	private static boolean _compareValuesWithError(
		double d1, double d2, double error) {

		return Math.abs(d1 - d2) < error;
	}
}
