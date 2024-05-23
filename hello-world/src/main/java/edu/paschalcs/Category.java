class Category {
    private String name;
    private double totalSales;
    private int itemCount;

    public Category(String name) {
        this.name = name;
        this.totalSales = 0;
        this.itemCount = 0;
    }

    public void addSale(Item item) {
        this.totalSales += item.getPrice();
        this.itemCount += 1;
    }

    public String reportSales() {
        return name + " category sold " + itemCount + " items for a total of $" + String.format("%.2f", totalSales);
    }
}
