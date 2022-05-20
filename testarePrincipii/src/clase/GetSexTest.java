package clase;

import exceptii.CNPInvalidException;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetSexTest {
    @Test
    public void getSexRight() {
        Persoana pF = new Persoana("Iulia", "600522036788");
        assertEquals("F", pF.getSex());
        Persoana pM = new Persoana("Iulian", "500522036789");
        assertEquals("M", pM.getSex());
    }

    @Test
    public void getSexBoundaryF() {
        Persoana pF = new Persoana("Iulia", "600522036788");
        assertEquals("F", pF.getSex());

    }

    public void getSexBoundaryM() {
        Persoana pM = new Persoana("George", "100522036788");
        assertEquals("M", pM.getSex());
    }

    @Test
    public void getSexCrossCheck() {
        Persoana pM = new Persoana("Ana", "6005220462");
        int primaCifra = pM.CNP.charAt(0);
        assertEquals(primaCifra % 2 == 0 ? "F" : "M", pM.getSex());

    }

    @Test
    public void testGetSexShouldThrowException() {
        Persoana persoana = new Persoana("Andrei", "0012345544");
        try {
            persoana.getSex();
            fail("Metoda nu arunca exceptie");

        } catch (CNPInvalidException exception) {

        }
    }

//    @Test(expected=CNPInvalidException.class)
//    public void testGetSexShouldThrowExceptionJUnit4{
//        Persoana p = new Persoana("Andrei", "0000221");
//        p.getSex();
//
//    }
    @Test(timeout = 5)
    public void testGetSexPerformance(){
        Persoana p=new Persoana("Andrei","5003220343");
        p.getSex();
    }
    @Test
    public void testGetSexConformance(){
        Persoana p=new Persoana("Andrei","50043232");
        assertEquals(1,p.getSex().length());

    }
    @Test
    public void testGetSexRangeSuperior(){
        Persoana p=new Persoana("Andrei","80043232");

        assertEquals("N/A",p.getSex());


    }


}