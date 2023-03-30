package org.kol.springaop;

import org.kol.springaop.component.Employee;
import org.kol.springaop.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee=context.getBean("employee",Employee.class);

		//@Before
		/*

		@Before is an annotation used in Spring AOP (Aspect-Oriented Programming) to indicate that
		a particular advice method should be executed before the execution of a matched method.



		//@After


		@After is an annotation used in Spring AOP (Aspect-Oriented Programming) to indicate that
		a particular advice method should be executed after the execution of a matched method.



		//@Pointcut

		@Pointcut is an annotation used in Spring AOP (Aspect-Oriented Programming)
		to define a reusable pointcut expression that can be used in multiple advice methods.

		example:  here always we need documentVerify() & accountOpen(),
		          we have to define both things in @Pointcut countryValidation()


		  //JoinPoint

		  JoinPoint is a point of execution of the program,
		  such as executing a method or handling an exception. In Spring AOP,
		  a joinpoint always represents a method execution


		  //AfterReturning
		  @AfterReturning is an annotation used in Spring AOP (Aspect-Oriented Programming)
		  to indicate that a particular advice method should be executed
		  after the successful execution of a matched method and the method has returned a value.

		 */



		System.out.println("------------@AfterReturning Example-----------");
     // always documentVerify() should run before accountOpen()
     // always eligibleTransaction() should run After accountOpen()


		System.out.println("------------:Employee Area:-----------");
		//employee.accountOpenEmployee();
		int retValue=employee.returnAmountEmployee(1000,5);
		System.out.println("Normal Method Call Return Value: "+retValue);

		System.out.println("-------------------------------------------------");

		/* output::
------------@AfterReturning Example-----------
------------:Employee Area:-----------
Employee-AMOUNT: Eligible
afterReturning():5000
Normal Method Call Return Value: 5000
		 */

	}

}
