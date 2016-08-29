/**
 * 
 */
package com.quoioln.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vpquoi
 *
 */
@Entity
@Table(name = "role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private String roleId;
	@Column(name = "name")
	private String name;
	@Column(name = "delete_flag")
	private Boolean deleteFlag;
	/**
	 * 
	 */
	public Role() {
	}
	
	/**
	 * @param roleId
	 * @param name
	 * @param deleteFlag
	 */
	public Role(String roleId, String name, Boolean deleteFlag) {
		super();
		this.roleId = roleId;
		this.name = name;
		this.deleteFlag = deleteFlag;
	}

	/**
	 * @return the roleId
	 */
	public final String getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public final void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the deleteFlag
	 */
	public final Boolean getDeleteFlag() {
		return deleteFlag;
	}

	/**
	 * @param deleteFlag the deleteFlag to set
	 */
	public final void setDeleteFlag(Boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	
}
