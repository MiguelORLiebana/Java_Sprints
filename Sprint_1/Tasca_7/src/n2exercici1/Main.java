package n2exercici1;

import com.google.gson.Gson;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //https://www.baeldung.com/java-custom-annotation

        String Path = System.getProperty("user.dir")+File.separator+"Tasca_7"+File.separator+"src"+File.separator+"n2exercici1"+File.separator;

        Car car = new Car("coche");

        JsonSerializable a = car.getClass().getAnnotation(JsonSerializable.class);
        String directory = a.file();
        String PathDirectory = Path + directory;

        try(Writer writer = new FileWriter(PathDirectory)){
            //Object to JSON
            Gson gson = new Gson();
            gson.toJson(car, writer);
        }catch(IOException e){
            System.out.println("Error with the .json file");
        }

        try(Reader reader = new FileReader(PathDirectory)){
            //JSON to Object
            Gson gson = new Gson();
            Car carFromJson = gson.fromJson(reader, Car.class);
            System.out.println("Object from json: " + carFromJson.getName());
        }catch(IOException e){
            System.out.println("Error with the .json file");
        }
    }
}
