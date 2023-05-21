package advprog3;

import java.util.ArrayList;

public class Unit {
	
	private String title;
	private Lecturer lecturer;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Unit(String title, Lecturer lecturer)
	{
		this.title = title;
		this.lecturer = lecturer;
	}
	
	public void enrolStudent(Student s)
	{
		studentList.add(s);
	}
	
	public void removeStudent(Student s)
	{
		studentList.remove(s);
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public Lecturer getLecturer()
	{
		return lecturer;
	}
	
	public void setLecturer(Lecturer lecturer)
	{
		this.lecturer = lecturer;
	}
	
	public ArrayList<Student> getStudentList()
	{
		return studentList;
	}
	
}
