package nuigalway.app;

import org.joda.time.DateTime;

public class Course 
{
    String cName;
    String studentL;
    DateTime start;
    DateTime end;
    String modList;
    
    public Student(String cName, String studentL, String modList, DateTime start, DateTime end){
        this.cName = cName;
        this.studentL = studentL;
        this.modList = modList;
        this.start = start;
        this.end = end;
    }
    
    public String getCorName(){
        return cName;
    }
    
     public String getStudentL(){
        return studentL;
    }
     public String getModList(){
        return modList;
    }
   
    public void setCorName(String corN){
       this.cName = corN;
    }
    public void setStudentL(String studL){
       this.studentL = studL;
    }
   
    public void setModList(String modL){
       this.modList = modL;
    }
     public void setStudentList(String sList){
       this.studentList = sList;
    }
}
