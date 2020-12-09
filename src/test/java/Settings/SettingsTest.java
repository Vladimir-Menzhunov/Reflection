package Settings;

import org.junit.Test;
import java.io.InputStream;
import static org.junit.Assert.assertEquals;

public class SettingsTest  {
    @Test
    public void loader() throws Exception {
        Settings settings = new Settings();
        ClassLoader loader = Settings.class.getClassLoader();

        try(InputStream io = loader.getResourceAsStream("app.properties")) {
            settings.load(io);
        }

        String value = settings.getValue("Interfaces.SomeInterface");
        assertEquals(value, "Classes.SomeImpl");
    }
}