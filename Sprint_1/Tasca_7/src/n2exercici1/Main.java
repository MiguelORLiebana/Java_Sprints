package n2exercici1;

import com.google.gson.Gson;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String nameFilePath = System.getProperty("user.dir")+File.separator+"Tasca_7"+File.separator+"src"+File.separator+"n2exercici1"+File.separator+"Object.json";

        try(Writer writer = new FileWriter(nameFilePath)){
            //Object to JSON
            Gson gson = new Gson();
            gson.toJson(new Car("coche"), writer);
        }catch(IOException e){
            System.out.println("Error with the .json file");
        }

        try(Reader reader = new FileReader(nameFilePath)){
            //JSON to Object
            Gson gson = new Gson();
            Car car = gson.fromJson(reader, Car.class);
            System.out.println("Object from json: " + car.getName());
        }catch(IOException e){
            System.out.println("Error with the .json file");
        }
    }
}
