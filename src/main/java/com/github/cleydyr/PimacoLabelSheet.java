package com.github.cleydyr;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>Enumeration containing all Pimaco sheet models.</p>
 * <p>Each model has the measure needed to author documents whose content needs
 * to fit in a label from the Pimaco manufacturer.</p>
 */
public enum PimacoLabelSheet {

	_3080(SheetSize.LETTER, "3080", 1.27, 0.48, 2.54, 6.98, 2.54, 6.67, 3, 10),
	_3180(SheetSize.LETTER, "3180", 1.27, 0.48, 2.54, 6.98, 2.54, 6.67, 3, 10),

	_3082(SheetSize.LETTER, "3082", 2.12, 0.40, 3.39, 10.68, 3.39, 10.16, 2, 7),
	_3182(SheetSize.LETTER, "3182", 2.12, 0.40, 3.39, 10.68, 3.39, 10.16, 2, 7),

	_5580A(SheetSize.LETTER, "5580A", 1.27, 0.48, 2.54, 6.98, 2.54, 6.67, 3, 10),
	_5580M(SheetSize.LETTER, "5580M", 1.27, 0.48, 2.54, 6.98, 2.54, 6.67, 3, 10),
	_5580V(SheetSize.LETTER, "5580V", 1.27, 0.48, 2.54, 6.98, 2.54, 6.67, 3, 10),

	_6080(SheetSize.LETTER, "6080", 1.27, 0.48, 2.54, 6.98, 2.54, 6.67, 3, 10),
	_6180(SheetSize.LETTER, "6180", 1.27, 0.48, 2.54, 6.98, 2.54, 6.67, 3, 10),
	_6280(SheetSize.LETTER, "6280", 1.27, 0.48, 2.54, 6.98, 2.54, 6.67, 3, 10),
	_62580(SheetSize.LETTER, "62580", 1.27, 0.48, 2.54, 6.98, 2.54, 6.67, 3, 10),

	_6081(SheetSize.LETTER, "6081", 1.27, 0.40, 2.54, 10.68, 2.54, 10.16, 2, 10),
	_6181(SheetSize.LETTER, "6181", 1.27, 0.40, 2.54, 10.68, 2.54, 10.16, 2, 10),
	_6281(SheetSize.LETTER, "6281", 1.27, 0.40, 2.54, 10.68, 2.54, 10.16, 2, 10),
	_62581(SheetSize.LETTER, "62581", 1.27, 0.40, 2.54, 10.68, 2.54, 10.16, 2, 10),

	_6082(SheetSize.LETTER, "6082", 2.12, 0.40, 3.39, 10.68, 3.39, 10.16, 2, 7),
	_6182(SheetSize.LETTER, "6182", 2.12, 0.40, 3.39, 10.68, 3.39, 10.16, 2, 7),
	_6282(SheetSize.LETTER, "6282", 2.12, 0.40, 3.39, 10.68, 3.39, 10.16, 2, 7),
	_62582(SheetSize.LETTER, "62582", 2.12, 0.40, 3.39, 10.68, 3.39, 10.16, 2, 7),

	_6083(SheetSize.LETTER, "6083", 1.27, 0.40, 5.08, 10.68, 5.08, 10.16, 2, 5),
	_6183(SheetSize.LETTER, "6183", 1.27, 0.40, 5.08, 10.68, 5.08, 10.16, 2, 5),
	_6283(SheetSize.LETTER, "6283", 1.27, 0.40, 5.08, 10.68, 5.08, 10.16, 2, 5),

	_6084(SheetSize.LETTER, "6084", 1.27, 0.40, 8.47, 10.68, 8.47, 10.16, 2, 3),
	_6184(SheetSize.LETTER, "6184", 1.27, 0.40, 8.47, 10.68, 8.47, 10.16, 2, 3),
	_6284(SheetSize.LETTER, "6284", 1.27, 0.40, 8.47, 10.68, 8.47, 10.16, 2, 3),

	_6085(SheetSize.LETTER, "6085", 0, 0, 0, 0, 27.94, 21.59, 1, 1),
	_6185(SheetSize.LETTER, "6185", 0, 0, 0, 0, 27.94, 21.59, 1, 1),
	_6285(SheetSize.LETTER, "6285", 0, 0, 0, 0, 27.94, 21.59, 1, 1),

	_6086(SheetSize.LETTER, "6086", 0.16, 0.16, 13.81, 0, 13.81, 21.27, 1, 2),
	_6286(SheetSize.LETTER, "6286", 0.16, 0.16, 13.81, 0, 13.81, 21.27, 1, 2),

