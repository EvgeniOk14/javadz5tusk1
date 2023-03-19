import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class start1
{
      public static HashMap<String, ArrayList<String>> startP1() throws IOException
      { 
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();
        inter.tablo1();
        int number = scanFile.scanOperation();

          while(number != 1 )
          {
            System.out.println("Вы ввели не верный номер операции!\n Введите его снова!");
            inter.tablo1();
            number = scan.operationNumber();
          }
    
      switch (number)
      {
        case 1: 
              data.fillData(phoneBook);
              return start2.startP2(phoneBook);
       
        
        default : 
              break;
      }
      return start2.startP2(phoneBook);  
  
  }    
}
