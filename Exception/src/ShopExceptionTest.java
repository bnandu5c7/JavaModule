
public class ShopExceptionTest {
    public static void main(String args[])
    {
        try{
            ShoppingExm obj = new ShoppingExm();
            obj.dressAvailable();
        }
        catch(DressNotFoundException e)
        {
            System.out.println("dress not there"+e);
        }
        catch(ShopNotOpenedException e1)
        {
            System.out.println("shop error occured"+e1);
        }
    }
    
}
