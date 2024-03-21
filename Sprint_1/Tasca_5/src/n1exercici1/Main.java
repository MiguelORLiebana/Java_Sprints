package n1exercici1;

public class Main {
    public static void main(String[] args) {

        //String directory = "C:"+ File.separator+"Users"+File.separator+"hp"+File.separator+"Desktop"+File.separator+"git_JavaSprint"+File.separator+"Java_Sprints";
        //String directory = System.getProperty("user.dir");
        String directory = args[0];
        Llista llista = new Llista();

        try{
            llista.llistarContingut(directory);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.printf(e.getMessage());
        }
    }
}
