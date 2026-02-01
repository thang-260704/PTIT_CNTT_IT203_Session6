public class Ls1 {
    public static class Student {
        private String studentId;
        private String studentName;
        private int birthYear;
        private double avgScore;

        public Student(String studentId, String studentName, int birthYear, double avgScore) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.birthYear = birthYear;
            this.avgScore = avgScore;
        }

        public void displayInfo() {
            System.out.println("Mã sinh viên: " + studentId);
            System.out.println("Tên sinh viên: " + studentName);
            System.out.println("Năm sinh: " + birthYear);
            System.out.println("Điểm trung bình: " + avgScore);
            System.out.println("------------------------");
        }
    }
    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyễn Văn A", 2003, 8.5);
        Student sv2 = new Student("SV002", "Nguyễn Văn B", 2005, 8.6);

        sv1.displayInfo();
        sv2.displayInfo();
    }
}