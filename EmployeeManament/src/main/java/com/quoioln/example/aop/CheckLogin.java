/**
 * 
 */
package com.quoioln.example.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.quoioln.example.jsondata.BaseData;
import com.quoioln.example.util.Const;

/**
 * @author vpquoi
 *
 */
@Component
@Aspect
public class CheckLogin {
    @Around(value = "execution(* com.quoioln.example.controller.*.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public ResponseEntity checkLogin(ProceedingJoinPoint pjp) throws Throwable {
//  @Around(value = "execution(* com.quoioln.example.controller.*.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping) && args(employee, session)")
//  public ResponseEntity checkLogin(ProceedingJoinPoint pjp, Employee employee, HttpSession session) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder. getRequestAttributes()).getRequest();
        Object[] objects = pjp.getArgs();
        BaseData baseData = (BaseData) objects[0];
        HttpSession session = (HttpSession) objects[1];
        String token = (String) session.getAttribute(Const.Session.TOKEN);
        String accountId = (String) session.getAttribute(Const.Session.ACCOUNT_ID);
        if (token == null || !token.equals(baseData.getToken()) 
        		|| accountId == null || accountId.equals(baseData.getAccountId())) {
        	return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        
        return (ResponseEntity) pjp.proceed();
    }
    
}
