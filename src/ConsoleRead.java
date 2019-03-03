import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleRead {


    private String text;
    private List<String> list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    public List<String> readFromConsole() {
        System.out.println("Enter something here");

        while (scanner.hasNextLine()) {
            text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }
            list.add(text);
        }
        return list;

    }

    public List<String> getList() {
        return list;
    }
}
