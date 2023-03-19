import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class printFile 
{
    
    public static HashMap<String, ArrayList<String>> loop(Map<String, ArrayList<String>> phoneBook)
    {
        for(var item : phoneBook.entrySet())
            {
                System.out.printf("%s: %s\n", item.getKey(), item.getValue());
            }
        return (HashMap<String, ArrayList<String>>) phoneBook;
    }
}
