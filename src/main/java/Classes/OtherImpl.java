package Classes;
import Interfaces.SomeOther;

public class OtherImpl implements SomeOther {
    public String doSomething(){
        System.out.println("B");
        return "B";
    }
}