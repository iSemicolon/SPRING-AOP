package org.kol.springaop.component;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    public void accountOpenEmployee(){

        System.out.println("Employee: Bank Account Opened");
    }

}
