package TestClasses;

import InterfacesTest.TestSomeOtherInterface;

public class TestClass2 implements TestSomeOtherInterface {
    @Override
    public String doSomething() {
        return "TestClass2";
    }
}
