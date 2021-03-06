package com.accountapp;

import java.io.IOException;

public class App {
    private App(){}
    public static void main(String[] args) throws IOException {
        Service studentService = new Service();
        Account daniel = new Account("Daniel", "Mann", "AC344");
        studentService.createAccount(1,daniel);
        Account marcus = new Account("Marcus", "Pilkington", "Afbhfuiow45");
        studentService.createAccount(2,marcus);
        Account seb = new Account("Sebastien", "Delaney", "4780247bfrehj");
        studentService.createAccount(3,seb);
        System.out.println(studentService.getAccount(1).toString());
        String jsonString = JsonConverter.fromMap(studentService.getStudents());
        System.out.println(jsonString);
        JsonConverter.toFile(jsonString);
    }
}
