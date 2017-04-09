package ohtu;

import ohtu.Submission;
import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // vaihda oma opiskelijanumerosi seuraavaan, ÄLÄ kuitenkaan laita githubiin omaa opiskelijanumeroasi
        String studentNr = "011188335";
        if (args.length > 0) {
            studentNr = args[0];
        }

        String kurssiURL = "https://ohtustats2017.herokuapp.com/courses/1.json";
        String kurssiJSON = Request.Get(kurssiURL).execute().returnContent().asString();
        
        Gson kurssiMapper = new Gson();
        Course c = kurssiMapper.fromJson(kurssiJSON, Course.class);

        String studentURL = "http://ohtustats2017.herokuapp.com/students/" + studentNr + "/submissions";
        String studentJSON = Request.Get(studentURL).execute().returnContent().asString();
        
        Gson studentMapper = new Gson();
        Submission[] subs = studentMapper.fromJson(studentJSON, Submission[].class);
        
        System.out.println("Kurssi: " + c.getName() + " " + c.getTerm() + "\n");
        System.out.println("Opiskelijanumero:" + studentNr + "\n");
        
        int tehtavat = 0;
        int tunnit = 0;
        for (Submission submission : subs) {
            String t = submission.getTasks();
            System.out.println("Viikko " + submission.get_week() + ": tehtyjä tehtäviä yhteensä: " + submission.getTasksDone() + " (maksimi " + submission.getTotalTasks() +") " + "aikaa kului " + submission.get_hours() + " tuntia, tehdyt tehtävät: " + submission.getTasks());
            tehtavat += submission.getTasksDone();
            tunnit += submission.get_hours();
        }
        
        System.out.println("yhteensä: " + tehtavat + " tehtävää " + tunnit + " tuntia");

    }
}
