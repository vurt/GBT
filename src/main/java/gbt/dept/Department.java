package gbt.dept;

import java.io.Serializable;
import java.util.Collection;

import com.chinacreator.c2.annotation.Children;
import com.chinacreator.c2.annotation.Column;
import com.chinacreator.c2.annotation.ColumnType;
import com.chinacreator.c2.annotation.Entity;
import com.chinacreator.c2.annotation.SortType;

/**
 * 单位
 * @author 
 * @generated
 */
@Entity(id = "entity:gbt.dept.Department", table = "dpt_base_info", autoIndex = false, logicDelete = true)
public class Department implements Serializable {
	private static final long serialVersionUID = 849426460327936L;
	/**
	 *单位id
	 */
	@Column(id = "dpt_id", type = ColumnType.uuid, datatype = "int")
	private java.lang.Integer dptId;

	/**
	 *单位全称
	 */
	@Column(id = "name_all", datatype = "string256")
	private java.lang.String nameAll;

	/**
	 *单位简称
	 */
	@Column(id = "name_simp", datatype = "string256")
	private java.lang.String nameSimp;

	/**
	 *单位拼音
	 */
	@Column(id = "name_pin", datatype = "string256")
	private java.lang.String namePin;

	/**
	 *单位拼音首字母
	 */
	@Column(id = "name_init", datatype = "string256")
	private java.lang.String nameInit;

	/**
	 *干部联系处室
	 */
	@Column(id = "dpt_belo", datatype = "int")
	private java.lang.Integer dptBelo;

	/**
	 *上级单位id
	 */
	@Column(id = "up_dpt_id", datatype = "int")
	private java.lang.Integer upDptId;

	/**
	 *单位排序
	 */
	@Column(id = "dpt_prio", datatype = "int")
	private java.lang.Integer dptPrio;

	/**
	 *单位层次1
	 */
	@Column(id = "hier1", datatype = "int")
	private java.lang.Integer hier1;

	/**
	 *单位层次2
	 */
	@Column(id = "hier2", datatype = "int")
	private java.lang.Integer hier2;

	/**
	 *单位层次3
	 */
	@Column(id = "hier3", datatype = "int")
	private java.lang.Integer hier3;

	/**
	 *单位级别1
	 */
	@Column(id = "lvl1", datatype = "int")
	private java.lang.Integer lvl1;

	/**
	 *单位级别2
	 */
	@Column(id = "lvl2", datatype = "int")
	private java.lang.Integer lvl2;

	/**
	 *单位性质1
	 */
	@Column(id = "prop1", datatype = "int")
	private java.lang.Integer prop1;

	/**
	 *单位性质2
	 */
	@Column(id = "prop2", datatype = "int")
	private java.lang.Integer prop2;

	/**
	 *单位性质3
	 */
	@Column(id = "prop3", datatype = "int")
	private java.lang.Integer prop3;

	/**
	 *园区
	 */
	@Column(id = "park", datatype = "int")
	private java.lang.Integer park;

	/**
	 *三定核定领导职数文字表述
	 */
	@Column(id = "san_ding", datatype = "clob")
	private java.lang.String sanDing;

	/**
	 *领导班子成员核定职数
	 */
	@Column(id = "lead_theo_num", datatype = "int")
	private java.lang.Integer leadTheoNum;

	/**
	 *领导班子成员实配职数
	 */
	@Column(id = "lead_real_num", datatype = "int")
	private java.lang.Integer leadRealNum;

	/**
	 *领导班子成员军转干部数
	 */
	@Column(id = "lead_sold_num", datatype = "int")
	private java.lang.Integer leadSoldNum;

	/**
	 *领导班子成员援藏、援疆干部数
	 */
	@Column(id = "lead_zang_num", datatype = "int")
	private java.lang.Integer leadZangNum;

	/**
	 *领导班子成员空缺（超配）数
	 */
	@Column(id = "lead_vaca_num", datatype = "int")
	private java.lang.Integer leadVacaNum;

	/**
	 *剔除政策性安置领导班子成员空缺（超配）数
	 */
	@Column(id = "lead_vaca_excl", datatype = "int")
	private java.lang.Integer leadVacaExcl;

