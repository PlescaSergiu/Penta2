import java.io.IOException;

public class Main {


    public static void main(String... args) throws IOException {

        ConsoleRead consoleRead = new ConsoleRead();
        WriteToFile writeToFile = new WriteToFile();
        if(consoleRead.readFromConsole().isEmpty() ){
            System.out.println("Your input is empty");
        }

        writeToFile.writeToFile("write.txt", consoleRead.getList());

    }

}
