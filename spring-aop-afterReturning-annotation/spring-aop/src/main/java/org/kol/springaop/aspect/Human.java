package org.kol.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Human {

    /*
    @Before("balanceValidation()")
    // Always documentVerify() should run before accountOpen()
    public void documentVerify(JoinPoint joinPoint){

        System.out.println("before() "+ joinPoint.getArgs()[1]);
    }



    @After("balanceValidation()")
    // Always eligibleTransaction() should run After accountOpen()
    public void eligibleTransaction(){

        System.out.println("after()");
    }

     */

    @AfterReturning(pointcut=("execution( public * returnAmount*(..)))"), returning = "returnValue")
    // Always eligibleTransaction() should run After accountOpen()
    public void eligibleBalance(int returnValue){

        System.out.println("afterReturning():"+returnValue);
    }


    /*

    @Pointcut("execution( public * returnAmount*(..))")
   //  for parameterized Employee.returnAmountEmployee(int,int)

   // @Pointcut("execution( public * returnAmount*())")
   // for non-parameterized Student.returnAmountStudent()
    public void balanceValidation(){

    }


     */


}
