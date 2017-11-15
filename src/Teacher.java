/**
 * Created by Ксюша on 13.11.2017.
 */
public class Teacher extends Person {


    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    private String subject;

   public String getSubject() {
       return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
   }




    Teacher(int age, String name, String gender, String subject, double salary) {
        super(age, name, gender);
        this.salary=salary;
    this.subject=subject;

    }

    //   String[] subjects = {"Computer Science", "Math", "English", "Chemistry"};
    public enum Subjects {
        MATH,
        ENGLISH,
       CHEMISTRY,
        PC;
            double salary() {
            switch (this) {
                case MATH:
                    return 500;
                case ENGLISH:
                    return 700;
                case CHEMISTRY:
                    return 460;
                case PC:
                    return 300;
                default:
                    throw new AssertionError("Unknown operations " + this);
            }
        }

    }


    @Override
    public String toString() {
        return super.toString()+ " , " + "salary=" + salary +
                ", subject='" + subject + '\'' ;
    }
}
