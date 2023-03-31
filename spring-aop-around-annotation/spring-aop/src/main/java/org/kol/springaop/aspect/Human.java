package org.kol.springaop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class Human {

  //  @Around("execution(* returnAmount*(int, int))")
     @Around("pointCutMethod()")
    public int modifyBehavior(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        int result = 42;
        System.out.println("Intercepting method call...");
        // Call the original method and modify its return value

        int amount=(int)proceedingJoinPoint.getArgs()[0] +5;
        int year=(int)proceedingJoinPoint.getArgs()[1]+5;

        int add=amount*year;

        //calling returnAmountEmployee here
        result = (int) proceedingJoinPoint.proceed();
      //  return result;

       System.out.println("Employee-AMOUNT: calculate "+ "amount: "+amount+ " year: "+year+ " Result: "+ add);

        return  add;
    }


    @Pointcut("execution(* returnAmount*(int, int))")
    public void pointCutMethod() {}


}
