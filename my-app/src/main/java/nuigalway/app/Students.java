package nuigalway.app;

public class Students 
{
    String name;
    String age;
    String dob;
    String id;
    String username;
    String courses;
    String[] module;
    
    public Students(String name, String age, String dob, String id,String courses, String[] module){
        this.name = name;
        this.age= age;
        this.dob = dob;
        this.id = id;
        this.courses = courses;
        this.module = module;
    }
    
    public String getName(){
        return name;
    }
    public String[] getModule(){
        return module;
    }
    public String getAge(){
        return age;
    }
    public String getDob(){
        return dob;
    }
    public String getId(){
        return id;
    }
    public String getUsername(){
        String na = name;
        String ag = age;
        String both = name.concat(age);
        return both;
    }
    public String getCourses(){
        return courses;
    }
    public void setName(String n){
       this.name = n;
    }
    public void setAge(String a){
       this.age = a;
    }
    public void setDob(String dateOfBirth){
       this.dob = dateOfBirth;
    }
    public void setId(String id){
       this.id = id;
    }
   
    public void setCourses(String c){
       this.courses = c;
    }
    public void setModule(String[] mod){
       this.module = mod;
    }
}