	/**
	 *领导班子成员职数备注
	 */
	@Column(id = "lead_remark", datatype = "clob")
	private java.lang.String leadRemark;

	/**
	 *其他领导核定职数
	 */
	@Column(id = "oth_theo_num", datatype = "int")
	private java.lang.Integer othTheoNum;

	/**
	 *其他领导实配职数
	 */
	@Column(id = "oth_real_num", datatype = "int")
	private java.lang.Integer othRealNum;

	/**
	 *其他领导军转干部数
	 */
	@Column(id = "oth_sold_num", datatype = "int")
	private java.lang.Integer othSoldNum;

	/**
	 *其他领导援藏、援疆干部数
	 */
	@Column(id = "oth_zang_num", datatype = "int")
	private java.lang.Integer othZangNum;

	/**
	 *其他领导空缺（超配）数
	 */
	@Column(id = "oth_vaca_num", datatype = "int")
	private java.lang.Integer othVacaNum;

	/**
	 *剔除政策性安置其他领导空缺（超配）数
	 */
	@Column(id = "oth_vaca_excl", datatype = "int")
	private java.lang.Integer othVacaExcl;

	/**
	 *其他领导成员职数备注
	 */
	@Column(id = "oth_remk", datatype = "clob")
	private java.lang.String othRemk;

	/**
	 *非领导核定职数
	 */
	@Column(id = "no_theo_num", datatype = "int")
	private java.lang.Integer noTheoNum;

	/**
	 *非领导实配职数
	 */
	@Column(id = "no_real_num", datatype = "int")
	private java.lang.Integer noRealNum;

	/**
	 *非领导军转干部数
	 */
	@Column(id = "no_sold_num", datatype = "int")
	private java.lang.Integer noSoldNum;

	/**
	 *非领导援藏、援疆干部数
	 */
	@Column(id = "no_zang_num", datatype = "int")
	private java.lang.Integer noZangNum;

	/**
	 *非领导空缺（超配）数
	 */
	@Column(id = "no_vaca_num", datatype = "int")
	private java.lang.Integer noVacaNum;

	/**
	 *剔除政策性安置非领导空缺（超配）数
	 */
	@Column(id = "no_vaca_excl", datatype = "int")
	private java.lang.Integer noVacaExcl;

	/**
	 *非领导成员职数备注
	 */
	@Column(id = "no_remk", datatype = "clob")
	private java.lang.String noRemk;

	/**
	 *在树中是否可选
	 */
	@Column(id = "selectable", datatype = "boolean")
	private java.lang.Boolean selectable;

	/**
	 *是否撤销
	 */
	@Column(id = "canceled", datatype = "boolean")
	private java.lang.Boolean canceled;

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
	 *创建时间
	 */
	@Column(id = "created_at", datatype = "timestamp", sort = SortType.desc)
	private java.sql.Timestamp createdAt;

	/**
	 *更新时间
	 */
	@Column(id = "updated_at", datatype = "timestamp")
	private java.sql.Timestamp updatedAt;

	/**
	 *单位年度考核信息
	 */
	@Children(id = "annus", fk = "dpt_id:dpt_id")
	private Collection<AnnuDeptInfo> annus;

	/**
	 *单位备忘信息
	 */
	@Children(id = "notes", fk = "dpt_id:dpt_id")
	private Collection<DepartmentNote> notes;

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
	 * 设置单位全称
	 */
	public void setNameAll(java.lang.String nameAll) {
		this.nameAll = nameAll;
	}

	/**
	 * 获取单位全称
	 */
	public java.lang.String getNameAll() {
		return nameAll;
	}

	/**
	 * 设置单位简称
	 */
	public void setNameSimp(java.lang.String nameSimp) {
		this.nameSimp = nameSimp;
	}

	/**
	 * 获取单位简称
	 */
	public java.lang.String getNameSimp() {
		return nameSimp;
	}

	/**
	 * 设置单位拼音
	 */
	public void setNamePin(java.lang.String namePin) {
		this.namePin = namePin;
	}