	_6087(SheetSize.LETTER, "6087", 1.27, 1.45, 1.27, 4.75, 1.27, 4.44, 4, 20 ),
	_6187(SheetSize.LETTER, "6187", 1.27, 1.45, 1.27, 4.75, 1.27, 4.44, 4, 20 ),
	_6287(SheetSize.LETTER, "6287", 1.27, 1.45, 1.27, 4.75, 1.27, 4.44, 4, 20 ),

	_6088(SheetSize.LETTER, "6088", 0.16, 0.16, 13.81, 10.64, 13.81, 10.64, 2, 2),
	_6288(SheetSize.LETTER, "6288", 0.16, 0.16, 13.81, 10.64, 13.81, 10.64, 2, 2),

	_6089(SheetSize.LETTER, "6089", 1.27, 1.45, 1.69, 4.75, 1.69, 4.44, 4, 15),

	_6092(SheetSize.LETTER, "6092", 1.69, 1.30, 2.89, 2.91, 1.70, 1.70, 7, 9),

	_6093(SheetSize.LETTER, "6093", 1.51, 1.45, 4.41, 5.20, 2.74, 3.10, 4, 6),
	_6293(SheetSize.LETTER, "6293", 1.51, 1.45, 4.41, 5.20, 2.74, 3.10, 4, 6),

	_6094(SheetSize.LETTER, "6094", 1.67, 1.90, 6.60, 6.75, 4.85, 4.35, 3, 4),

	_6095(SheetSize.LETTER, "6095", 2.12, 1.70, 5.93, 9.63, 5.93, 8.57, 2, 4),

	_7088(SheetSize.LETTER, "7088", 1.27, 1.90, 5.08, 8.89, 5.08, 8.89, 2, 5),
	_7188(SheetSize.LETTER, "7188", 1.27, 1.90, 5.08, 8.89, 5.08, 8.89, 2, 5),
	_7089(SheetSize.LETTER, "7089", 1.27, 1.90, 5.08, 8.89, 5.08, 8.89, 2, 5),

	_8096(SheetSize.LETTER, "8096", 1.27, 0.32, 7.62, 6.98, 6.98, 6.98, 3, 3),
	_8196(SheetSize.LETTER, "8196", 1.27, 0.32, 7.62, 6.98, 6.98, 6.98, 3, 3),
	_8296(SheetSize.LETTER, "8296", 1.27, 0.32, 7.62, 6.98, 6.98, 6.98, 3, 3),

	_8098(SheetSize.LETTER, "8098", 1.27, 1.27, 4.23, 10.16, 4.23, 8.89, 2, 6),

	_8099F(SheetSize.LETTER, "8099F", 2.33, 2.72, 4.66, 8.38, 4.66, 7.78, 2, 5),

	_8099L(SheetSize.LETTER, "8099L", 1.27, 3.41, 1.69, 0, 1.69, 14.76, 1, 15),

	A4048(SheetSize.A4, "A4048", 1.25, 0.7, 1.70, 3.30, 1.70, 3.10, 6, 16),
	A4248(SheetSize.A4, "A4248", 1.25, 0.7, 1.70, 3.30, 1.70, 3.10, 6, 16),
	A4348(SheetSize.A4, "A4348", 1.25, 0.7, 1.70, 3.30, 1.70, 3.10, 6, 16),

	A4049(SheetSize.A4, "A4049", 1.35, 0.8, 1.50, 2.80, 1.50, 2.60, 7, 18),
	A4249(SheetSize.A4, "A4249", 1.35, 0.8, 1.50, 2.80, 1.50, 2.60, 7, 18),
	A4349(SheetSize.A4, "A4349", 1.35, 0.8, 1.50, 2.80, 1.50, 2.60, 7, 18),

	A4050(SheetSize.A4, "A4050", 0.9, 0.47, 5.58, 10.16, 5.58, 9.90, 2, 5),
	A4250(SheetSize.A4, "A4250", 0.9, 0.47, 5.58, 10.16, 5.58, 9.90, 2, 5),
	A4350(SheetSize.A4, "A4350", 0.9, 0.47, 5.58, 10.16, 5.58, 9.90, 2, 5),

	A4051(SheetSize.A4, "A4051", 1.07, 0.45, 2.12, 4.07, 2.12, 3.82, 5, 13),
	A4251(SheetSize.A4, "A4251", 1.07, 0.45, 2.12, 4.07, 2.12, 3.82, 5, 13),
	A4351(SheetSize.A4, "A4351", 1.07, 0.45, 2.12, 4.07, 2.12, 3.82, 5, 13),

