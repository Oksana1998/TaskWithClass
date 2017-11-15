/**
 * Created by Ксюша on 13.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person(25,"Вася","М");
        System.out.println(person);
        Student student = new Student(16,"Lynne Brooke","F","HS95129",3.5);
        System.out.println(student);
       // Teacher teacher = new Teacher(34,"Duke Java","F", Teacher.Subjects.CHEMISTRY,600);


        String[] Major= new String[]{"Communications","Undercl","Electric","English"};

        CollegeStudent collegeStudent = new CollegeStudent(18,"Imm Frosh","F","UCB123",4.0,1 ,Major[0]);
        System.out.println(collegeStudent);



        Teacher teacher = new Teacher(34,"Duke Java","M","Computer Science",50000.0);
        System.out.println(teacher);

    }



}
