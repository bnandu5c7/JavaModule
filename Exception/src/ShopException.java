
public class ShopException {
    public static void main(String args[])
    {
    
          try{ ShoppingExm obj = new ShoppingExm();}
     catch (ShopNotOpenedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            }
        
    }
class ShoppingExm
{
    String shopName;
    String location;
    ShoppingExm() throws ShopNotOpenedException
    { 
        double range = Math.random()%10;
        if( range >0.25)
        {
            throw new ShopNotOpenedException("ohh sorry!!!....Shop closed");
        }
        else
        { 
            System.out.println("shop is opened");
        }
    }
    void dressAvailable() 
    {
        double value = Math.random()%10;
        if(value>0.97)
        {
            throw new DressNotFoundException("ohh  shut!!!...dress is currently not available");
        }
    }
}
class ShopNotOpenedException extends Exception{
    ShopNotOpenedException(String msg)
    {
        super(msg);
    }
}
class DressNotFoundException extends RuntimeException
{
    DressNotFoundException(String msg)
    {
        super(msg);
    }
}