package com.github.cleydyr;

/**
 * Enumeration of different sheet sizes (as defined by the
 * <a href="https://www.iso.org/standard/36631.html">ISO 216</a> standard) used
 * to produce Pimaco tag sheets.
 */
public enum SheetSize {
	A4(21, 29.7), LETTER(21.59, 27.94);

	private double sheetWidth;

	private double sheetHeight;

	private SheetSize(double sheetWidth, double sheetHeight) {
		this.sheetWidth = sheetWidth;
		this.sheetHeight = sheetHeight;
	}

	/**
	 * Gets the sheet width.
	 * @return the sheet width (in centimeters)
	 */
	public double getSheetWidth() {
		return sheetWidth;
	}

	/**
	 * Gets the sheet height.
	 * @return the sheet height (in centimeters)
	 */
	public double getSheetHeight() {
		return sheetHeight;
	}
}
