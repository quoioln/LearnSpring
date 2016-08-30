/**
 * 
 */
package com.quoioln.example.util;

// TODO: Auto-generated Javadoc
/**
 * The Class Const.
 *
 * @author vpquoi
 */
public class Const {
    
    /**
     * The Class Session.
     */
    public static class Session{
        
    	public static final String TOKEN = "TOKEN";
    	
        /** The Constant USERNAME. */
        public static final String ACCOUNT_ID = "ACCOUNT_ID";
        
        /** The Constant USERNAME. */
        public static final String USERNAME = "USERNAME";
        
        /** The Constant ROLE_ID. */
        public static final String ROLE_ID = "ROLE_ID";
    }
    
    /**
     * The Class LoginStatus.
     */
    public static class LoginStatus {
        public static final Integer SUCCESS = 1;
        public static final Integer FAILED = 0;
        public static final Integer NO_PERMISSION = -1;
    }
    
    public static class LogoutStatus {
        public static final Integer SUCCESS = 1;
        public static final Integer FAILED = 0;
    }
}
