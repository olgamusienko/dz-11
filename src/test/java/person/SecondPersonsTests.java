package person;

import com.rd.person.Man;
import com.rd.person.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondPersonsTests {
    private Woman woman;
    private Man man;


    @BeforeTest
    public void creatingPerson(){
        man = new Man("Jack", "Newman", 70);
        woman = new Woman("Jessica", "Stone", 61);

        man.registerPartnership(woman);
    }

    @Test
    public void testManFirstName(){
        Assert.assertEquals(man.getFirstName(), "Jack", "Method getFirstName doesn't work");
        man.setFirstName("Nick");
        Assert.assertEquals(man.getFirstName(), "Nick", "Method setFirstName doesn't work");
    }

    @Test
    public void testManLastName(){
        Assert.assertEquals(man.getLastName(), "Newman", "Method getLastName doesn't work");
        man.setLastName("Brown");
        Assert.assertEquals(man.getLastName(), "Brown", "Method setLastName doesn't work");
    }

    @Test
    public void testManAge(){
        Assert.assertEquals(man.getAge(), 70, "Method getAge doesn't work");
        man.setAge(75);
        Assert.assertEquals(man.getAge(), 75,"Method setAge doesn't work");
    }

    @Test
    public void testWomanFirstName(){
        Assert.assertEquals(woman.getFirstName(), "Jessica", "The first name is incorrect");
    }

    @Test
    public void testWomanLastName(){
        Assert.assertEquals(woman.getLastName(), "Newman", "The last name is incorrect");
    }

    @Test
    public void testWomanAge(){
        Assert.assertEquals(woman.getAge(), 61, "The age is incorrect");
    }

    @Test
    public void testManPartner(){
        Assert.assertEquals(man.getPartner(), woman, "The partner is incorrect");
    }

    @Test
    public void testWomanPartner(){
        Assert.assertEquals(woman.getPartner(), man, "The partner is incorrect");
    }

}
