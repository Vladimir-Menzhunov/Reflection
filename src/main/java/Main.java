import Classes.SomeBean;
import Injector.Injector;

public class Main {
    public static void main(String[] args) {

       SomeBean sb = (new Injector<SomeBean>()).inject(new SomeBean());
       sb.foo();

    }
}
