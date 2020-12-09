package Classes;

import Interfaces.SomeOther;
import MyAnnotation.AutoInjectable;
import Interfaces.SomeInterface;
import Interfaces.SomeOtherInterface;

public class SomeBean {

    @AutoInjectable
    private SomeInterface field1;
    @AutoInjectable
    private SomeOtherInterface field2;
    @AutoInjectable
    private SomeOther field3;

    public void foo() {
        field1.doSomething();
        field2.doSomething();
        field3.doSomething();
    }

    public String getDoSomethingField1() {
        return field1.doSomething();
    }

    public String getDoSomethingField2() {
        return field2.doSomething();
    }

    public String getDoSomethingField3() {
        return field3.doSomething();
    }
}
