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

// TODO: Auto-generated Javadoc
/**
 * The Class Account.
 *
 * @author vpquoi
 */
@Entity
@Table(name = "account")
public class Account {
    
    /** The account id. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private Long accountId;
    
    /** The username. */
    @Column(name = "username")
    private String username;
    
    /** The password. */
    @Column(name = "password")
    private String password;
    
    /** The role id. */
    @Column(name = "role_id")
    private String roleId;
    
    /** The delete flag. */
    @Column(name = "delete_flag")
    private Boolean deleteFlag;
    
    /**
     * Instantiates a new account.
     */
    public Account() {
    }
    
    
    /**
     * Instantiates a new account.
     *
     * @param accountId the account id
     * @param username the username
     * @param password the password
     * @param roleId the role id
     * @param deleteFlag the delete flag
     */
    public Account(Long accountId, String username, String password, String roleId, Boolean deleteFlag) {
        this.accountId = accountId;
        this.username = username;
        this.password = password;
        this.roleId = roleId;
        this.deleteFlag = deleteFlag;
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
     * Gets the username.
     *
     * @return the username
     */
    public final String getUsername() {
        return username;
    }


    /**
     * Sets the username.
     *
     * @param username the username to set
     */
    public final void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the password.
     *
     * @return the password
     */
    public final String getPassword() {
        return password;
    }


    /**
     * Sets the password.
     *
     * @param password the password to set
     */
    public final void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the delete flag.
     *
     * @return the deleteFlag
     */
    public final Boolean getDeleteFlag() {
        return deleteFlag;
    }


    /**
     * Sets the delete flag.
     *
     * @param deleteFlag the deleteFlag to set
     */
    public final void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
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
