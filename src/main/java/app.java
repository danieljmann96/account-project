public class app {
    public static void main(String[] args) {
        System.out.println("Hello world to the standard out");
        account Daniel = new account();
        Daniel.setFirstName("Daniel");
        Daniel.setLastName("Mann");
        Daniel.setAccountNumber("AC344");
        service studentService = new service();
        studentService.createAccount(1,Daniel);
        System.out.println(studentService.getAccount(1).toString());
    }
}
