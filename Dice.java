
public class Dice implements Interface {
	
	private int history [] = new int [5];
	private int counter = 0;

	public int Throw() {

		return (1 + (int) (Math.random() * 6));

	}
	
	public void setHistory (int num)
	{
		history [counter] = num;
		counter++;
	}
	public int getHistory (int num)
	{
		return history[num];
	}
	
	@Override
	public String toString()
	{
		return String.format("%d", Throw());
	}
	
	@Override
	public int getRandomNumber()
	{
		return Throw();
	}
}
