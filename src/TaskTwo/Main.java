package TaskTwo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        ArrayList<String> coffeeMenu = cafe.getCoffeeMenu();

        for(int i=0;i<coffeeMenu.size();i++){
            String menu = coffeeMenu.get(i);
            System.out.println((i+1)+": "+menu);

        }
    }
}
