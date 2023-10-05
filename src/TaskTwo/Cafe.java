package TaskTwo;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu;

    public Cafe() {
        coffeeMenu = new ArrayList<>();
    }

    public void loadMenuData() {
        File file = new File("coffees.txt");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                coffeeMenu.add(input);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}
