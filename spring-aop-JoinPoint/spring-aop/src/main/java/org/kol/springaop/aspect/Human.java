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

    @Before("execution( public void accountOpen())")
    // Always documentVerify() should run before accountOpen()
    public void documentVerify(){

        System.out.println("Document Successfully Verified");
    }

    @After("execution( public void accountOpen())")
    // Always eligibleTransaction() should run After accountOpen()
    public void eligibleTransaction(){

        System.out.println("*Now You Are Eligible For Transactions");
    }
*/

    /*
    @Before("countryValidation()")
    // Always documentVerify() should run before accountOpen()
    public void documentVerify(){

        System.out.println("Document Successfully Verified");
    }

    @After("countryValidation()")
    // Always eligibleTransaction() should run After accountOpen()
    public void eligibleTransaction(){

        System.out.println("*Now You Are Eligible For Transactions");
    }



    @Pointcut("execution( public * accountOpen*())")
    public void countryValidation(){

    }


     */


    @Before("balanceValidation()")
    // Always documentVerify() should run before accountOpen()
    public void documentVerify(JoinPoint joinPoint){

        System.out.println("Document Successfully Verified "+ joinPoint.getSignature());
    }

    @After("balanceValidation()")
    // Always eligibleTransaction() should run After accountOpen()
    public void eligibleTransaction(){

        System.out.println("*Now You Are Eligible For Transactions");
    }


    @Pointcut("execution( public * returnAmount*(..))")
   //  for parameterized Employee.returnAmountEmployee(int,int)

   // @Pointcut("execution( public * returnAmount*())")
   // for non-parameterized Student.returnAmountStudent()
    public void balanceValidation(){

    }


}
