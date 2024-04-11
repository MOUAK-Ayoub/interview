package com.codingame.algorithms;


import java.io.File;
import java.io.IOException;

public class FileFinder {

    public static final String FILENAME = "Frais clavier, souris.pdf";
    public static String currentPath = "C:\\Administration\\";
    public static String path = null;


    public static void main(String[] args) throws IOException {


        String pathUniverse = FileFinder.locateUniverseFormula();
        System.out.println(pathUniverse);
    }

    public static String locateUniverseFormula() throws IOException {
        File file = new File(currentPath);
        if (file.exists()) {
            if (FILENAME.equals(file.getName())) {
                path = file.getPath();
            } else {
                if (file.listFiles() != null) {
                    for (File fileIn : file.listFiles()) {

                        if (path == null) {
                            currentPath = fileIn.getAbsolutePath();
                            path = locateUniverseFormula();
                        }
                    }
                }

            }

        }

        return path;

    }
}
