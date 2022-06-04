package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbProvider {
	public static Properties getProps() throws IOException {
		Properties props = new Properties();

		// Read properties file
		InputStream ios = new FileInputStream(new File("application.properties"));
		props.load(ios);

		return props;
	}
}
