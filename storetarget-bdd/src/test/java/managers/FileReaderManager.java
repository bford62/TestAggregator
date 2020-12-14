package managers;

import dataProviders.ConfigFileReader;

public class FileReaderManager {

    public static FileReaderManager fileReaderManager = new FileReaderManager();
    public static ConfigFileReader configFileReader;

    public FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {
        return fileReaderManager;
    }

    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
}