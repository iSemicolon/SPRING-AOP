package org.kol.springaop.component;

import org.springframework.stereotype.Component;

@Component
public class Employee {


    public int returnAmountEmployee(int amount, int year){

        int add= amount*year;
        System.out.println("Employee-AMOUNT: calculate "+ "amount: "+amount+ " year: "+year+ " Result: "+ add);
        return add;
    }



}