	A4054(SheetSize.A4, "A4054", 0.88, 0.47, 2.54, 10.16, 2.54, 9.90, 2, 11),
	A4254(SheetSize.A4, "A4254", 0.88, 0.47, 2.54, 10.16, 2.54, 9.90, 2, 11),
	A4354(SheetSize.A4, "A4354", 0.88, 0.47, 2.54, 10.16, 2.54, 9.90, 2, 11),
	A4054R(SheetSize.A4, "A4054R", 0.88, 0.47, 2.54, 10.16, 2.54, 9.90, 2, 11),

	A4055(SheetSize.A4, "A4055", 0.9, 0.72, 3.10, 6.61, 3.10, 6.35, 3, 9),
	A4255(SheetSize.A4, "A4255", 0.9, 0.72, 3.10, 6.61, 3.10, 6.35, 3, 9),
	A4355(SheetSize.A4, "A4355", 0.9, 0.72, 3.10, 6.61, 3.10, 6.35, 3, 9),

	A4056(SheetSize.A4, "A4056", 0.88, 0.72, 2.54, 6.61, 2.54, 6.35, 3, 11),
	A4256(SheetSize.A4, "A4256", 0.88, 0.72, 2.54, 6.61, 2.54, 6.35, 3, 11),
	A4356(SheetSize.A4, "A4356", 0.88, 0.72, 2.54, 6.61, 2.54, 6.35, 3, 11),
	A4056R(SheetSize.A4, "A4056R", 0.88, 0.72, 2.54, 6.61, 2.54, 6.35, 3, 11),

	A4060(SheetSize.A4, "A4060", 1.52, 0.72, 3.81, 6.61, 3.81, 6.35, 3, 7),
	A4260(SheetSize.A4, "A4260", 1.52, 0.72, 3.81, 6.61, 3.81, 6.35, 3, 7),
	A4360(SheetSize.A4, "A4360", 1.52, 0.72, 3.81, 6.61, 3.81, 6.35, 3, 7),

	A4261(SheetSize.A4, "A4261", 0.91, 0.72, 4.65, 6.61, 4.65, 6.35, 3, 6),
	A4361(SheetSize.A4, "A4361", 0.91, 0.72, 4.65, 6.61, 4.65, 6.35, 3, 6),

	A4062(SheetSize.A4, "A4062", 1.29, 0.47, 3.39, 10.16, 3.39, 9.90, 2, 8),
	A4262(SheetSize.A4, "A4262", 1.29, 0.47, 3.39, 10.16, 3.39, 9.90, 2, 8),
	A4362(SheetSize.A4, "A4362", 1.29, 0.47, 3.39, 10.16, 3.39, 9.90, 2, 8),

	A4063(SheetSize.A4, "A4063", 1.52, 0.47, 3.81, 10.16, 3.81, 9.90, 2, 7),
	A4263(SheetSize.A4, "A4263", 1.52, 0.47, 3.81, 10.16, 3.81, 9.90, 2, 7),
	A4363(SheetSize.A4, "A4363", 1.52, 0.47, 3.81, 10.16, 3.81, 9.90, 2, 7),
	A4063R(SheetSize.A4, "A4063R", 1.52, 0.47, 3.81, 10.16, 3.81, 9.90, 2, 7),

	A4264(SheetSize.A4, "A4264", 0.47, 0.72, 7.19, 6.61, 7.19, 6.35, 3, 4),
	A4364(SheetSize.A4, "A4364", 0.47, 0.72, 7.19, 6.61, 7.19, 6.35, 3, 4),

	A4265(SheetSize.A4, "A4265", 1.30, 0.47, 6.78, 10.16, 6.78, 9.90, 2, 4),
	A4365(SheetSize.A4, "A4365", 1.30, 0.47, 6.78, 10.16, 6.78, 9.90, 2, 4),

	A4067(SheetSize.A4, "A4067", 0.43, 0.50, 28.85, 20.00, 28.85, 20.00, 1, 1),
	A4267(SheetSize.A4, "A4267", 0.43, 0.50, 28.85, 20.00, 28.85, 20.00, 1, 1),
	A4367(SheetSize.A4, "A4367", 0.43, 0.50, 28.85, 20.00, 28.85, 20.00, 1, 1),

	A4268(SheetSize.A4, "A4268", 0.51, 0.51, 14.34, 19.99, 14.34, 19.99, 1, 2),
	A4368(SheetSize.A4, "A4368", 0.51, 0.51, 14.34, 19.99, 14.34, 19.99, 1, 2),

	;

	private final SheetSize sheetSize;

	private final String code;

