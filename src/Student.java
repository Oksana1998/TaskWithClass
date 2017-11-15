/**
 * Created by Ксюша on 13.11.2017.
 */
public class Student extends Person {
    private String idNumber;
    private double gpa;

    Student(int age, String name, String gender, String idNumber,double gpa) {
        super(age, name, gender);
        this.idNumber=idNumber;
        this.gpa = gpa;



    }



    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString()+ " , "+
                "idNumber='" + idNumber + '\'' +
                ", gpa=" + gpa;
    }
}
