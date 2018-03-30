import java.util.Scanner;
import java.util.StringTokenizer;
public class customer {
    private String name;
    private String date_of_birth;

    public void readData(String name, String date_of_birth) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        }
    public void displayData(){
        StringTokenizer st = new
        StringTokenizer(this.date_of_birth, "/");
        System.out.println(this.name + ",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken() + "");
        }
    }
}