	/**
	 * 获取单位拼音
	 */
	public java.lang.String getNamePin() {
		return namePin;
	}

	/**
	 * 设置单位拼音首字母
	 */
	public void setNameInit(java.lang.String nameInit) {
		this.nameInit = nameInit;
	}

	/**
	 * 获取单位拼音首字母
	 */
	public java.lang.String getNameInit() {
		return nameInit;
	}

	/**
	 * 设置干部联系处室
	 */
	public void setDptBelo(java.lang.Integer dptBelo) {
		this.dptBelo = dptBelo;
	}

	/**
	 * 获取干部联系处室
	 */
	public java.lang.Integer getDptBelo() {
		return dptBelo;
	}

	/**
	 * 设置上级单位id
	 */
	public void setUpDptId(java.lang.Integer upDptId) {
		this.upDptId = upDptId;
	}

	/**
	 * 获取上级单位id
	 */
	public java.lang.Integer getUpDptId() {
		return upDptId;
	}

	/**
	 * 设置单位排序
	 */
	public void setDptPrio(java.lang.Integer dptPrio) {
		this.dptPrio = dptPrio;
	}

	/**
	 * 获取单位排序
	 */
	public java.lang.Integer getDptPrio() {
		return dptPrio;
	}

	/**
	 * 设置单位层次1
	 */
	public void setHier1(java.lang.Integer hier1) {
		this.hier1 = hier1;
	}

	/**
	 * 获取单位层次1
	 */
	public java.lang.Integer getHier1() {
		return hier1;
	}

	/**
	 * 设置单位层次2
	 */
	public void setHier2(java.lang.Integer hier2) {
		this.hier2 = hier2;
	}

	/**
	 * 获取单位层次2
	 */
	public java.lang.Integer getHier2() {
		return hier2;
	}

	/**
	 * 设置单位层次3
	 */
	public void setHier3(java.lang.Integer hier3) {
		this.hier3 = hier3;
	}

	/**
	 * 获取单位层次3
	 */
	public java.lang.Integer getHier3() {
		return hier3;
	}

	/**
	 * 设置单位级别1
	 */
	public void setLvl1(java.lang.Integer lvl1) {
		this.lvl1 = lvl1;
	}

	/**
	 * 获取单位级别1
	 */
	public java.lang.Integer getLvl1() {
		return lvl1;
	}

	/**
	 * 设置单位级别2
	 */
	public void setLvl2(java.lang.Integer lvl2) {
		this.lvl2 = lvl2;
	}

	/**
	 * 获取单位级别2
	 */
	public java.lang.Integer getLvl2() {
		return lvl2;
	}

	/**
	 * 设置单位性质1
	 */
	public void setProp1(java.lang.Integer prop1) {
		this.prop1 = prop1;
	}

	/**
	 * 获取单位性质1
	 */
	public java.lang.Integer getProp1() {
		return prop1;
	}

	/**
	 * 设置单位性质2
	 */
	public void setProp2(java.lang.Integer prop2) {
		this.prop2 = prop2;
	}

	/**
	 * 获取单位性质2
	 */
	public java.lang.Integer getProp2() {
		return prop2;
	}

	/**
	 * 设置单位性质3
	 */
	public void setProp3(java.lang.Integer prop3) {
		this.prop3 = prop3;
	}

	/**
	 * 获取单位性质3
	 */
	public java.lang.Integer getProp3() {
		return prop3;
	}

	/**
	 * 设置园区
	 */
	public void setPark(java.lang.Integer park) {
		this.park = park;
	}

	/**
	 * 获取园区
	 */
	public java.lang.Integer getPark() {
		return park;
	}

	/**
	 * 设置三定核定领导职数文字表述
	 */
	public void setSanDing(java.lang.String sanDing) {
		this.sanDing = sanDing;
	}

	/**
	 * 获取三定核定领导职数文字表述
	 */
	public java.lang.String getSanDing() {
		return sanDing;
	}

	/**
	 * 设置领导班子成员核定职数
	 */
	public void setLeadTheoNum(java.lang.Integer leadTheoNum) {
		this.leadTheoNum = leadTheoNum;
	}

