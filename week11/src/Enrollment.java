public class Enrollment {
    //instance variables
    private Student student;
    private Faculty faculty;

    //constructor
    public Enrollment(Student initStudent, Faculty initFaculty) {
       student=initStudent;
       faculty=initFaculty;
    }

    //getter
    public Student getStudent(){
        return student;
    }
    public Faculty getFaculty(){
        return faculty;
    }

    //toString
    public String toString(){
        String retVal="";
        retVal+="Student: "+student;
        retVal+="Faculty: "+faculty;
        return retVal;
    }
}
