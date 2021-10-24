import java.util.ArrayList;

public class University {
    //5 instance variables
    private String universityName;
    private int worldRank;
    private ArrayList<Faculty> faculties;
    private ArrayList<Student> students;
    private ArrayList<Enrollment> enrollments;


    //getters
    public String getUniversityName(){
        return universityName;
    }
    public int getWorldRank(){
        return worldRank;
    }
    public ArrayList<Faculty> getFaculties(){
        return faculties;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public ArrayList<Enrollment>getEnrollments(){
        return enrollments;
    }

    //setters
    public boolean setUniversityName(String newUniversityName){
        boolean retVal=false;
        if (newUniversityName.length()>=3){
            universityName=newUniversityName;
            retVal=true;
        }
        else{
            retVal=false;
        }
        return retVal;
    }

    public boolean setWorldRank(int newWorldRank){
        boolean retVal=false;
        if (newWorldRank>0){
            worldRank=newWorldRank;
            retVal=true;
        }
        else{
            retVal=false;
        }
        return retVal;
    }


    //constructors
    public University(String initUniversityName, int initWorldRank){
        setUniversityName(initUniversityName);
        setWorldRank(initWorldRank);
        faculties=new ArrayList<>();
        students=new ArrayList<>();
        enrollments=new ArrayList<>();
    }




    //toString
    public String toString(){
        String retVal="";
        retVal+="University name: "+universityName+"\n";
        retVal+="World rank: "+worldRank+"\n";
        retVal+="Faculties: "+faculties+"\n";
        retVal+="Students: "+students+"\n";
        retVal+="Enrollment: "+enrollments+"\n";
        return retVal;
    }


    //addStudents()
    public boolean addStudent(String studentName,int age){
        boolean retVal=false;
        if (isStudentValid(studentName,age) && isStudentExist(studentName)==null){
            retVal=true;
            Student newValidStudent=new Student(studentName,age);
            students.add(newValidStudent);
        }
        return retVal;
    }


    //addFaculty()
    public boolean addFaculty(String facultyName){
        boolean retVal=false;
        if(isFacultyValid(facultyName) && isFacultyExist(facultyName)==null) {
            retVal = true;
            Faculty newValidFaculty = new Faculty(facultyName);
            faculties.add(newValidFaculty);
        }
        return retVal;
    }

    //addEnrollment()
    public boolean addEnrollment(String studentName,String facultyName){
        boolean retVal=false;

        if (isStudentExist(studentName)!=null && isFacultyExist(facultyName)!=null){
            Enrollment newEnrol=new Enrollment(isStudentExist(studentName),isFacultyExist(facultyName));
            enrollments.add(newEnrol);
            retVal=true;
        }
        else{
            System.out.println("Error:Student or Faculty cannot be found");
        }

        return retVal;
    }


    //countStudentsPerFaculty
    public int countStudentsPerFaculty(String targetFaculty) {
        int count = 0;
        for (int i = 0; i < enrollments.size(); i++) {
            Enrollment evaluateEnrollment = enrollments.get(i);
            Faculty evaluateFaculty = evaluateEnrollment.getFaculty();
            String evaluateFacultyName = evaluateFaculty.getFacultyName();
            if (evaluateFacultyName.equals(targetFaculty)) {
                count += 1;
            }
        }
        return count;
    }

    //boolean methods
    public boolean isFacultyValid(String facultyName){
        return facultyName.length()>=3;
    }

    public boolean isStudentValid(String studentName, int age){
        return (studentName.length()>=2 && age>=15 && age<=95);
    }

    //Faculty & Student exist method
    public Faculty isFacultyExist(String facultyName){
        int i=0;
        boolean found=false;
        Faculty faculty=null;
        while (i<faculties.size()&&!found){
            if (faculties.get(i).getFacultyName().equalsIgnoreCase(facultyName)){
                found=true;
                faculty=faculties.get(i);
            }
            i++;
        }
        return faculty;
    }

    public Student isStudentExist(String studentName){
        int i=0;
        boolean found=false;
        Student student=null;
        while (i<students.size()&&!found){
            if (students.get(i).getStudentName().equalsIgnoreCase(studentName)){ //if the same-->already exist
                found=true;
                student=students.get(i);
            }
            i++;
        }
        return student;
    }
}
