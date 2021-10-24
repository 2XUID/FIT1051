import java.util.ArrayList;

public class UniversityOnline extends University{
    private ArrayList<Enrollment> enrollmentsOnline;

    //constructor
    public UniversityOnline(String uniVersityName,int worldRank){
        super(uniVersityName,worldRank);
        enrollmentsOnline=new ArrayList<>();
    }

    public boolean addEnrollment (String studentName, String facultyName){
        boolean retVal=false;
        int index=facultyName.indexOf('-');
        if (index==-1){
            super.addEnrollment(studentName,facultyName);
        }
        else{
            if (facultyName.substring(index).equals("-online")){
                String finalFaculty=facultyName.substring(0,index);
                if (isStudentExist(studentName)!=null && isFacultyExist(finalFaculty)!=null){
                        Enrollment newEnrol=new Enrollment(isStudentExist(studentName),isFacultyExist(finalFaculty));
                        enrollmentsOnline.add(newEnrol);
                        retVal=true;
                    }
                }

            }
        return retVal;
    }

    public int countStudentsPerFaculty(String targetFaculty){
        int count=0;
        int oncampusCount=super.countStudentsPerFaculty(targetFaculty);
        int onlineCount= 0;
        for (int i = 0; i < enrollmentsOnline.size(); i++) {
            Enrollment evaluateEnrollment = enrollmentsOnline.get(i);
            Faculty evaluateFaculty = evaluateEnrollment.getFaculty();
            String evaluateFacultyName = evaluateFaculty.getFacultyName();
            if (evaluateFacultyName.equalsIgnoreCase(targetFaculty)) {
                onlineCount += 1;
            }
        }
        count=oncampusCount+onlineCount;
        return count;
    }

    @Override
    public String toString() {
        return "UniversityOnline{" +
                "enrollmentsOnline=" + enrollmentsOnline +
                '}';
    }
}
