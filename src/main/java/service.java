import java.util.HashMap;
import java.util.Map;

public class service {
    private Map<Integer, account> students;
    service(){
        this.students = new HashMap<>();
    }
    public void createAccount(int number, account thisAccount){
        students.put(number, thisAccount);
    }
    public account getAccount(int identify){
        return students.get(identify);
    }
}
