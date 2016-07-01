import static java.lang.Math.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestRtriangleProvider {

    Rtriangle r;
    double a, b, c;

    public TestRtriangleProvider(int array[]) {
        RtriangleDemo.array = array;
    }

    @Parameterized.Parameters
    public static List<Object[]> TestValues() {
        return Arrays.asList(new Object[][]{
                {1, 2, 3, 4, 5, 6},
                {-4, 3, 2, 7, 8, -2},
                {0, 0, 0, 0, 0, 0}});
    }

    @Before
    public void setUp() throws Exception {

    RtriangleDemo.array = new int[]{1, 2, 3, 4, 5, 6};
    r = RtriangleProvider.getRtriangle();


        a = pow((r.getApexX2() - r.getApexX1()), 2) +
                pow((r.getApexY2() - r.getApexY1()), 2);
        b = pow((r.getApexX3() - r.getApexX2()), 2) +
                pow((r.getApexY3() - r.getApexY2()), 2);
        c = pow((r.getApexX3() - r.getApexX1()), 2) +
                pow((r.getApexY3() - r.getApexY1()), 2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    @Test
    public void testGetRtriangleSides() throws Exception {

        assertTrue("Triangle side length is zero", a != 0 && b != 0 && c != 0);

    }

    @Test
    public void testGetRtriangleIsRectangular() throws Exception {

        assertTrue("Triangle is not rectangular", a + b == c || a + c == b || c + b == a);

    }
}
