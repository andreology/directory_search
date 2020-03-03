//Andre Barajas
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;
public class FileSearch
{
	private File[] children;

	public FileSearch(File startingDirectory)
	{
		children = startingDirectory.listFiles();
	}

	public void find(String extension)
	{
		for(File child : children)
		{
			String fileName = child.toString();
			if(child.isDirectory())
			{
				FileSearch finder = new FileSearch(child);
				finder.find(extension);
			}
			else if (fileName.endsWith(extension))
			{
				System.out.println(fileName);
			}
		}
	}
}
