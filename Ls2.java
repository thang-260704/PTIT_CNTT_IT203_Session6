public class Ls2 {
    public static class Account {
        private String username;
        private String password;
        private String email;

        public Account(String username, String password, String email) {
            this.username = username;
            this.password = password;
            this.email = email;
        }

        public void changePassword(String newPassword) {
            this.password = newPassword;
            System.out.println("Đổi mật khẩu thành công");
        }
        public void displayInfo() {
            System.out.println("Tên đăng nhập: " + username);
            System.out.println("Email: " + email);
            System.out.println("Mật khẩu: " + password);
            System.out.println("-----------------------------");
        }
    }
    public static void main(String[] args) {
        Account acc1 = new Account("nva", "Nguyễn Văn A", "123456");
        Account acc2 = new Account("nvb", "Nguyễn Văn B", "654321");
        acc1.displayInfo();
        acc2.displayInfo();
        acc1.changePassword("abcdef");
        acc1.displayInfo();
    }
}