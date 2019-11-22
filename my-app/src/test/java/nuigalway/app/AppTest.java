package nuigalway.app;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.joda.time.DateTime;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void usernameTest()
    {
    		String[] mod = {"Maths", "Chemistry"};
        Students student = new Students("Anna", "21","29-06-1998", "12568", "4BCT",mod);
        String expected = "Anna21";
        assertEquals(expected, student.getUsername());
        
    }
    @Test
    public void testDOB() {
        String[] modules = {"Maths", "Chemistry"};
        Students s = new Students("Anna", "21","29-06-1998", "12568", "4BCT",modules);
        String dob = "29-06-1998";
        assertEquals(dob, s.getDob());
    	
    }
    @Test
    public void startTime()
    {
        String[] stud = {"Anna","David"};
        String[] mod = {"CT454","CT789"};
        DateTime dt = new DateTime();
        DateTime end = dt.plusYears(4);
        Course cr = new Course("CT",stud,mod,dt,end);
        
        DateTime exp = new DateTime(2019,11,22,16,10);
        String st = exp.toString("yyyy-MMM-dd HH");
        assertEquals(st, cr.getStart().toString("yyyy-MMM-dd HH"));
    
    @Test
    public void endTime() {
    		String[] studL = {"Anna","David"};
		String[] modL = {"CT454","CT789"};
		DateTime dateT = new DateTime();
		DateTime endT = dateT.plusYears(4);
		Course course2 = new Course("CT",studL,modL,dateT,endT);
		
		DateTime endExp = new DateTime(2023,11,22,16,10);
		String str = endExp.toString("yyyy-MMM-dd HH");
		assertEquals(str, course2.getEnd().toString("yyyy-MMM-dd HH"));
    }
    @Test
    public void testStudentList() {
    		String[] list = {"Anna Fahy","David Connelly", "Roisin Burke", "John Doe"};
    		String[] course = {"CS","IT","ENG","SC"};
    		Module mod = new Module("Programming", list, "CT456", course);
    		
    		String[] shouldBe = {"Anna Fahy","David Connelly", "Roisin Burke", "John Doe"};
    		
    		assertArrayEquals(shouldBe, mod.getStudentList());
    }
    @Test
	public void testCourseList() {
		String[] slist = {"Anna Fahy","David Connelly", "Roisin Burke", "John Doe"};
		String[] courseL = {"CS","IT","ENG","SC"};
		Module modNew = new Module("Programming", slist, "CT456", courseL);
		
		String[] want = {"CS","IT","ENG","SC"};
		
		assertArrayEquals(want, modNew.getModCourses());
	}
}