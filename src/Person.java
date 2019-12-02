import java.util.Arrays;

public class Person {
   private String name;
   private int age;
   private String gender;
   private String interest[];


    public Person(String name,int age,String gender,String interest[]){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
    }


    public String hello(){
        String interest_without_last_element[] = Arrays.copyOf(interest,this.interest.length-1);
        String last_element_in_interest = this.interest[this.interest.length-1];


        return ("Hello, my name is " + this.name + " and I am " + " "+this.age + " years old" + "." + "My interest are " + " " +
                Arrays.toString(interest_without_last_element) + " and " + last_element_in_interest);
    }

}
