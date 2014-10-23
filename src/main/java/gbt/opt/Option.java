package gbt.opt;

import java.io.Serializable;

import com.chinacreator.c2.annotation.Column;
import com.chinacreator.c2.annotation.ColumnType;
import com.chinacreator.c2.annotation.Entity;

/**
 * 数据字典
 * @author 
 * @generated
 */
@Entity(id = "entity:gbt.opt.Option", table = "options")
public class Option implements Serializable {
	private static final long serialVersionUID = 857085585899520L;
	/**
	 *数据字典id
	 */
	@Column(id = "option_id", type = ColumnType.uuid, datatype = "int")
	private java.lang.Integer optionId;

	/**
	 *数据字典内容
	 */
	@Column(id = "option_name", datatype = "string256")
	private java.lang.String optionName;

	/**
	 *数据字典类型
	 */
	@Column(id = "option_type", datatype = "string256")
	private java.lang.String optionType;

	/**
	 *父节点id
	 */
	@Column(id = "parent_id", datatype = "int")
	private java.lang.Integer parentId;

	/**
	 *数据字典备注
	 */
	@Column(id = "option_note", datatype = "string256")
	private java.lang.String optionNote;

	/**
	 *叶子节点排序
	 */
	@Column(id = "orderby", datatype = "int")
	private java.lang.Integer orderby;

	/**
	 *是否可选
	 */
	@Column(id = "selectable", datatype = "boolean")
	private java.lang.Boolean selectable;

	/**
	 * 设置数据字典id
	 */
	public void setOptionId(java.lang.Integer optionId) {
		this.optionId = optionId;
	}

	/**
	 * 获取数据字典id
	 */
	public java.lang.Integer getOptionId() {
		return optionId;
	}

	/**
	 * 设置数据字典内容
	 */
	public void setOptionName(java.lang.String optionName) {
		this.optionName = optionName;
	}

	/**
	 * 获取数据字典内容
	 */
	public java.lang.String getOptionName() {
		return optionName;
	}

	/**
	 * 设置数据字典类型
	 */
	public void setOptionType(java.lang.String optionType) {
		this.optionType = optionType;
	}

	/**
	 * 获取数据字典类型
	 */
	public java.lang.String getOptionType() {
		return optionType;
	}

	/**
	 * 设置父节点id
	 */
	public void setParentId(java.lang.Integer parentId) {
		this.parentId = parentId;
	}

	/**
	 * 获取父节点id
	 */
	public java.lang.Integer getParentId() {
		return parentId;
	}

	/**
	 * 设置数据字典备注
	 */
	public void setOptionNote(java.lang.String optionNote) {
		this.optionNote = optionNote;
	}

	/**
	 * 获取数据字典备注
	 */
	public java.lang.String getOptionNote() {
		return optionNote;
	}

	/**
	 * 设置叶子节点排序
	 */
	public void setOrderby(java.lang.Integer orderby) {
		this.orderby = orderby;
	}

	/**
	 * 获取叶子节点排序
	 */
	public java.lang.Integer getOrderby() {
		return orderby;
	}

	/**
	 * 设置是否可选
	 */
	public void setSelectable(java.lang.Boolean selectable) {
		this.selectable = selectable;
	}

	/**
	 * 获取是否可选
	 */
	public java.lang.Boolean isSelectable() {
		return selectable;
	}
}
