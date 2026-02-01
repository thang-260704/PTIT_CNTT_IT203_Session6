import java.util.Scanner;

public class BaiTapThucHanh {

    static class BankAccount {
        private String soTaiKhoan;
        private String tenChuTaiKhoan;
        private double soDu;

        public BankAccount() {
            this.soTaiKhoan = "000000";
            this.tenChuTaiKhoan = "Chưa đặt tên";
            this.soDu = 0.0;
        }

        public BankAccount(String soTaiKhoan, String tenChuTaiKhoan, double soDu) {
            this.soTaiKhoan = soTaiKhoan;
            this.tenChuTaiKhoan = tenChuTaiKhoan;
            setSoDu(soDu);
        }

        public String getSoTaiKhoan() {
            return soTaiKhoan;
        }

        public void setSoTaiKhoan(String soTaiKhoan) {
            if (soTaiKhoan != null && !soTaiKhoan.isEmpty()) {
                this.soTaiKhoan = soTaiKhoan;
            } else {
                System.out.println("Số tài khoản không hợp lệ!");
            }
        }

        public String getTenChuTaiKhoan() {
            return tenChuTaiKhoan;
        }

        public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
            if (tenChuTaiKhoan != null && !tenChuTaiKhoan.isEmpty()) {
                this.tenChuTaiKhoan = tenChuTaiKhoan;
            } else {
                System.out.println("Tên chủ tài khoản không hợp lệ!");
            }
        }

        public double getSoDu() {
            return soDu;
        }

        public void setSoDu(double soDu) {
            if (soDu >= 0) {
                this.soDu = soDu;
            } else {
                System.out.println("Số dư không thể âm!");
            }
        }

        public void napTien(double soTien) {
            if (soTien > 0) {
                this.soDu += soTien;
                System.out.println("Nạp " + soTien + " VND thành công!");
                System.out.println("Số dư hiện tại: " + this.soDu + " VND");
            } else {
                System.out.println("Số tiền nạp phải lớn hơn 0!");
            }
        }

        public void rutTien(double soTien) {
            if (soTien <= 0) {
                System.out.println("Số tiền rút phải lớn hơn 0!");
            } else if (soTien > this.soDu) {
                System.out.println("Số dư không đủ để rút!");
                System.out.println("Số dư hiện tại: " + this.soDu + " VND");
            } else {
                this.soDu -= soTien;
                System.out.println("Rút " + soTien + " VND thành công!");
                System.out.println("Số dư hiện tại: " + this.soDu + " VND");
            }
        }

        public void hienThiThongTin() {
            System.out.println("================================");
            System.out.println("  THÔNG TIN TÀI KHOẢN");
            System.out.println("================================");
            System.out.println("  Số tài khoản  : " + soTaiKhoan);
            System.out.println("  Chủ tài khoản : " + tenChuTaiKhoan);
            System.out.println("  Số dư         : " + soDu + " VND");
            System.out.println("================================");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n===== HỆ THỐNG QUẢN LÝ TÀI KHOẢN NGÂN HÀNG =====\n");

        BankAccount taiKhoan1 = new BankAccount();
        taiKhoan1.setSoTaiKhoan("TK001");
        taiKhoan1.setTenChuTaiKhoan("Nguyễn Văn An");
        taiKhoan1.setSoDu(1000000);

        BankAccount taiKhoan2 = new BankAccount("TK002", "Trần Thị Bé", 5000000);

        System.out.println("--- Thông tin ban đầu ---\n");
        taiKhoan1.hienThiThongTin();
        System.out.println();
        taiKhoan2.hienThiThongTin();

        boolean tiepTuc = true;
        while (tiepTuc) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nạp tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Hiển thị thông tin");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int luaChon = Integer.parseInt(scanner.nextLine());

            if (luaChon == 4) {
                tiepTuc = false;
            } else if (luaChon >= 1 && luaChon <= 3) {
                System.out.println("\nChọn tài khoản:");
                System.out.println("1. " + taiKhoan1.getTenChuTaiKhoan() + " (" + taiKhoan1.getSoTaiKhoan() + ")");
                System.out.println("2. " + taiKhoan2.getTenChuTaiKhoan() + " (" + taiKhoan2.getSoTaiKhoan() + ")");
                System.out.print("Chọn tài khoản: ");
                int choiTK = Integer.parseInt(scanner.nextLine());

                BankAccount taiKhoanDuocChon;
                if (choiTK == 1) {
                    taiKhoanDuocChon = taiKhoan1;
                } else {
                    taiKhoanDuocChon = taiKhoan2;
                }

                if (luaChon == 1) {
                    System.out.print("Nhập số tiền nạp: ");
                    double soTien = Double.parseDouble(scanner.nextLine());
                    taiKhoanDuocChon.napTien(soTien);
                } else if (luaChon == 2) {
                    System.out.print("Nhập số tiền rút: ");
                    double soTien = Double.parseDouble(scanner.nextLine());
                    taiKhoanDuocChon.rutTien(soTien);
                } else {
                    taiKhoanDuocChon.hienThiThongTin();
                }
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
            }
        }

        System.out.println("\n--- Thông tin sau cùng ---\n");
        taiKhoan1.hienThiThongTin();
        System.out.println();
        taiKhoan2.hienThiThongTin();

        System.out.println("\nCảm ơn đã sử dụng hệ thống!");
        scanner.close();
    }
}