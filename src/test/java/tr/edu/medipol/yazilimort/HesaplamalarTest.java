package tr.edu.medipol.yazilimort;

import org.junit.Assert;
import org.junit.Test;

public class HesaplamalarTest {

    @Test
    public void testFaktoriyelRec() {
        int result = Hesaplamalar.faktoriyelRec(5);
        Assert.assertEquals("test failed", 120, result);

    }

    @Test
    public void testFaktoriyelLoop() {
        int result = Hesaplamalar.faktoriyelLoop(5);
        Assert.assertEquals("test failed", 120, result);

    }

    @Test
    public void testFaktoriyel() {
        int sonuc1 = Hesaplamalar.faktoriyelRec(100);
        int sonuc2 = Hesaplamalar.faktoriyelLoop(100);
        Assert.assertEquals("test failed",sonuc1,sonuc2);
    }

    @Test
    public void testTopla() {
        int result = Hesaplamalar.topla(100,200);
        Assert.assertEquals(300,result);
    }

    @Test
    public void testCikart() {
        int result = Hesaplamalar.cikart(70,50);
        Assert.assertEquals(20,result);
    }

    @Test
    public void testCarpma() {
        int result = Hesaplamalar.carpma(10,20);
        Assert.assertEquals(200,result);
    }

    @Test
    public void testKaresiniAl(){
        int result = Hesaplamalar.karesiniAl(5);
        Assert.assertEquals(25,result);
    }

}
