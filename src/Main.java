

public class Main {

    public static void main(String[] args){
       //Creating an object called Ryan
        Person Ryan = new Person("Ryan",23,"Male",new String[]{"being a hardarse" , "agile",
                "ssd hard drives"});
        String greeting = Ryan.hello();
        System.out.println(greeting);

        //Creating another object called Valencia
        Person Valencia = new Person("Valencia",17,"Female",new String[]{"Volleyball" , "Reading" ,
                "Netball" , "Movies"});
        greeting = Valencia.hello();
        System.out.println(greeting);

    }
}
