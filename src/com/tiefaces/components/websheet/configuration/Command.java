package com.tiefaces.components.websheet.configuration;

import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;

import com.tiefaces.components.websheet.service.CellHelper;

public interface Command {

	public abstract String getCommandTypeName();

	public abstract void setCommandTypeName(String pCommandTypeName);

	/**
	 * Constructor configRange if it's null. Always return an object for
	 * configRange.
	 * 
	 * @return ConfigRange object.
	 */
	public abstract ConfigRange getConfigRange();

	public abstract void setConfigRange(ConfigRange pConfigRange);

	public abstract Command getParentCommand();

	public abstract void setParentCommand(Command pParentCommand);

	public abstract String getLength();

	public abstract void setLength(String pLength);

	/**
	 * Get top row of command range.
	 * @return int top row index.
	 */
	public abstract int getTopRow();

	/**
	 * Get last row of command range.
	 * @return int last row index.
	 */

	public abstract int getLastRow();

	/**
	 * get left column index of the command range.
	 * @return int left column index.
	 */
	public abstract int getLeftCol();

	/**
	 * get right column index of the command range.
	 * @return int right column index.
	 */
	public abstract int getRightCol();

	public abstract int getFinalLength();

	public abstract void setFinalLength(int populatedLength);
	
	public abstract int buildAt(final Sheet sheet,final int startRow,
			final Map<String, Object> context, final ExpressionEngine engine, final CellHelper cellHelper);

}