	/**
	 * 获取领导班子成员核定职数
	 */
	public java.lang.Integer getLeadTheoNum() {
		return leadTheoNum;
	}

	/**
	 * 设置领导班子成员实配职数
	 */
	public void setLeadRealNum(java.lang.Integer leadRealNum) {
		this.leadRealNum = leadRealNum;
	}

	/**
	 * 获取领导班子成员实配职数
	 */
	public java.lang.Integer getLeadRealNum() {
		return leadRealNum;
	}

	/**
	 * 设置领导班子成员军转干部数
	 */
	public void setLeadSoldNum(java.lang.Integer leadSoldNum) {
		this.leadSoldNum = leadSoldNum;
	}

	/**
	 * 获取领导班子成员军转干部数
	 */
	public java.lang.Integer getLeadSoldNum() {
		return leadSoldNum;
	}

	/**
	 * 设置领导班子成员援藏、援疆干部数
	 */
	public void setLeadZangNum(java.lang.Integer leadZangNum) {
		this.leadZangNum = leadZangNum;
	}

	/**
	 * 获取领导班子成员援藏、援疆干部数
	 */
	public java.lang.Integer getLeadZangNum() {
		return leadZangNum;
	}

	/**
	 * 设置领导班子成员空缺（超配）数
	 */
	public void setLeadVacaNum(java.lang.Integer leadVacaNum) {
		this.leadVacaNum = leadVacaNum;
	}

	/**
	 * 获取领导班子成员空缺（超配）数
	 */
	public java.lang.Integer getLeadVacaNum() {
		return leadVacaNum;
	}

	/**
	 * 设置剔除政策性安置领导班子成员空缺（超配）数
	 */
	public void setLeadVacaExcl(java.lang.Integer leadVacaExcl) {
		this.leadVacaExcl = leadVacaExcl;
	}

	/**
	 * 获取剔除政策性安置领导班子成员空缺（超配）数
	 */
	public java.lang.Integer getLeadVacaExcl() {
		return leadVacaExcl;
	}

	/**
	 * 设置领导班子成员职数备注
	 */
	public void setLeadRemark(java.lang.String leadRemark) {
		this.leadRemark = leadRemark;
	}

	/**
	 * 获取领导班子成员职数备注
	 */
	public java.lang.String getLeadRemark() {
		return leadRemark;
	}

	/**
	 * 设置其他领导核定职数
	 */
	public void setOthTheoNum(java.lang.Integer othTheoNum) {
		this.othTheoNum = othTheoNum;
	}

	/**
	 * 获取其他领导核定职数
	 */
	public java.lang.Integer getOthTheoNum() {
		return othTheoNum;
	}

	/**
	 * 设置其他领导实配职数
	 */
	public void setOthRealNum(java.lang.Integer othRealNum) {
		this.othRealNum = othRealNum;
	}

	/**
	 * 获取其他领导实配职数
	 */
	public java.lang.Integer getOthRealNum() {
		return othRealNum;
	}

	/**
	 * 设置其他领导军转干部数
	 */
	public void setOthSoldNum(java.lang.Integer othSoldNum) {
		this.othSoldNum = othSoldNum;
	}

	/**
	 * 获取其他领导军转干部数
	 */
	public java.lang.Integer getOthSoldNum() {
		return othSoldNum;
	}

	/**
	 * 设置其他领导援藏、援疆干部数
	 */
	public void setOthZangNum(java.lang.Integer othZangNum) {
		this.othZangNum = othZangNum;
	}

	/**
	 * 获取其他领导援藏、援疆干部数
	 */
	public java.lang.Integer getOthZangNum() {
		return othZangNum;
	}

	/**
	 * 设置其他领导空缺（超配）数
	 */
	public void setOthVacaNum(java.lang.Integer othVacaNum) {
		this.othVacaNum = othVacaNum;
	}

	/**
	 * 获取其他领导空缺（超配）数
	 */
	public java.lang.Integer getOthVacaNum() {
		return othVacaNum;
	}

