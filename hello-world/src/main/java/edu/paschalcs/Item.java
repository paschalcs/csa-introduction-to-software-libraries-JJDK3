class Item {
    private String category;
    private String seller;
    private double price;

    public Item(String category, String seller, double price) {
        this.category = category;
        this.seller = seller;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getSeller() {
        return seller;
    }

    public double getPrice() {
        return price;
    }
}
