package org.kol.springaop;

import org.kol.springaop.component.Employee;
import org.kol.springaop.component.Student;
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

		Student student=context.getBean("student", Student.class);
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

		 */



		System.out.println("------------@Before & @After  @Pointcut Example-----------");
     // always documentVerify() should run before accountOpen()
     // always eligibleTransaction() should run After accountOpen()

		System.out.println("------------:Student Area:-----------");
		student.accountOpenStudent();

		System.out.println("------------:Employee Area:-----------");
		employee.accountOpenEmployee();

		System.out.println("-------------------------------------------------");

		/* output::
------------@Before & @After Example-----------
------------:Student Area:-----------
Document Successfully Verified
STUDENT: Bank Account Opened
*Now You Are Eligible For Transactions
------------:Employee Area:-----------
Document Successfully Verified
Employee: Bank Account Opened
*Now You Are Eligible For Transactions
-------------------------------------------------
		 */

	}

}
