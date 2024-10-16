import java.util.ArrayList;
import java.util.Scanner;

public class TvSeries {
    private String name;
    private ArrayList<Integer> episodes = new ArrayList<>();
    private int rating;

    public TvSeries() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter the episode name: ");
        name = myScanner.nextLine();
    }

    public TvSeries(String inName){
        name = inName;

    }

    public void changeRating(int newRating)
    {
        rating = newRating;
    }

    public void addEpisodes(int numOfEpisodes, int season){


    }

    public void printInfo(){

    }
}
