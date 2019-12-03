import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void test(){
        Person Ryan = new Person("Ryan",23,"Male",new String[]{"being a hardarse" , "agile",
                "ssd hard drives"});
        String greeting = Ryan.hello();
        assertEquals("Hello, my name is Ryan and I am  23 years old.My interests are  [being a hardarse, agile] and ssd hard drives",greeting);


    }

    @Test
    public void test2()
    {
        Person Valencia = new Person("Valencia",17,"Female",new String[]{"Volleyball" , "Reading" ,
                "Netball" , "Movies"});
        String greeting = Valencia.hello();
        assertEquals("Hello, my name is Valencia and I am  17 years old.My interests are  [Volleyball, Reading, Netball] and Movies",greeting);

    }


}