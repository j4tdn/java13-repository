package com.persistence.connection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class DBProvider {
    private static final String absolute_path = "../lesson17-tranviet/application.properties";

    public static Properties getProps() throws IOException {
        Properties props = new Properties();
        props.load(Files.newInputStream(Paths.get(absolute_path)));
        return props;
    }
}
