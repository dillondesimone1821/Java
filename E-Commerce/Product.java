public class Product {
    // 2.1 and 2.3 Attributes
    private String name;
    private double price;
    private String category;
    private int quantity;
    private char size;
    private String author;
    private String color;

    // 2. Constructors
    // Apparel
    public Product(String name, double price, String category, int quantity, char size, String color) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.size = size;
        this.color = color;
    }

    // Books
    public Product(String name, double price, String category, int quantity, String author) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.author = author;
    }

    // Soap
    public Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    // 2.3 Getters and Setters for members

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // 2.4 ToString() method to print all attributes
     @Override
     public String toString() {
         return "Product [author=" + author + ", category=" + category + ", color=" + color + ", name=" + name
                 + ", price=" + price + ", quantity=" + quantity + ", size=" + size + "]";
     }
   

    // 2.5 Instance method
    public boolean buy() {
        if (quantity > 0) {
            quantity = -1;
            return true;
        } else {
            return false;
        }
    }

  
}
