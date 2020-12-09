package TestClasses;

import InterfacesTest.TestSomeInterface;


public class TestClass1 implements TestSomeInterface {
    @Override
    public String doSomething() {
        return "TestClass1";
    }
}
