import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {
	Student s = new Student("Christian", "Hall", 33, 'M');
	Student s2 = new Student("Gayathri", "Hall", 26, 'F', 3.7, 7.7, 7.7);

	@Test
	public void testSetAndGetFirstName() {
		s.setFirstName("Christian");
		assertEquals(s.getFirstName().equals("Christian"), true);
		
	}
	@Test
	public void testSetAndGetLastName() {
		s.setLastName("Hall");
		assertEquals(s.getLastName().equals("Hall"), true);
		
	}
	@Test
	public void testSetAndGetAge() {
		s.setAge(33);
		assertEquals(s.getAge()==33, true);
		
	}

}
