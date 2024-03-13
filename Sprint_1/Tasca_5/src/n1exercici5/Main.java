package n1exercici5;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        ObjetoSerial a = new ObjetoSerial();
        String nameFile = System.getProperty("user.dir") + File.separator+"Tasca_5"+File.separator+"src"+File.separator+"n1exercici5"+File.separator+"Test.ser";
        System.out.println(nameFile);

        writeObject(a, nameFile);

        ObjetoSerial b = readObjectSer(nameFile);
        System.out.println(b.toString());
    }

    public static void writeObject(ObjetoSerial a, String name){
        try {
            System.out.println(name);
            FileOutputStream fos = new FileOutputStream(name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // write object to file
            oos.writeObject(name);
            System.out.println("Done");

            // closing resources
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ObjetoSerial readObjectSer(String name){
        try{
            System.out.println("EStamos aquí: " + name);
            FileInputStream is = new FileInputStream(name);
            ObjectInputStream ois = new ObjectInputStream(is);
            ObjetoSerial emp = (ObjetoSerial) ois.readObject();
            ois.close();
            is.close();

            return emp;

        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
