package TaskOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        File file = new File("cinfo.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                String[] info = input.split(",");
                String firstName = info[0];
                String lastName = info[1];
                String username = info[2];
                int id = Integer.parseInt(info[3]);

                Customer c = new Customer(firstName, lastName, username, id);
                System.out.println(c);
            }

        } catch(FileNotFoundException e){
                System.out.println("file not found!");
        }
    }
}
