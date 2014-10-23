package gbt.dept;

import java.io.Serializable;

import com.chinacreator.c2.annotation.Column;
import com.chinacreator.c2.annotation.ColumnType;
import com.chinacreator.c2.annotation.Entity;
import com.chinacreator.c2.annotation.SortType;

/**
 * 单位年度考核信息
 * @author 
 * @generated
 */
@Entity(id = "entity:gbt.dept.AnnuDeptInfo", table = "annu_dpt_info", autoIndex = false)
public class AnnuDeptInfo implements Serializable {
	private static final long serialVersionUID = 851125974384640L;
	/**
	 *年度考核id
	 */
	@Column(id = "exam_id", type = ColumnType.uuid, datatype = "int")
	private java.lang.Integer examId;

	/**
	 *单位id
	 */
	@Column(id = "dpt_id", datatype = "int")
	private java.lang.Integer dptId;

	/**
	 *考核年度
	 */
	@Column(id = "annu", datatype = "int", sort = SortType.asc)
	private java.lang.Integer annu;

	/**
	 *考核等次
	 */
	@Column(id = "lvl", datatype = "int")
	private java.lang.Integer lvl;

	/**
	 *考核材料
	 */
	@Column(id = "mat_add", datatype = "clob")
	private java.lang.String matAdd;

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
	 * 设置年度考核id
	 */
	public void setExamId(java.lang.Integer examId) {
		this.examId = examId;
	}

	/**
	 * 获取年度考核id
	 */
	public java.lang.Integer getExamId() {
		return examId;
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
	 * 设置考核年度
	 */
	public void setAnnu(java.lang.Integer annu) {
		this.annu = annu;
	}

	/**
	 * 获取考核年度
	 */
	public java.lang.Integer getAnnu() {
		return annu;
	}

	/**
	 * 设置考核等次
	 */
	public void setLvl(java.lang.Integer lvl) {
		this.lvl = lvl;
	}

	/**
	 * 获取考核等次
	 */
	public java.lang.Integer getLvl() {
		return lvl;
	}

	/**
	 * 设置考核材料
	 */
	public void setMatAdd(java.lang.String matAdd) {
		this.matAdd = matAdd;
	}

	/**
	 * 获取考核材料
	 */
	public java.lang.String getMatAdd() {
		return matAdd;
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
