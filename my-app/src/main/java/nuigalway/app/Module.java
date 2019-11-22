package nuigalway.app;

public class Module 
{
    String mName;
    String[] studentList;
    String mId;
    String[] modCourses;
    
    public Module(String mName, String[] studentList, String mId, String[] modCourses){
        this.mName = mName;
        this.studentList = studentList;
        this.mId = mId;
        this.modCourses = modCourses;
    }
    
    public String getModName(){
        return mName;
    }
    public String[] getModCourses(){
        return modCourses;
    }
   
    public String getModId(){
        return mId;
    }
     public String[] getStudentList(){
        return studentList;
    }
   
    public void setModName(String modN){
       this.mName = modN;
    }
    public void setModId(String modId){
       this.mId = modId;
    }
   
    public void setModCourses(String[] mCourses){
       this.modCourses = mCourses;
    }
     public void setStudentList(String[] sList){
       this.studentList = sList;
    }
}
