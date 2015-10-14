/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonpractice;
import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  
  
import org.json.simple.JSONArray;  
import org.json.simple.JSONObject;  
  

public class Jsonpractice {


    public static void main(String[] args) throws IOException {
        JSONObject countryObj = new JSONObject();
        countryObj.put("Name", "India");
        countryObj.put("Population", 1000000);
        
        JSONArray listOfStates = new JSONArray();
        listOfStates.add("Madhya Pradesh");
        listOfStates.add("Maharastra");
        listOfStates.add("Tamil Nadu");
        
        countryObj.put("States", listOfStates);
        
        try {
        File file = new File("C:\\Users\\user\\Documents\\CountryJSONFile.json");
        file.createNewFile();
            try (FileWriter fileWriter = new FileWriter(file)) {
                System.out.println("Writing JSON OBJECT to file");
                System.out.println("-----------------------------");
                System.out.println(countryObj);
                
                fileWriter.write(countryObj.toJSONString());
                fileWriter.flush();
            }catch(IOException e){
            }
                
        }catch(IOException e){
        }
    }
    
}
