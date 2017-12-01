import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {
	ArrayList<Student> studentList = new ArrayList <Student>();
	Classroom c = new Classroom("KVALIT17", "FALL 2017", studentList);

	@Test
	public void testGetAndSetClassroomName() {
		c.setClassroomName("KVALITET17");
		assertEquals(c.getClassroomName(), "KVALITET17");
		
	}
	@Test
	public void testAndSetClassRoomTerm() {
		c.setClassroomTerm("Summer 2017");
		assertEquals(c.getClassroomTerm(), "Summer 2017");
		
	}
	@Test
	public void testGetAndSetStudents() {
		ArrayList<Student> temp = new ArrayList<Student>();
		Student s = new Student("Christian", "Hall", 33, 'M');
		temp.add(s);
		
		c.setStudents(temp);
		assertEquals(c.getStudents(), temp);
		
	}
	@Test
	public void testAddANewStudent() {
		Student s = new Student("Christian2", "Hall2", 33, 'M');
		
		ArrayList<Student> temp = new ArrayList<Student>();
		temp.add(s);
		
		c.addANewStudent(s);
		assertEquals(c.getStudents(), temp);
		
	}
	@Test
	public void testPrintFullRelatory() {
		Student s = new Student("Christian2", "Hall2", 33, 'M');
		c.addANewStudent(s);
		c.printFullRelatory();
		
	}
	@Test
	public void testRemoveAStudent() {
		Student s = new Student("Christian2", "Hall2", 33, 'M');
		c.addANewStudent(s);
		
		c.removeAStudent("Student non-existent");
		c.removeAStudent("Christian2");
	}

}
