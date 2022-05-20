package clase;

import exceptii.CNPInvalidException;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetVarstaTest {
    @Test
    public void getVarstaRight(){
        Persoana p=new Persoana("Maria","6000521046209");
        assertEquals(21,p.getVarsta());
    }
    @Test
    public void getVarstaBoundaryInferior(){
        Persoana p=new Persoana("Maria","30000101046209");
        assertEquals(222,p.getVarsta());

    }
    @Test
    public void getVarstaBoundarySuperior(){
        Persoana p=new Persoana("Maria","6220101046209");
        assertEquals(0,p.getVarsta());

    }
    @Test(expected = NullPointerException.class)
    public void getVarstaNullPointerException(){
        Persoana p=new Persoana("Maria",null);
        p.getVarsta();

    }
    @Test(expected = CNPInvalidException.class)
    public void getVarstaCNPInvalidException(){
        Persoana p=new Persoana("Maria","6250757532");
        p.getVarsta();

    }
    @Test(timeout = 100)
    public void getVarstaPerformance(){
        Persoana p=new Persoana("Maria","621011232233");
        p.getVarsta();
    }
    @Test
    public void getVarstaOrder(){
        Persoana p=new Persoana("Maria","6200011232233");
        Persoana p2=new Persoana("Maria","6210011232233");
        assertTrue(p.getVarsta()>p2.getVarsta());

    }
    @Test
    public void getVarstaCardinality1(){
        Persoana p=new Persoana("Maria","621011232233");
        assertEquals(1,p.getVarsta());
    }



}