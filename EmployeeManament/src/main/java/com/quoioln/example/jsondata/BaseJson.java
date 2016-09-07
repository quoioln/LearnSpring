/**
 * 
 */
package com.quoioln.example.jsondata;

/**
 * The Class BaseJson.
 *
 * @author vpquoi
 */
public class BaseJson {
    
    /** The token. */
    private String token;
    
    /** The account id. */
    private Long accountId;
    
    /** The role id. */
    private String roleId;
    
    /**
     * Instantiates a new base json.
     */
    public BaseJson() {
    }
    
    
    /**
     * Instantiates a new base json.
     *
     * @param token the token
     * @param accountId the account id
     * @param roleId the role id
     */
    public BaseJson(String token, Long accountId, String roleId) {
        this.token = token;
        this.accountId = accountId;
        this.roleId = roleId;
    }
    
    /**
     * Gets the token.
     *
     * @return the token
     */
    public final String getToken() {
        return token;
    }
    
    /**
     * Sets the token.
     *
     * @param token the token to set
     */
    public final void setToken(String token) {
        this.token = token;
    }
    
    /**
     * Gets the account id.
     *
     * @return the accountId
     */
    public final Long getAccountId() {
        return accountId;
    }
    
    /**
     * Sets the account id.
     *
     * @param accountId the accountId to set
     */
    public final void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
    
    /**
     * Gets the role id.
     *
     * @return the roleId
     */
    public final String getRoleId() {
        return roleId;
    }
    
    /**
     * Sets the role id.
     *
     * @param roleId the roleId to set
     */
    public final void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    
    
}
