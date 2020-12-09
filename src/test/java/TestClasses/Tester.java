package TestClasses;

import InterfacesTest.TestSomeInterface;
import InterfacesTest.TestSomeOther;
import InterfacesTest.TestSomeOtherInterface;
import MyAnnotation.AutoInjectable;

public class Tester {

    @AutoInjectable
    private TestSomeInterface field1;
    @AutoInjectable
    private TestSomeOtherInterface field2;
    @AutoInjectable
    private TestSomeOther field3;

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
