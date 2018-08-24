package com.accountapp;

import java.util.HashMap;
import java.util.Map;

public class Service {
    private Map<Integer, Account> students;
    Service(){
        this.students = new HashMap<>();
    }

    public Map<Integer, Account> getStudents() {
        return students;
    }


    public void createAccount(int number, Account thisAccount){
        students.put(number, thisAccount);
    }
    public Account getAccount(int identify){
        return students.get(identify);
    }
}
