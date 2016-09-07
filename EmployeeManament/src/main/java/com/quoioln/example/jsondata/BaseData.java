/**
 * 
 */
package com.quoioln.example.jsondata;

/**
 * @author quoioln
 *
 */
public class BaseData {
	/** The token. */
	private String token;
	
	/** The account id. */
	private Long accountId;
	
	/** The role id. */
	private String roleId;
	

	/**
	 * Instantiates a new base data.
	 */
	public BaseData() {
	}
	
	/**
	 * Instantiates a new base data.
	 *
	 * @param token
	 *            the token
	 * @param accountId
	 *            the account id
	 * @param roleId
	 *            the role id
	 */
	public BaseData(String token, Long accountId, String roleId) {
		this.token = token;
		this.accountId = accountId;
		this.roleId = roleId;
	}

	/**
	 * @return the token
	 */
	public final String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public final void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the accountId
	 */
	public final Long getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public final void setAccountId(Long accountId) {
		this.accountId = accountId;
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
	
	
}
