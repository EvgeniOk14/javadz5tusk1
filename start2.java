import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class start2 
{
    public static HashMap<String, ArrayList<String>> startP2(Map<String, ArrayList<String>> phoneBook) throws IOException
    { 
      inter.tablo2();
      int number = scanFile.scanOperation();
  
        while(number < 1 || number > 3)
          {
            System.out.println("Вы ввели не верный номер операции!\n Введите его снова!");
            inter.tablo2();
            number = scan.operationNumber();
          }
      
        switch (number)
        {
        case 1: 
          data.fillData(phoneBook);
          return startP2(phoneBook);
        
        case 2:
          addData.dataAdd(phoneBook);
          return startP2(phoneBook); 
        
        case 3:
          System.out.println("Вы вышли из программы!");
          break;
          
        default : 
          break;
        }
        return null;  
    
    }        
}
