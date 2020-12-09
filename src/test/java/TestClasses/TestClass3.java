package TestClasses;

import InterfacesTest.TestSomeOther;


public class TestClass3 implements TestSomeOther {
    @Override
    public String doSomething() {
        return "TestClass3";
    }
}