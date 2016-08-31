///**
// * 
// */
//package com.quoioln.example.aop;
//
//import javax.servlet.http.HttpSession;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//
//import com.quoioln.example.jsondata.BaseJson;
//import com.quoioln.example.util.Const;
//
///**
// * @author vpquoi
// *
// */
//@Component
//@Aspect
//public class CheckLogin {
//    @SuppressWarnings({"rawtypes", "unchecked"})
//    @Around(value = "execution(* com.quoioln.example.controller.*.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
//    public ResponseEntity<Object> checkLogin(ProceedingJoinPoint pjp) throws Throwable{
////  @Around(value = "execution(* com.quoioln.example.controller.*.*(..)) && @annotation(org.springframework.web.bind.annotation.RequestMapping) && args(employee, session)")
////  public ResponseEntity checkLogin(ProceedingJoinPoint pjp, Employee employee, HttpSession session) throws Throwable {
//        Object[] objects = pjp.getArgs();
//        BaseJson baseData = (BaseJson) objects[0];
//        HttpSession session = (HttpSession) objects[1];
//        String token = (String) session.getAttribute(Const.Session.TOKEN);
//        String accountId = (String) session.getAttribute(Const.Session.ACCOUNT_ID);
//        if (token == null || !token.equals(baseData.getToken()) 
//        		|| accountId == null || accountId.equals(baseData.getAccountId())) {
//        	return new ResponseEntity(HttpStatus.BAD_REQUEST);
//        }
//        
//        return (ResponseEntity) pjp.proceed();
//    }
//    
//}
