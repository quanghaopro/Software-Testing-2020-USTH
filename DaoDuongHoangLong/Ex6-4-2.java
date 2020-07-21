// Read the doc here
// https://docs.oracle.com/javase/7/docs/api/java/util/ConcurrentModificationException.html
// Read the explanation here
// https://stackoverflow.com/a/23514944/13358358

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
public class throwConcurrentModificationException {
    @Test
    public void testThrow_ConcurrentModificationException()
    {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        Iterator itr = stringList.iterator();
        while (itr.hasNext())
        {
            Object temp = itr.next();
            if (temp.equals(5))
            {
                stringList.remove(temp);
            }
        }
    }
}