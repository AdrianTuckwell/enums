import static org.junit.Assert.*;
import org.junit.*;
import jewellery.*;

public class RingTest {

  Ring ring;
  
  @Before 
  public void before(){
    // needs to get Enum from MetalType.GOLD with (fullstop)
    ring = new Ring(MetalType.GOLD, GemType.DIAMOND);
  }

  
  @Test // 1 check the metal type --------------
  public void canGetMetal(){
    assertEquals(MetalType.GOLD,ring.getMetal());
  }

  @Test // 2 check the gem type ----------------
  public void canGetGem(){
    assertEquals(GemType.DIAMOND,ring.getGem());
  }

  // @Test
  // public void metalCanBeMispelled(){
  //   ring = new Ring("Golllld");   
  //   assertEquals(ring.getMetal(),"Golllld");
  // }

  // @Test
  // public void metalCanBeBanana(){
  //   ring = new Ring("Banana");   
  //   assertEquals(ring.getMetal(),"Banana");
  // }


}