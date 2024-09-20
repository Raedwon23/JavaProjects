import java.util.*;

public class Something {
    
    public static class Menu {
        private ArrayList<String> items = new ArrayList<String>();
        private String[] descriptions = { "Rice", "Idli", "Dosa", "Vada"};
        private String[] inventory = {"Puffed", "Chawal", "Sooji", "Besan", "Arhar", "Water"};

        public Menu() {
            items.add("Rice");
            items.add("Idli");
            items.add("Dosa");
            items.add("Vada");
        }

        public void addItem(String item, String description) {
            items.add(item);
            descriptions[items.size() - 1] = description;
        }

        public void removeItem(String item) {
            int index = items.indexOf(item);
            if (index != -1) {
                items.remove(index);
                descriptions[index] = "";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to this restaurant");
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        while (true) {
            System.out.println("1. View menu");
            System.out.println("2. Add item to menu");
            System.out.println("3. Remove item from menu");
            System.out.println("4. Place order");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Menu:");
                    for (int i = 0; i < menu.items.size(); i++) {
                        System.out.println((i + 1) + ". " + menu.items.get(i) + " - " + menu.descriptions[i]);
                    }
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    String item = scanner.next();
                    System.out.print("Enter item description: ");
                    String description = scanner.next();
                    menu.addItem(item, description);
                    System.out.println("Item added to menu");
                    break;
                case 3:
                    System.out.print("Enter item name: ");
                    item = scanner.next();
                    menu.removeItem(item);
                    System.out.println("Item removed from menu");
                    break;
                case 4:
                    // code for placing order
                    break;
                case 5:
                    System.out.println("Exiting program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
