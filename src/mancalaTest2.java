/**
 * Created by Standard user on 2/20/2017.
 */

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.Before;


public class mancalaTest2 {

    /*
    * Here we are using the first one of the
    * two more scenarios from assignment 2 .
    * We are using the first step of the scenario
    * to test the method reDistributeCounterclockwise
    * the player takes 4 pebbles from a house and redistributes them.
    * But here we modify the 4 pebbles to 3 pebbles.*/
    @Test
    public void testRedistribute() throws Exception{
        pit p1 = new pit(3);                 //create the pits that appear
        pit p2 = new pit(2);                 //in the scenario with the
        pit p3 = new pit(0);                //respective number of pebbles in them.
        pit p4 = new pit(0);

        p1.setNext(p2);
        p2.setNext(p3);                 //place them next to each other.
        p3.setNext(p4);

        //Now the board has been setup.

        player temp = new player("player",true);

        //now the player makes his move, and redistributes the pebbles in counterclockwise direction.
        temp.reDistributeCounterclockwise(p1);

        assertTrue(p1.getStoneCnt() == 0);       //These assert statements
        assertTrue(p2.getStoneCnt() == 3);       //check whether or not, the pebbles have been
        assertTrue(p3.getStoneCnt() == 1);       //redistributed properly.
        assertTrue(p4.getStoneCnt() == 1);

    }
}
