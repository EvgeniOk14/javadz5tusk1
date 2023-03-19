import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class addData 
{
    public static HashMap<String, ArrayList<String>> dataAdd(Map<String, ArrayList<String>> phoneBook)
    {
        String family = scanFile.scanFamily();
                if(phoneBook.containsKey(family))
                    {
                        String extrafone = scanFile.scanExtraFone();
                        phoneBook.get(family).add(extrafone);
                        printFile.loop(phoneBook); 
                        return (HashMap<String, ArrayList<String>>)phoneBook;
                    }
                     else 
                    {
                        return extradata.exData(phoneBook,family);
                    }
    }            
}




