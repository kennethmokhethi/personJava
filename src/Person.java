import java.util.Arrays;

public class Person {
     //Attributes of the class set to private to only allow access within the class
   private String name;
   private int age;
   private String gender;
   private String interest[];

     //Constructor for initialising the attributes of the class
    public Person(String name,int age,String gender,String interest[]){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
    }

     //Method of the class to return the details of the class with formats
    public String hello(){
        //Copying the content of the original array excluding the last element into a new array
        String interest_without_last_element[] = Arrays.copyOf(interest,this.interest.length-1);
        //Storing the last element of the original array into a single variable
        String last_element_in_interest = this.interest[this.interest.length-1];


        return ("Hello, my name is " + this.name + " and I am " + " "+this.age + " years old" + "." + "My interests are " + " " +
                Arrays.toString(interest_without_last_element) + " and " + last_element_in_interest);
    }

}
