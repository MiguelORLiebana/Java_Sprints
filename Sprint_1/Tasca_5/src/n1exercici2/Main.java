package n1exercici2;

public class Main {
    public static void main(String[] args) {

        //String directory = "C:"+ File.separator+"Users"+File.separator+"hp"+File.separator+"Desktop"+File.separator+"git_JavaSprint"+File.separator+"Java_Sprints";
        String directory = System.getProperty("user.dir");
        Llista directoris = new Llista();

        try{
            directoris.llistarContingutDiretoriesAndFolders(directory);
            //directoris.llistarContingutDirectoris(directory);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.printf(e.getMessage());
        }
    }
}
