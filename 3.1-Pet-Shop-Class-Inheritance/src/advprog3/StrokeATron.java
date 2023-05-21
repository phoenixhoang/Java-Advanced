package advprog3;

public class StrokeATron {

	public void strokeAll(Strokeable[] pet)
	{
		for (Strokeable var: pet)
		{
			if(var != null)
			{
				var.stroke();
			}
		}
	}
}
