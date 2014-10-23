package gbt.dept;

import java.io.Serializable;

import com.chinacreator.c2.annotation.Column;
import com.chinacreator.c2.annotation.ColumnType;
import com.chinacreator.c2.annotation.Entity;

/**
 * 单位备忘信息
 * @author 
 * @generated
 */
@Entity(id = "entity:gbt.dept.DepartmentNote", table = "note_dpt_info", autoIndex = false)
public class DepartmentNote implements Serializable {
	private static final long serialVersionUID = 851129673596928L;
	/**
	 *备忘id
	 */
	@Column(id = "note_id", type = ColumnType.uuid, datatype = "int")
	private java.lang.Integer noteId;

	/**
	 *单位id
	 */
	@Column(id = "dpt_id", datatype = "int")
	private java.lang.Integer dptId;

	/**
	 *登记日期
	 */
	@Column(id = "note_reco_time", datatype = "date")
	private java.sql.Date noteRecoTime;

	/**
	 *备忘提示事项
	 */
	@Column(id = "note_item", datatype = "clob")
	private java.lang.String noteItem;

	/**
	 *备忘材料
	 */
	@Column(id = "note_mat", datatype = "clob")
	private java.lang.String noteMat;

	/**
	 *登记人
	 */
	@Column(id = "note_reg", datatype = "string256")
	private java.lang.String noteReg;

	/**
	 *提示日期
	 */
	@Column(id = "note_alar_time", datatype = "date")
	private java.sql.Date noteAlarTime;

	/**
	 *提醒对象
	 */
	@Column(id = "note_who", datatype = "int")
	private java.lang.Integer noteWho;

	/**
	 *是否处理
	 */
	@Column(id = "note_end", datatype = "boolean")
	private java.lang.Boolean noteEnd;

	/**
	 *处理情况
	 */
	@Column(id = "deal_cond", datatype = "clob")
	private java.lang.String dealCond;

	/**
	 *创建时间
	 */
	@Column(id = "created_at", datatype = "timestamp")
	private java.sql.Timestamp createdAt;

	/**
	 *更新时间
	 */
	@Column(id = "updated_at", datatype = "timestamp")
	private java.sql.Timestamp updatedAt;

	/**
	 *创建者
	 */
	@Column(id = "created_by", datatype = "int")
	private java.lang.Integer createdBy;

	/**
	 *更新者
	 */
	@Column(id = "updated_by", datatype = "int")
	private java.lang.Integer updatedBy;

	/**
	 * 设置备忘id
	 */
	public void setNoteId(java.lang.Integer noteId) {
		this.noteId = noteId;
	}

	/**
	 * 获取备忘id
	 */
	public java.lang.Integer getNoteId() {
		return noteId;
	}

	/**
	 * 设置单位id
	 */
	public void setDptId(java.lang.Integer dptId) {
		this.dptId = dptId;
	}

	/**
	 * 获取单位id
	 */
	public java.lang.Integer getDptId() {
		return dptId;
	}

	/**
	 * 设置登记日期
	 */
	public void setNoteRecoTime(java.sql.Date noteRecoTime) {
		this.noteRecoTime = noteRecoTime;
	}

	/**
	 * 获取登记日期
	 */
	public java.sql.Date getNoteRecoTime() {
		return noteRecoTime;
	}

	/**
	 * 设置备忘提示事项
	 */
	public void setNoteItem(java.lang.String noteItem) {
		this.noteItem = noteItem;
	}

	/**
	 * 获取备忘提示事项
	 */
	public java.lang.String getNoteItem() {
		return noteItem;
	}

	/**
	 * 设置备忘材料
	 */
	public void setNoteMat(java.lang.String noteMat) {
		this.noteMat = noteMat;
	}

	/**
	 * 获取备忘材料
	 */
	public java.lang.String getNoteMat() {
		return noteMat;
	}

	/**
	 * 设置登记人
	 */
	public void setNoteReg(java.lang.String noteReg) {
		this.noteReg = noteReg;
	}

	/**
	 * 获取登记人
	 */
	public java.lang.String getNoteReg() {
		return noteReg;
	}

	/**
	 * 设置提示日期
	 */
	public void setNoteAlarTime(java.sql.Date noteAlarTime) {
		this.noteAlarTime = noteAlarTime;
	}

	/**
	 * 获取提示日期
	 */
	public java.sql.Date getNoteAlarTime() {
		return noteAlarTime;
	}

	/**
	 * 设置提醒对象
	 */
	public void setNoteWho(java.lang.Integer noteWho) {
		this.noteWho = noteWho;
	}

	/**
	 * 获取提醒对象
	 */
	public java.lang.Integer getNoteWho() {
		return noteWho;
	}

	/**
	 * 设置是否处理
	 */
	public void setNoteEnd(java.lang.Boolean noteEnd) {
		this.noteEnd = noteEnd;
	}

	/**
	 * 获取是否处理
	 */
	public java.lang.Boolean isNoteEnd() {
		return noteEnd;
	}

	/**
	 * 设置处理情况
	 */
	public void setDealCond(java.lang.String dealCond) {
		this.dealCond = dealCond;
	}

	/**
	 * 获取处理情况
	 */
	public java.lang.String getDealCond() {
		return dealCond;
	}

	/**
	 * 设置创建时间
	 */
	public void setCreatedAt(java.sql.Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * 获取创建时间
	 */
	public java.sql.Timestamp getCreatedAt() {
		return createdAt;
	}

	/**
	 * 设置更新时间
	 */
	public void setUpdatedAt(java.sql.Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * 获取更新时间
	 */
	public java.sql.Timestamp getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * 设置创建者
	 */
	public void setCreatedBy(java.lang.Integer createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * 获取创建者
	 */
	public java.lang.Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * 设置更新者
	 */
	public void setUpdatedBy(java.lang.Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	/**
	 * 获取更新者
	 */
	public java.lang.Integer getUpdatedBy() {
		return updatedBy;
	}
}
