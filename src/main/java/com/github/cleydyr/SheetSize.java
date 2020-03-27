package com.github.cleydyr;

import java.math.BigDecimal;
import java.util.function.Function;

import javax.measure.MetricPrefix;
import javax.measure.Quantity;
import javax.measure.quantity.Length;

import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;

public enum SheetSize {
	A4(21.0, 29.7), LETTER(21.59, 27.94);

	private SheetSize(double sheetWidth, double sheetHeight) {
		Function<Double, Quantity<Length>> converter =
				quantity -> Quantities.getQuantity(
					new BigDecimal(quantity), MetricPrefix.CENTI(Units.METRE));

		this.sheetWidth = converter.apply(sheetWidth);
		this.sheetHeight = converter.apply(sheetHeight);
	}

	public Quantity<Length> getSheetWidth() {
		return sheetWidth;
	}

	public Quantity<Length> getSheetHeight() {
		return sheetHeight;
	}

	private Quantity<Length> sheetWidth;

	private Quantity<Length> sheetHeight;
}
