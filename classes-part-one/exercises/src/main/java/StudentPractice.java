public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student student = new Student("Tim Nicolas", 007, 1, 4.0);
        Teacher teacher = new Teacher("Albus","Dumbledore","magic", 103 );
        System.out.println(
                student.getName() +
                "'s id is " +
                student.getId() +
                ", has " +
                student.getNumOfCredits() +
                " credits, and has a GPA of " +
                student.getGpa() +
                "."
        );
        System.out.println(
                teacher.getFirstName() +
                " " +
                teacher.getLastName() +
                " has ran Hogwarts for " +
                teacher.getYearsTeaching() +
                " teaching " +
                teacher.getSubject() +
                " to students in the UK."
        );
    }
}
