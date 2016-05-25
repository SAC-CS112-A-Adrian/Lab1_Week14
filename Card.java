
public class Card implements Interface {
	
	private int history [] = new int [5];
	private int counter = 0;

	public int Pick() {

		return (1 + (int) (Math.random() * 10));

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
		return String.format("%d", Pick());
	}
	
	@Override
	public int getRandomNumber()
	{
		return Pick();
	}
}
