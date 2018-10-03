import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamProgram 
{
	
		public static void main(String[] args) throws IOException 
		{
			//Reading the File and storing it in Steam of type String
			Stream<String> rows=Files.lines(Paths.get("C:/Users/ASHISH/Desktop/JAVA Assignments/Data.txt"));
			
			//Use the Collectors utility interface to collect the single row as a list
			List<String> list = rows.collect(Collectors.toList());
			
			//pass the single record as a string and filter based on user requirement
			list.forEach(new Consumer<String>() 
			{
				int i = 0;
				@Override
				public void accept(String t) 
				{
					
					if(i!=0) 
					{
						//filtering using the if statement
						if(Integer.parseInt(t.split(",")[2])>25)
						{
							System.out.println(t);
						}
						
					}
					i=i+1;
				}
				
			});
			//Once the opertion is done close the file or the steam.
			rows.close();
		}

}
