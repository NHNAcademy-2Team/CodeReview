package chapter.two;

import java.awt.*;
import java.io.FileNotFoundException;
import textio.Textio;

public class Exercise7 {
    public static void main(String[] args) throws FileNotFoundException {
        String name;
        int score1, score2, score3;
        double average;

        String path = selectReadFile();
        Textio.readFile(path);

        name = Textio.getln();
        score1 = Textio.getlnInt();
        score2 = Textio.getlnInt();
        score3 = Textio.getlnInt();

        average = (score1 + score2 + score3) / 3.0;

        System.out.printf("%s 학생의 평균: %1.1f ", name, average);

    }
    public static String selectReadFile() throws FileNotFoundException {
        Frame frame = new Frame();
        FileDialog fileDialog = new FileDialog(frame, "SelectInputFile", FileDialog.LOAD);
        fileDialog.setVisible(true);
        return getFilepath(fileDialog);
    }
    private static String getFilepath(FileDialog fileDialog) throws FileNotFoundException {
        String selectFilePath = fileDialog.getDirectory() + fileDialog.getFile();
        if (fileDialog.getFile() == null) {
            throw new FileNotFoundException("파일이 없다");
        }

        return selectFilePath;
    }
}

