/**
 * Created by Ксюша on 13.11.2017.
 */
public class Person {

    private int age;
    private String name;
    private String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
     Person(int age, String name,String gender){
         this.age = age;
         this.name=name;
         this.gender=gender;

     }

    @Override
    public String toString() {
        return
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'';
    }


}
