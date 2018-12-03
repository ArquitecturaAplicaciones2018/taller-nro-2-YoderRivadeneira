import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Test_rational {

    Rational r1 = new Rational(1,6);
    Rational r2 = new Rational(1,2);

    @Test(expected = IllegalArgumentException.class)
    public void Test_rationaldenominator(){
        Rational r = new Rational(1,0);
    }

    @Test
    public void Test_rationaltoString(){
        Rational r = new Rational(1,2);
        assertEquals("resultado esperado","1/2",r.toString());
    }

    @Test
    public void Test_rationalisLessThan(){
        assertEquals(true,r1.isLessThan(r2));
    }

    @Test
    public void Test_rationalgetGreater(){
        assertEquals(r2,r1.getGreater(r2));
    }

    @Test
    public void Test_rationalplus(){

        Rational r1 = new Rational(1,6);
        Rational r2 = new Rational(1,2);
        assertEquals("El suma es: 2/3","2/3",r1.plus(r2).toString());
    }

    @Test
    public void Test_rationalminus(){
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,3);
        assertEquals("La resta es: 1/6","1/6",r1.minus(r2).toString());

    }

    @Test
    public void Test_rationaltimes(){
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,3);
        assertEquals("El resultado de la multiplicacion es: 1/6","1/6",r1.times(r2).toString());
    }

    @Test
    public void Test_rationaldivides(){
        assertEquals(1,r1.divides(r2).getNumerator());


    }
}
