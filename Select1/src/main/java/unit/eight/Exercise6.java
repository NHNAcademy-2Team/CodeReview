package unit.eight;

import java.io.*;
public class Exercise6 {
    private String fileName;

    public Exercise6(String fileName){
        this.fileName = fileName;
    }

    public int countLines() {
        int lines = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while(reader.readLine() != null){
                lines++;
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return lines;
    }

    public void write(OutputStream os){
        try(InputStream is = new FileInputStream(fileName)){
            byte[] buffer = new byte[1024];
            int length;
            while((length = is.read(buffer))>0){
                os.write(buffer, 0, length);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void print(){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line = null;
            while(reader.readLine() != null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void copy(String newFileName) throws IOException{
        FileInputStream inputStream = new FileInputStream(fileName);
        FileOutputStream outputStream = new FileOutputStream(newFileName);

        byte[] buffer = new byte[1024];
        int length;
        while((length = inputStream.read(buffer)) > 0){
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
    }

    public void delete() {
        File file = new File(fileName);
        if(file.delete()) {
            System.out.println("파일이 성공적으로 삭제되었습니다.");
        } else {
            System.out.println("파일을 삭제할 수 없습니다.");
        }

    }

    public static void main(String[] args) throws IOException{
        Exercise6 ioFile = new Exercise6("/Users/hongjiwon/Desktop/NewGit/Select1/src/main/java/unit/eight/txtfile/Exercise6");
        System.out.println("라인 수: " + ioFile.countLines());

        FileOutputStream outputStream = new FileOutputStream("/Users/hongjiwon/Desktop/NewGit/Select1/src/main/java/unit/eight/txtfile/output");
        ioFile.write(outputStream);

        ioFile.print();

        ioFile.copy("/Users/hongjiwon/Desktop/NewGit/Select1/src/main/java/unit/eight/txtfile/newFileName");

        ioFile.delete();
    }

}
