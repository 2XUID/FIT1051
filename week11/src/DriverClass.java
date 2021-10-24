public class DriverClass {
    public static void main(String[] args) {
        UniversityOnline monashOnline=new UniversityOnline("Monash",20);
        monashOnline.addFaculty("FIT");
        monashOnline.addFaculty("Law");
        monashOnline.addFaculty("Business");
        monashOnline.addFaculty("La");//rejected
        System.out.println("Faculties="+monashOnline.getFaculties()); //test faculties OK
        monashOnline.addStudent("John",23);
        monashOnline.addStudent("John",98); // rejected
        monashOnline.addStudent("Tim",54);
        monashOnline.addStudent("Emma",19);
        monashOnline.addStudent("E",67); //rejected
        System.out.println("Students="+monashOnline.getStudents());
        monashOnline.addEnrollment("Michael","FIT"); //rejected, no such student
        monashOnline.addEnrollment("Tim","Art"); //rejected, no such faculty
        monashOnline.addEnrollment("Emma","FIT-online");
        monashOnline.addEnrollment("Emma","Law-online");
        monashOnline.addEnrollment("Tim","Law");
        monashOnline.addEnrollment("Tim","Business-online");
        int studentsInFIT=monashOnline.countStudentsPerFaculty("FIT");
        int studentsInLaw=monashOnline.countStudentsPerFaculty("Law");
        int studentsInBusiness=monashOnline.countStudentsPerFaculty("Business");
        System.out.println("Number of students in FIT ="+studentsInFIT);
        System.out.println("Number of students in Law ="+studentsInLaw);
        System.out.println("Number of students in Business ="+studentsInBusiness);
    }
}