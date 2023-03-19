import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class extradata 
{
    public static HashMap <String, ArrayList<String>> exData(Map<String, ArrayList<String>> phoneBook, String family)
    {
        ArrayList<Integer> AL = new ArrayList<>();
        String extrafone = scanFile.scanFone();

        AL.add(extrafone);
        phoneBook.put(family, AL); 
        printFile.loop(phoneBook); 
        return (HashMap<String, ArrayList<String>>)phoneBook;
    }
}

