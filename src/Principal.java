import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String name;
        String surname;
        String contra;
        java.util.Date regi_date=new java.util.Date();

        System.out.print("Welcome to the video management system, please create your user account: \n");

        Scanner user_input = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        name = user_input.nextLine();

        System.out.print("Please, enter your surname: ");
        surname = user_input.nextLine();

        System.out.print("Please, enter your password: ");
        contra = user_input.nextLine();

        // I create the user in the system
        Usuari usuaria = new Usuari(name, surname, contra, regi_date);

        System.out.print("Hello " + usuaria.getName() + " " + usuaria.getSurname() + " you " +
                "created your accounnt on " + usuaria.getRegi_date() + "\n");

        ArrayList<Video> llista_v = new ArrayList<>();
        ArrayList<String> tags = new ArrayList<String>();
        int choice = 1 ;
        String url = null;
        String title = null;
        String linea_etiquetas = null;

        while (choice > 0){
            System.out.print("Please select an option: \n" + "[1] for adding a new video \n" +
                    "[2] for a list of your current videos \n" + "[0] for exit \n" );
            try {
                choice = Integer.parseInt(user_input.nextLine().trim()) ;
            } catch (NumberFormatException exception) {
                System.out.print("ERROR debe pulsar 0, 1 o 2");
                break;}

            //choice = Integer.parseInt(user_input.nextLine().trim()) ;
            if (choice==1){
                //System.out.print("you pressed 1");
                System.out.print("Please, the video URL: ");
                url = user_input.nextLine();
                if(url.isEmpty()){
                    throw new StringIndexOutOfBoundsException("This field cannot be empty");}
                System.out.print("Please, the video title: ");
                title = user_input.nextLine();
                if(title.isEmpty()){
                    throw new StringIndexOutOfBoundsException("This field cannot be empty");}
                System.out.print("Please, enter the tags for the video separated by spaces: ");
                linea_etiquetas = user_input.nextLine();
                if(linea_etiquetas.isEmpty()){
                    throw new StringIndexOutOfBoundsException("This field cannot be empty");}
                String[] etiquetas = linea_etiquetas.split(" ", -1);
                ArrayList<String> eti_lista = new ArrayList<String>();
                for (int i=0; i < etiquetas.length-1; i++){
                    eti_lista.add(etiquetas[i]);
                }
                tags = eti_lista;
                llista_v.add( new Video (url,title, tags));
            } else {
                System.out.print("This are the videos on your list: \n ");
                for (Video v : usuaria.getLlista_v()){
                    System.out.println("URL of the video: " + v.getUrl());
                    System.out.println("Title of the video: " + v.getTitle());
                    System.out.println("Tags of the video: " + v.getTags() + "\n");
                }
                //System.out.print("you pressed other thing");
            }
            usuaria.setLlista_v(llista_v);
        }

    }
}
