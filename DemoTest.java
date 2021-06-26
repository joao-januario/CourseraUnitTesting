import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {

    @Test
    public void isNotTriangleTest(){
        boolean isTriangle = Demo.isTriangle(1,2,3);
        assertEquals(false,isTriangle);
    }

    @Test
    public void isNotTriangleTest1(){
        boolean isTriangle = Demo.isTriangle(1,8,3);
        assertEquals(false,isTriangle);
    }

    @Test
    public void isNotTriangleTest2(){
        boolean isTriangle = Demo.isTriangle(59,8,3);
        assertEquals(false,isTriangle);
    }

    @Test
    public void isTriangleTest(){
        boolean isTriangle = Demo.isTriangle(2,2,3);
        assertEquals(true,isTriangle);
    }

    @Test
    public void mainTest1(){

        ByteArrayInputStream in = new ByteArrayInputStream("5\n12\n13\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: "+ System.lineSeparator() +
                "Enter side 2: " + System.lineSeparator() +
                "Enter side 3: " + System.lineSeparator() +
                "This is a triangle." + System.lineSeparator();
        assertEquals(consoleOutput, out.toString());
    }

    @Test
    public void mainTest2(){

        ByteArrayInputStream in = new ByteArrayInputStream("1\n1\n13\n".getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: "+ System.lineSeparator() +
                "Enter side 2: " + System.lineSeparator() +
                "Enter side 3: " + System.lineSeparator() +
                "This is not a triangle." + System.lineSeparator();
        assertEquals(consoleOutput, out.toString());
    }
}
