package org.kol.springaop.component;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    public void accountOpenEmployee(){

        System.out.println("Employee: Bank Account Opened");
    }

    public int returnAmountEmployee(int amount, int year){

        int add= amount*year;
        System.out.println("Employee-AMOUNT: Eligible");
        return 0;
    }



}