	private final double horizontalDensity;

	private final double verticalDensity;

	private final double tagWidth;

	private final double tagHeight;

	private final double horizontalMargin;

	private final double verticalMargin;

	private final int rows;

	private final int columns;

	private static Map<String, PimacoLabelSheet> cache;

	/**
	 * <p>Looks for a sheet model by code.</p>
	 * 
	 * <p>This method differs from valueOf(String) in that valueOf(String) looks
	 * for the enum by its <em>value</em>, which in some cases is different from
	 * the model <em>code</em>, as the model code may start with a number.</p>
	 * 
	 * @param code the code of the model
	 * @return an Optional object with a PimacoLabelSheet with data
	 * corresponding to the model. If there's no such model, then an empty
	 * Optional is returned.
	 */
	public static Optional<PimacoLabelSheet> getByCode(String code) {
		if (cache == null) {
			initCache();
		}

		return Optional.ofNullable(cache.get(code));
	}

	private PimacoLabelSheet(SheetSize sheetSize, String code,
			double verticalMargin, double horizontalMargin,
			double verticalDensity, double horizontalDensity, double tagHeight,
			double tagWidth, int columns, int rows) {

		this.sheetSize = sheetSize;
		this.code = code;
		this.tagWidth = tagWidth;
		this.tagHeight = tagHeight;
		this.horizontalDensity = horizontalDensity;
		this.verticalDensity = verticalDensity;
		this.horizontalMargin = horizontalMargin;
		this.verticalMargin = verticalMargin;
		this.columns = columns;
		this.rows = rows;
	}

	/**
	 * Gets the number of columns in the sheet.
	 * @return the number of columns
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * Gets the horizontal spacing of the sheet. The horizontal spacing is the
	 * distance between the right edge of a label and the left edge of a
	 * neighbor label to the right.
	 * 
	 * @return the horizonal spacing (in centimeters)
	 */
	public double getHoriziontalSpacing() {
		return this.getHorizontalDensity() - this.getTagWidth(); 
	}

	/**
	 * Gets the horizontal density of the sheet. The horizontal density is the
	 * distance between the left edge of a label and the left edge of a
	 * neighbor label to the right.
	 * between two adjacent labels.
	 * @return the horizonal density (in centimeters)
	 */
	public double getHorizontalDensity() {
		return horizontalDensity;
	}

	/**
	 * Gets the horizional margin of the sheet. The horizional margin is the
	 * distance between the left edge of the sheet to the left edge of the first
	 * column of labels of the sheet.
	 * @return the horizontal margin (in centimeters)
	 */
	public double getHorizontalMargin() {
		return horizontalMargin;
	}

	/**
	 * Gets the sheet code.
	 * @return the sheet code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Gets the number of rows in the sheet.
	 * @return the number of rows
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * Gets the <a href="https://www.iso.org/standard/36631.html">ISO 216</a>
	 * sheet size as an SheetSize enum. It is either A4 or LETTER.
	 * @return the sheet size
	 */
	public SheetSize getSheetSize() {
		return sheetSize;
	}

	/**
	 * Gets the height of each label in the sheet.
	 * @return the height of labels (in centimeters)
	 */
	public double getTagHeight() {
		return tagHeight;
	}

	/**
	 * Gets the width of each label in the sheet.
	 * @return the width of labels (in centimeters)
	 */
	public double getTagWidth() {
		return tagWidth;
	}

	/**
	 * Gets the vertical density of the sheet. The vertical density is the
	 * distance between the top edge of a label and top and the top edge of a
	 * neighbor label below.
	 * between two adjacent labels.
	 * @return the vertical density (in centimeters)
	 */
	public double getVerticalDensity() {
		return verticalDensity;
	}

	/**
	 * Gets the vertical margin of the sheet. The vertical margin is the
	 * distance between the top edge of the sheet to the top edge of the first
	 * row of labels of the sheet.
	 * @return the vertical margin (in centimeters)
	 */
	public double getVerticalMargin() {
		return verticalMargin;
	}

	/**
	 * Gets the vertical spacing of the sheet. The vertical spacing is the
	 * distance between the bottom edge of a label and the top edge of a
	 * neighbor label below.
	 * @return the vertical spacing (in centimeters)
	 */
	public double getVerticalSpacing() {
		return this.getVerticalDensity()  - this.getTagHeight();
	}

	protected static void initCache() {
		PimacoLabelSheet[] allLabels = PimacoLabelSheet.values();

		cache = Stream.of(allLabels)
			.collect(Collectors.toMap(PimacoLabelSheet::getCode,
				Function.identity()));
	}
}
