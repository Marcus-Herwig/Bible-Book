public class Assignment2
{
	public static void main(String[] args)
	{
		BibleBook Mathew = new BibleBook("Matthew", 28, "The gospel of Jesus Christ" );
		BibleBook Genesis = new BibleBook("Genesis", 50, "The story of creation and the beginning of human kind");
		BibleBook Revelation = new BibleBook("Revelation", 22, "The prophesies of our world");
		Mathew.display();
		Genesis.display();
		Revelation.display();
	}
}