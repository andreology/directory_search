//Andre Barajas
import java.io.File;
import java.io.FileNotFoundException;

public class tester
{

	public static void main(String args[]) throws FileNotFoundException
	{
		File startingDirectory = new File("softEngass/");
		FileSearch search = new FileSearch(startingDirectory);
		search.find(".docx");
	}


	}
