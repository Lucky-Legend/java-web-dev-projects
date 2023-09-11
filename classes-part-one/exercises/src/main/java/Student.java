public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        private void setName(String name) {
                this.name = name;
        }
        private void setId(int studentId) {
                this.studentId = studentId;
        }
        private void setNumOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }
        private void setGpa(double gpa) {
                this.gpa = gpa;
        }
        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }
        public String getName() {
                return name;
        }
        public int getId() {
                return studentId;
        }
        public int getNumOfCredits() {
                return numberOfCredits;
        }
        public double getGpa() {
                return gpa;
        }
        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
