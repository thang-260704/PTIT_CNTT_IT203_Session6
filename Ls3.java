public class Ls3 {
    public static class Product {
        private String productId, productName;
        private double price;
        public Product(String productId, String productName, double price) {
            this.productId = productId;
            this.productName = productName;
            this.price = price;
        }
        public String getProductId() {
            return productId;
        }
        public String getProductName() {
            return productName;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            if(price > 0) this.price = price;
            else System.out.println("Giá bán không hợp lệ");
        }
        public void displayInfo() {
            System.out.println("Mã sản phẩm: " + productId);
            System.out.println("Tên sản phẩm: " + productName);
            System.out.println("Giá bán: " + price);
            System.out.println("-----------------------------");
        }
    }
    public static void main(String[] args) {
        Product p1 = new Product("SP01", "Laptop", 15000000);
        p1.displayInfo();
        p1.setPrice(10000000);
        p1.displayInfo();
    }
}