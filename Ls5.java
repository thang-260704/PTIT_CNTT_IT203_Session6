public class Ls5 {
    public static class Book {
        private String id, title, author;
        private double price;

        public Book(String id, String title, String author, double price) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void displayInfo() {
            System.out.println("Mã sách: " + id);
            System.out.println("Tiêu đề: " + title);
            System.out.println("Tác giả: " + author);
            System.out.println("Giá: " + price);
            System.out.println("-----------------------------");
        }
    }
    public static void main(String[] args) {
        Book book1 = new Book("B01", "Lập trình Java", "Nguyễn Văn A", 200000);
        book1.displayInfo();
    }
}