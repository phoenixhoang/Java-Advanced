package advprog1;

public class StudentResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnitMark caitlyn, lillia, candice, annie, ash;
		
		caitlyn = new UnitMark (25, 40);
		lillia = new UnitMark (45, 42);
		candice = new UnitMark (50, 70);
		annie = new UnitMark (50, 85);
		ash = new UnitMark (80, 75);
		
		caitlyn.Display();
		lillia.Display();
		candice.Display();
		annie.Display();
		ash.Display();
		
		Student student1;
		student1 = new Student ("Ash");
		student1.setMarks(ash);
		float results = student1.calculateOverallGrade();
		student1.Display();
	}

}
