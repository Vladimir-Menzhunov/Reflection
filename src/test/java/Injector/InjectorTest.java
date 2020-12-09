package Injector;

import TestClasses.Tester;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InjectorTest {

    @Test
    public void testInject() {
        Tester tester = (new Injector<Tester>()).inject(new Tester());
        assertEquals("TestClass1", tester.getDoSomethingField1());
        assertEquals("TestClass2", tester.getDoSomethingField2());
        assertEquals("TestClass3", tester.getDoSomethingField3());
    }

}