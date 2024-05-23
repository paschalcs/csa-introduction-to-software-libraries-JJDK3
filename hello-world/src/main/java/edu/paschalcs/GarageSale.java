import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class GarageSale {
    private Map<String, Category> categories;
    private Map<String, Person> people;
    private double totalSales;
    private int totalItems;

    public GarageSale() {
        categories = new HashMap<>();
        categories.put("clothes", new Category("Clothes"));
        categories.put("electronics", new Category("Electronics"));
        categories.put("general", new Category("General"));

        people = new HashMap<>();
        people.put("Adam", new Person("Adam"));
        people.put("Cindy", new Person("Cindy"));
        people.put("Mary", new Person("Mary"));
        people.put("Jorge", new Person("Jorge"));

        totalSales = 0;
        totalItems = 0;
    }

    public void newTransaction() {
        Scanner scanner = new Scanner(System.in);
        double totalAmount = 0;
        int totalItems = 0;

        while (true) {
            System.out.print("Enter the item category (clothes, electronics, general) or 'done' to finish: ");
            String category = scanner.nextLine().trim().toLowerCase();

            if (category.equals("done")) {
                break;
            }
            if (!categories.containsKey(category)) {
                System.out.println("Invalid category. Please enter 'clothes', 'electronics', or 'general'.");
                continue;
            }

            System.out.print("Enter the seller's name (Adam, Cindy, Mary, Jorge): ");
            String seller = scanner.nextLine().trim();
            if (!people.containsKey(seller)) {
                System.out.println("Invalid seller name. Please enter 'Adam', 'Cindy', 'Mary', or 'Jorge'.");
                continue;
            }

            System.out.print("Enter the price of the item: ");
            double price;
            try {
                price = Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid price. Please enter a valid number.");
                continue;
            }

            Item item = new Item(category, seller, price);
            processItem(item);

            totalAmount += price;
            totalItems += 1;
        }

        System.out.println("Transaction complete: " + totalItems + " items sold for a total of $" + String.format("%.2f", totalAmount));
    }

    private void processItem(Item item) {
        categories.get(item.getCategory()).addSale(item);
        people.get(item.getSeller()).sellItem(item);
        totalSales += item.getPrice();
        totalItems += 1;
    }

    public void reportPersonSales() {
        for (Person person : people.values()) {
            System.out.println(person.reportSales());
        }
    }

    public void reportCategorySales() {
        for (Category category : categories.values()) {
            System.out.println(category.reportSales());
        }
    }

    public void reportOverallSales() {
        System.out.println("Total items sold: " + totalItems);
        System.out.println("Total sales amount: $" + String.format("%.2f", totalSales));
        reportCategorySales();
        reportPersonSales();
    }
}