	/**
	 * 设置剔除政策性安置其他领导空缺（超配）数
	 */
	public void setOthVacaExcl(java.lang.Integer othVacaExcl) {
		this.othVacaExcl = othVacaExcl;
	}

	/**
	 * 获取剔除政策性安置其他领导空缺（超配）数
	 */
	public java.lang.Integer getOthVacaExcl() {
		return othVacaExcl;
	}

	/**
	 * 设置其他领导成员职数备注
	 */
	public void setOthRemk(java.lang.String othRemk) {
		this.othRemk = othRemk;
	}

	/**
	 * 获取其他领导成员职数备注
	 */
	public java.lang.String getOthRemk() {
		return othRemk;
	}

	/**
	 * 设置非领导核定职数
	 */
	public void setNoTheoNum(java.lang.Integer noTheoNum) {
		this.noTheoNum = noTheoNum;
	}

	/**
	 * 获取非领导核定职数
	 */
	public java.lang.Integer getNoTheoNum() {
		return noTheoNum;
	}

	/**
	 * 设置非领导实配职数
	 */
	public void setNoRealNum(java.lang.Integer noRealNum) {
		this.noRealNum = noRealNum;
	}

	/**
	 * 获取非领导实配职数
	 */
	public java.lang.Integer getNoRealNum() {
		return noRealNum;
	}

	/**
	 * 设置非领导军转干部数
	 */
	public void setNoSoldNum(java.lang.Integer noSoldNum) {
		this.noSoldNum = noSoldNum;
	}

	/**
	 * 获取非领导军转干部数
	 */
	public java.lang.Integer getNoSoldNum() {
		return noSoldNum;
	}

	/**
	 * 设置非领导援藏、援疆干部数
	 */
	public void setNoZangNum(java.lang.Integer noZangNum) {
		this.noZangNum = noZangNum;
	}

	/**
	 * 获取非领导援藏、援疆干部数
	 */
	public java.lang.Integer getNoZangNum() {
		return noZangNum;
	}

	/**
	 * 设置非领导空缺（超配）数
	 */
	public void setNoVacaNum(java.lang.Integer noVacaNum) {
		this.noVacaNum = noVacaNum;
	}

	/**
	 * 获取非领导空缺（超配）数
	 */
	public java.lang.Integer getNoVacaNum() {
		return noVacaNum;
	}

	/**
	 * 设置剔除政策性安置非领导空缺（超配）数
	 */
	public void setNoVacaExcl(java.lang.Integer noVacaExcl) {
		this.noVacaExcl = noVacaExcl;
	}

	/**
	 * 获取剔除政策性安置非领导空缺（超配）数
	 */
	public java.lang.Integer getNoVacaExcl() {
		return noVacaExcl;
	}

	/**
	 * 设置非领导成员职数备注
	 */
	public void setNoRemk(java.lang.String noRemk) {
		this.noRemk = noRemk;
	}

	/**
	 * 获取非领导成员职数备注
	 */
	public java.lang.String getNoRemk() {
		return noRemk;
	}

	/**
	 * 设置在树中是否可选
	 */
	public void setSelectable(java.lang.Boolean selectable) {
		this.selectable = selectable;
	}

	/**
	 * 获取在树中是否可选
	 */
	public java.lang.Boolean isSelectable() {
		return selectable;
	}

	/**
	 * 设置是否撤销
	 */
	public void setCanceled(java.lang.Boolean canceled) {
		this.canceled = canceled;
	}

	/**
	 * 获取是否撤销
	 */
	public java.lang.Boolean isCanceled() {
		return canceled;
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
	 * 设置单位年度考核信息
	 */
	public void setAnnus(Collection<AnnuDeptInfo> annus) {
		this.annus = annus;
	}

	/**
	 * 获取单位年度考核信息
	 */
	public Collection<AnnuDeptInfo> getAnnus() {
		return annus;
	}

	/**
	 * 设置单位备忘信息
	 */
	public void setNotes(Collection<DepartmentNote> notes) {
		this.notes = notes;
	}

	/**
	 * 获取单位备忘信息
	 */
	public Collection<DepartmentNote> getNotes() {
		return notes;
	}
}
