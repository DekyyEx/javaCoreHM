package hm5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class BackupCreator {
    public static void createBackup(String directoryPath) {
        File directory = new File(directoryPath);
        File backupDirectory = new File("./backup");

        if (!backupDirectory.exists()) {
            backupDirectory.mkdir();
        }

        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    File backupFile = new File(backupDirectory, file.getName());
                    try {
                        Files.copy(file.toPath(), backupFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println("Backup created successfully.");
    }

    public static void main(String[] args) {
        createBackup("./directory_path");
    }
}
