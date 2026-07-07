//import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithematicProjTest {

    @Test
    public void sumTest(){
        int x = 5;
        int y = 6;
        ArithematicProj proj = new ArithematicProj(4,5);
          int res=proj.sum(x,y);
          assertEquals(11,res);

    }


}