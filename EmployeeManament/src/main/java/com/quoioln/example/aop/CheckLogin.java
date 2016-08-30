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

import com.quoioln.example.util.Const;

/**
 * @author vpquoi
 *
 */
@Component
@Aspect
public class CheckLogin {
    @Around(value = "execution(* com.quoioln.example.controller.EmployeeController.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void checkLogin(ProceedingJoinPoint pjp) throws Throwable {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder. getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        if (session.getAttribute(Const.Session.ACCOUNT_ID) == null) {
            System.out.println("unauthentication");
//            return new ResponseEntity<String>("error", HttpStatus.BAD_REQUEST);
//            return;
//            pjp.pr
        }
//        else {
//            System.out.println("authentication");
//            pjp.proceed();
//            return new ResponseEntity<>("ok", HttpStatus.OK);
//        }
//        return;
    }
    
}
