package advprog3;

public class Cat extends Pet implements Strokeable {

	public Cat(String name, int age, double cost)
	{
		setName(name);
		setAge(age);
		setCost(cost);
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println(getName() + ": Nya!" );
	}
	
	@Override
	public void stroke()
	{
		System.out.println(getName() + " wanders off and ignores you.");
	}
	
}
