/**
 * 
 */
package com.quoioln.example.controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quoioln.example.dao.AccountDao;
import com.quoioln.example.model.Account;
import com.quoioln.example.util.Const;

/**
 * @author vpquoi
 *
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountDao accountDao;
    
    @RequestMapping(value = "/login"
            , method = RequestMethod.POST
            , produces = MediaType.APPLICATION_JSON_VALUE
            , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> login(@RequestBody Account account, HttpSession session) {
        Account accountCheck =  accountDao.findOne(account.getUsername(), account.getPassword());
        
        int status = Const.LoginStatus.SUCCESS;
        if (accountCheck == null) {
            status = Const.LoginStatus.FAILED;
        } else if (!account.getRoleId().equals(account.getRoleId())) {
            status = Const.LoginStatus.NO_PERMISSION;
        } else {
            session.setAttribute(Const.Session.ACCOUNT_ID, account.getAccountId());
            session.setAttribute(Const.Session.ROLE_ID, account.getRoleId());
        }
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ResponseEntity<Integer> logout(@RequestParam String accountId, HttpSession session) {
        int status = 1;
        if (session.getAttribute(Const.Session.ACCOUNT_ID) != null) {
            session.removeAttribute(Const.Session.ACCOUNT_ID);
        } else {
            status = 0;
        }
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
