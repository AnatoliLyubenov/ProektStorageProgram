import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void menu(String[][] inventory, int itemCounter) throws Exception {

        System.out.println("Please choose what to do");
        System.out.println("1 - > List all items;");
        System.out.println("2 - > Add new delivery;");
        System.out.println("3 - > List deliveries for time period;");
        System.out.println("0 - > EXIT;");
        System.out.print("Your choice - > ");

        Scanner sc = new Scanner(System.in);
        byte choice = sc.nextByte();
        switch (choice) {
            case 1 -> showList(inventory, itemCounter);
            case 2 -> addItem(inventory, itemCounter);
            case 3 -> searchPeriod(inventory, itemCounter);
            case 0 -> {
                return;// return-a ме изкарва от метод меню
            }
        }

    }

    public static void showList(String[][] inventory, int itemCounter) throws Exception {
        for (int i = 0; i < inventory.length; i++) {
            for (int j = 0; j < inventory[i].length; j++) {
                if (inventory[0][0].equals("n/a")) {
                    System.out.println("List is empty");
                } else if (!inventory[i][j].equals("n/a")) {//за всеки един елемент, който не e n/a

                    switch (j) {
                        case 0 -> System.out.print(inventory[i][0] + " | ");
                        case 1 -> System.out.print("Expiry date: " + inventory[i][1] + " | ");
                        case 2 -> System.out.print("Entry date: " + inventory[i][2] + " | ");
                        case 3 -> System.out.print("Manufacturer: " + inventory[i][3] + " | ");
                        case 4 -> System.out.print("Unit: " + inventory[i][4] + " | ");
                        case 5 -> System.out.print("Stock: " + inventory[i][5] + " | ");
                        case 6 -> System.out.print("Position: " + inventory[i][6] + " | ");
                        case 7 -> System.out.print("Available items at shelf: " + inventory[i][7] + " | ");
                        case 8 -> System.out.print("Comment: " + inventory[i][8]);
                    }
                } else if (inventory[i][j].equals("n/a")) {
                    System.out.println();
                    menu(inventory, itemCounter);
                }
            }
            System.out.println();
        }
        menu(inventory, itemCounter);
    }

    public static void addItem(String[][] inventory, int itemCounter) throws Exception {
        if (inventory[itemCounter][0].equals("n/a")) {
            for (int j = 0; j < inventory[itemCounter].length; j++) {
                Scanner sc = new Scanner(System.in);
                switch (j) {

                    case 0 -> {
                        System.out.println();
                        System.out.print("Enter product name-> ");
                        inventory[itemCounter][0] = sc.nextLine();

                    }
                    case 1 -> {
                        System.out.print("Enter expiry date-> ");
                        inventory[itemCounter][1] = sc.nextLine();

                    }
                    case 2 -> {
                        System.out.print("Enter entry date-> ");
                        inventory[itemCounter][2] = sc.nextLine();
                    }
                    case 3 -> {
                        System.out.print("Enter manufacturer-> ");
                        inventory[itemCounter][3] = sc.nextLine();
                    }
                    case 4 -> {
                        System.out.print("Enter unit-> ");
                        inventory[itemCounter][4] = sc.nextLine();
                    }
                    case 5 -> {
                        System.out.print("Enter in stock-> ");
                        inventory[itemCounter][5] = sc.nextLine();
                    }
                    case 6 -> {
                        System.out.print("Enter position-> ");
                        inventory[itemCounter][6] = sc.nextLine();
                    }
                    case 7 -> {
                        System.out.print("Enter available items at shelf-> ");
                        inventory[itemCounter][7] = sc.nextLine();
                    }
                    case 8 -> {
                        System.out.print("Comment-> ");
                        inventory[itemCounter][8] = sc.nextLine();
                    }
                }
            }
        }
        System.out.println("Product was added successfully!");
        System.out.println();
        itemCounter++;
        menu(inventory, itemCounter);
    }

    public static void searchPeriod(String[][] inventory, int itemCounter) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("From date-> ");
        String startDate = sc.nextLine();
        Date startD = new SimpleDateFormat("dd.MM.yyyy").parse(startDate);
        System.out.print("To date-> ");
        String endDate = sc.nextLine();
        Date endD = new SimpleDateFormat("dd.MM.yyyy").parse(endDate);

        System.out.println();
        System.out.println("List of product transactions for the period " + startDate + " - " + endDate + ":");
        System.out.println();
        for (int i = 0; i < inventory.length; i++) {
            for (int j = 0; j < inventory[i].length; j++) {

                if (inventory[0][0].equals("n/a")) {
                    System.out.println("List is empty");

                } else if (!inventory[i][2].equals("n/a")) {
                    Date itemDate = new SimpleDateFormat("dd.MM.yyyy").parse(inventory[i][2]);//каствам към датa. Дата е клас и затова е с главна буква
                    //проверка между датите
                    if (startD.before(itemDate) && endD.after(itemDate) || startD.equals(itemDate) || endD.equals(itemDate))
                        switch (j) {
                            case 0 -> System.out.print(inventory[i][0] + " | ");
                            case 1 -> System.out.print("Expiry date: " + inventory[i][1] + " | ");
                            case 2 -> System.out.print("Entry date: " + inventory[i][2] + " | ");
                            case 3 -> System.out.print("Manufacturer: " + inventory[i][3] + " | ");
                            case 4 -> System.out.print("Unit: " + inventory[i][4] + " | ");
                            case 5 -> System.out.print("Stock: " + inventory[i][5] + " | ");
                            case 6 -> System.out.print("Position: " + inventory[i][6] + " | ");
                            case 7 -> System.out.print("Available items at shelf: " + inventory[i][7] + "|");
                            case 8 -> System.out.println("Comment: " + inventory[i][8]);
                        }
                } else if (inventory[i][j].equals("n/a")) {//това е едно място от масива
                    System.out.println();
                    menu(inventory, itemCounter);
                }
            }
            System.out.println();
        }
        menu(inventory, itemCounter);
    }

    public static String[][] initializeInventory() {
        //inventory[0][0]=names
        //inventory[0][1]=Expiry date
        //inventory[0][2]=Entry date
        //inventory[0][3]=Manufacturer
        // inventory[0][4]=Unit
        //inventory[0][5]=Stock
        //inventory[0][6]=Position
        //inventory[0][7]=Available items at shelf
        //inventory[0][8]=Comment

        String[][] inventory = new String[20][9];
        for (String[] strings : inventory) {
            Arrays.fill(strings, "n/a");
        }


        return inventory;
    }

    public static void main(String[] args) throws Exception {
        int itemCounter = 0;
        String[][] inventory = initializeInventory();
        menu(inventory, itemCounter);
    }
}