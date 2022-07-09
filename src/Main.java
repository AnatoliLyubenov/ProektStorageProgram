import java.util.Scanner;

public class Main {
    //Да се напише компютърна програма, реализираща информационна система, обслужваща склад. Програмата да поддържа текстов диалогов режим, позволяващ удобен интерактивен избор на следните операции:
    //
    //списък на наличните продукти в склада. За всеки продукт се съхранява и извежда следната информация:
    //име (описание - символен низ с произволна дължина)
    //срок на годност
    //дата на постъпване в склада
    //име на производител
    //мерна единица (килограми, литри)
    //налично количество
    //местоположение (секция/рафт/номер) (номерирайте склада си както прецените, че ще ви е удобно, имайте предвид, че в началото той е празен и различно количество стока е нормално да заема различно по обем място)
    //допустим брой от продукта на рафт
    //коментар (свободен текст)
    //записване на нова доставка
    //ако нов продукт е с различен срок на годност от вече съществуващ едноименен продукт, той да бъде поставен на различно място
    //ако имате достатъчно място, еднакви продукти с един и същи срок на годност да бъдат поставени на едно и също място
    //при извеждане на списъка с налични продукти да се изведе общото количество на едноименните продукти независимо от срока им на годност
    //справка за наличността в даден период (по дадена начална и крайна дата се извежда списък с всички промени на наличността в дадения период, включително зареждания и извеждания на стоки)
    //Пример:
    //Please choose what to do (1 - List all items; 2 - Add new delivery; 3 - List deliveries for time period)
    //<< 1
    //Light bulb - LED 75W | Expiry date: n/a | Entry date: 05.05.2021 | Manufacturer: Philips | Unit: Item | Stock: 104 | Position: A3 / 4 / 10 | Available items at shelf: 500 | Comment:
    //Battery AAA | Expiry date: 10.10.2026 | Entry date: 10.07.2020 | Manufacturer: Duracel | Unit: Item | Stock: 638 | Position: C2 / 5 / 1 | Available items at shelf: 10000 | Comment:in every box there are 10 packages of 4 batters each
    //
    //Please choose what to do (1 - List all items; 2 - Add new delivery; 3 - List deliveries for time period)
    //<< 2
    //Enter product name:
    //<< Battery CR32
    //Enter expiry date:
    //<<24.11.2025
    //Enter entry date:
    //<< 02.06.2021
    //Enter manufacturer:
    //<< Varta
    //Enter unit:
    //<< Item
    //Enter available stock:
    //<< 900
    //Enter comment (optional):
    //<<
    //Product was added successfully!
    //
    //Please choose what to do (1 - List all items; 2 - Add new delivery; 3 - List deliveries for time period)
    //<< 3
    //From date:
    //<< 01.05.2021
    //To date:
    //<< 31.05.2021
    //List of product transactions for the period 01.05.2021 - 31.05.2021:
    //Light bulb - LED 75W | Entry date: 05.05.2021 | Unit: Item | Stock delivered: 200
    public class Methods {
        public static void menu(String[][] inventory, int itemCounter) throws Exception {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please select with NUMBER the operation you want to be performed:\n");
            System.out.println("    1): List all items");
            System.out.println("    2): Add new delivery");
            System.out.println("    3): List deliveries for time period ");
            System.out.println("0 - > EXIT;\n");
            System.out.print("Pending your choice: ");

            int choice = sc.nextByte();

            switch (choice) {
                case 1 -> showList(inventory, itemCounter);
                case 2 -> addItem(inventory, itemCounter);
                case 0 -> {
                    return;
                }
            }
        }
    }

    public static void showList(String[][] inventory, int itemCounter) throws Exception {
        for (int i = 0; i < inventory.length; i++) {
            for (int j = 0; j < inventory[i].length; j++) {
                if (inventory[0][0].equals("n/a")) {
                    System.out.println("List is empty");
                } else if (!inventory[i][j].equals("n/a")) {

                    switch (j) {
                        case 0 -> System.out.print(inventory[i][0] + " | ");
                        case 1 -> System.out.print("Expiry date: " + inventory[i][1] + " | ");
                        case 2 -> System.out.print("Entry date: " + inventory[i][2] + " | ");
                        case 3 -> System.out.print("Manufacturer: " + inventory[i][3] + " | ");
                        case 4 -> System.out.print("Unit: " + inventory[i][4] + " | ");
                        case 5 -> System.out.print("Stock: " + inventory[i][5] + " | ");
                        case 6 -> System.out.print("Position: " + inventory[i][6] + " | ");
                        case 7 -> System.out.print("Available items at shelf: " + inventory[i][7]);
                    }
                } else if (inventory[i][j].equals("n/a")) {
                    System.out.println();
                    Methods.menu(inventory, itemCounter);
                }
            }
            System.out.println();
        }
        Methods.menu(inventory, itemCounter);
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
                }
            }
        }
        System.out.println("Product was added successfully!");
        System.out.println(inventory[itemCounter][0]);
        System.out.println();
        itemCounter++;
        Methods.menu(inventory, itemCounter);
    }
}
