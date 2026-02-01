import java.util.regex.Pattern;

public class Ls6 {
    public static class User {
        private String id, username, password, email;
        private static final Pattern email_pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

        public User(String id, String username, String password, String email) {
            this.id = id;
            this.username = username;
            setPassword(password);
            setEmail(email);
        }

        public String getId() {
            return id;
        }
        public String getUsername() {
            return username;
        }
        public String getEmail() {
            return email;
        }

        public void setPassword(String password) {
            if(password == null || password.trim().isEmpty()) {
                System.out.println("Mật khẩu không hợp lệ!");
                System.out.println("-----------------------------");
                return;
            } this.password = password;
        }
        public void setEmail(String email) {
            if(email == null || !email_pattern.matcher(email).matches()){
                System.out.println("Email không hợp lệ!");
                System.out.println("-----------------------------");
                return;
            } this.email = email;
        }
        public void displayInfo() {
            System.out.println("Mã người dùng: " + id);
            System.out.println("Tên đăng nhập: " + username);
            System.out.println("Mật khẩu: " + password);
            System.out.println("Email: " + email);
            System.out.println("-----------------------------");
        }
    }
    public static void main(String[] args) {
        User user1 = new User("U01", "user_one", "password123", "user_one@example.com");
        user1.displayInfo();
        user1.setEmail("invalid-email");
        user1.setPassword("");
        user1.displayInfo();
    }
}