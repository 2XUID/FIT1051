public class Student {
    //instance variables
    private String studentName;
    private int age;

    //constructor
    public Student (String initStudentName,int initAge){
        setStudentName(initStudentName);
        setAge(initAge);
    }


    //getter
    public String getStudentName(){
        return studentName;
    }

    public int getAge(){
        return age;
    }

    //setter
    public boolean setStudentName(String newStudentName){
        boolean retVal=false;
        if (newStudentName.length()>=2){
            studentName=newStudentName;
            retVal=true;
        }
        else{
            retVal=false;
        }
        return retVal;
    }

    public boolean setAge(int newAge){
        boolean retVal=false;
        if (newAge>=15 && newAge<=95){
            age=newAge;
            retVal=true;
        }
        else{
            retVal=false;
        }
        return retVal;
    }

    //toString
    public String toString(){
        String retVal="";
        retVal+="Student {studentName='"+studentName+"', age="+age+"}";
        return retVal;
    }
}
