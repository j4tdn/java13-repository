package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBProvider {
	public static Properties getProps() throws IOException {
		Properties props = new Properties();
		InputStream ios = new FileInputStream(new File("app.properties"));
		props.load(ios);
		return props;
	}
}