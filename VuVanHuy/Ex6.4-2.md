
```java
public class tcmfe {
    
    @Test
    public void testThrow_Cme()
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