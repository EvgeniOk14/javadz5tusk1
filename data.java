import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class data 
{
    public static HashMap <String, ArrayList<String>> fillData(Map<String, ArrayList<String>> phoneBook)
    {
    String family = scanFile.scanFamily();
    ArrayList<String> AL = new ArrayList<>();
    String fone = scanFile.scanFone();
    AL.add(fone);
    phoneBook.put(family, AL); 
    printFile.loop(phoneBook); 
    return (HashMap<String, ArrayList<String>>)phoneBook;
    }
}
