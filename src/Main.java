import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        try {
            BufferedReader reader = new BufferedReader (new FileReader(inputFile));
            StringBuilder content = new StringBuilder();
            String line;
            while((line = reader.readLine())!= null) {
                content.append(line).append("\n");
            }
            reader.close();
            String replacedContent = content.toString().replaceAll("NHa Trang", "Vũng Tàu");
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(replacedContent);
            writer.close();
            System.out.println("File output.txt ghi thanh cong");
        } catch (IOException e) {
            System.out.println("Da xay ra loi khi doc file");
        }
    }
}
