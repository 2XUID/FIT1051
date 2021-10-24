public class Faculty {
    //instance variable
    private String facultyName;

    //constructor
    public Faculty(String initFacultyName){
        setFacultyName(initFacultyName);
    }

    //getter
    public String getFacultyName(){
        return facultyName;
    }

    //setter
    public boolean setFacultyName(String newFacultyName) {
        boolean retVal = false;
        if (newFacultyName.length() >= 3) {
            facultyName = newFacultyName;
            retVal = true;
        } else {
            retVal = false;
        }
        return retVal;
    }

    //toString
    public String toString(){
        String retVal="";
        retVal+="Faculty{facultyName='"+ facultyName+"'}";
        return retVal;
    }
}


