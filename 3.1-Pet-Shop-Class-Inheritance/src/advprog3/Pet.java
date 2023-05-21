package advprog3;

abstract class Pet {
	
	private String name;
	private int age;
	private double cost;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}

	public double getCost()
	{
		return cost;
	}
	
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public void makeNoise()
	{
		System.out.println(name + " doesn't make any noise.");
	}
	
	
}
