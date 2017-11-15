import java.util.Arrays;

/**
 * Created by Ксюша on 13.11.2017.
 */
public class CollegeStudent extends Student {
    private int year;
   private String major;



    CollegeStudent(int age, String name, String gender, String idNumber, double gpa, int year, String major) {
        super(age, name, gender, idNumber, gpa);
        this.year=year;


       this.major=major;

    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return super.toString() + " , "+
                "year=" + year +
                ", major='" + major + '\'';
    }
}
