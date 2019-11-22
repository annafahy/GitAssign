package nuigalway.app;

import org.joda.time.DateTime;

public class Course 
{
    String cName;
    String[] studentL;
    DateTime start = new DateTime();
    DateTime end;
    String[] modList;
    
    public Course(String cName, String[] studentL, String[] modList, DateTime start, DateTime end){
        this.cName = cName;
        this.studentL = studentL;
        this.modList = modList;
        this.start = start;
        this.end = end;
    }
    public DateTime getStart() {
    		return start;
    }
    public DateTime getEnd() {
    	return end;
    }
    
    public String getCorName(){
        return cName;
    }
    
     public String[] getStudentL(){
        return studentL;
    }
     public String[] getModList(){
        return modList;
    }
   
    public void setCorName(String corN){
       this.cName = corN;
    }
   
    public void setModList(String[] modL){
       this.modList = modL;
    }
     public void setStudentList(String[] sList){
       this.studentL = sList;
    }
     public void setStart(DateTime s) {
    	 this.start=s;
     }
     public void setEnd(DateTime e) {
    	 this.end=e;
     }
}
