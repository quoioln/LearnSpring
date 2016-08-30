/**
 * 
 */
package com.quoioln.example.dao;

import javax.servlet.http.HttpSession;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.quoioln.example.model.Account;
import com.quoioln.example.model.Employee;

/**
 * @author vpquoi
 *
 */
public interface AccountDao extends CrudRepository<Account, Long> {
    @Query(value = "from Account where username = :username AND password = :password AND deleteFlag = 'false'")
	public Account findOne(@Param("username") String username, @Param("password") String password);
}
