
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class FileJSON {
    public static void main(String[] args) throws IOException, ParseException{
     JSONParser parser = new JSONParser();
     
     try{
     Object obj = parser.parse(new FileReader("C:\\Users\\user\\Documents\\test.json"));
     JSONObject jsonObject = (JSONObject) obj;
     String name = (String) jsonObject.get("name");
     String age = (String) jsonObject.get("age");
     JSONArray quotes = (JSONArray) jsonObject.get("arrayblock");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     Iterator<String> iterator = quotes.iterator();
     while(iterator.hasNext()){
     System.out.println(iterator.next());
     }
     }catch(IOException e){
     }
     
    }
}
