package org.kol.springaop.component;

import org.springframework.stereotype.Component;

@Component

public class Student {

    public void accountOpenStudent(){

        System.out.println("STUDENT: Bank Account Opened");
    }


    public void returnAmountStudent(){

        System.out.println("STUDENT-AMOUNT: Not Eligible");
    }


}
