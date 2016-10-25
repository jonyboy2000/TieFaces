package com.tiefaces.components.websheet;

import java.util.List;
import java.util.Map;

import com.tiefaces.components.websheet.dataobjects.CellFormAttributes;

public class CellAttributesMap {
	/** hold comments for the current sheet config form.
	 *  key is 
	 *  $$ - for normal comment
	 *  $ - empty method comment
	 *  $xxx -- method comment while xxx is method name. (now only one method exist: init).
	 *          i.e. comment could be $init{department.name} , so here init is the method name.
	 *  value is the comments without tie commands.
	 */
	public Map<String, Map<String, String>> templateCommentMap;

	/** hold input type for input control widget.
	 *  key is sheetName!$rowindex$columnindex
	 *  value is the control type.
	 *  e.g. dropdown radiobox calendar
	 */
	public Map<String, String> cellInputType;

	/** hold attributes for input control widget.
	 *  key is sheetName!$rowindex$columnindex
	 *  value is the list of attributes.
	 */
	public Map<String, List<CellFormAttributes>> cellInputAttributes;

	/** hold attributes for selectItems of dropdown list or radio box.
	 *  key is sheetName!$rowindex$columnindex
	 *  value is the map of attributes.
	 */
	public Map<String, Map<String, String>> cellSelectItemsAttributes;
	
	
	/** hold date pattern  for calendar control widget.
	 *  key is sheetName!$rowindex$columnindex
	 *  value is the date pattern.
	 *  date pattern is necessary for covert date to string
	 */
	public Map<String, String> cellDatePattern;
	

	public CellAttributesMap(
			Map<String, Map<String, String>> pTemplateCommentMap,
			Map<String, String> pCellInputType,
			Map<String, List<CellFormAttributes>> pCellInputAttributes,
			Map<String, Map<String, String>> pCellSelectItemsAttributes,
			Map<String, String> pCellDatePattern) {
		this.templateCommentMap = pTemplateCommentMap;
		this.cellInputType = pCellInputType;
		this.cellInputAttributes = pCellInputAttributes;
		this.cellSelectItemsAttributes = pCellSelectItemsAttributes;
		this.cellDatePattern = pCellDatePattern;
	}
	
	public void clear() {
		if (this.templateCommentMap != null) {
			this.templateCommentMap.clear();
		}
		if (this.cellDatePattern != null ) {
			this.cellDatePattern.clear();
		}
		if (this.cellInputAttributes != null) {
			this.cellInputAttributes.clear();
		}
		if (this.cellInputType != null) {
			this.cellInputType.clear();
		}
		if ( this.cellSelectItemsAttributes != null) {
			this.cellSelectItemsAttributes.clear();
		}
		
	}
}