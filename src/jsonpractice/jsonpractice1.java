/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonpractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author user
 */
public class jsonpractice1 {
    public static void main(String[] args) throws IOException, ParseException{
    JSONParser parser = new JSONParser();
    try{
    Object obj = parser.parse(new FileReader("C:\\Users\\user\\Documents\\CountryJSONFile.json"));
    JSONObject jsonobject = (JSONObject) obj;
    
    String nameOfCountry = (String) jsonobject.get("Name");
    System.out.println("Name of the Country: " + nameOfCountry );
    
    long population = (long) jsonobject.get("Population");
    System.out.println("Population of the country is : " + population );
    
    System.out.println("States are: ");
    JSONArray listOfStates = (JSONArray) jsonobject.get("states");
    
    Iterator<String> iterator = listOfStates.iterator();
    while (iterator.hasNext()){
    System.out.println(iterator.next());
    }
    }catch (FileNotFoundException e){
    }catch (IOException e) {  
    }catch (ParseException e) {  
  }  
    
  } 
}
