package School.karate.Exceptions;

public class KarateMaster
{
    public void KnockDown() throws KnockDownException
    {
        double val = Math.random()%10;
        if(val>0.90)
        {
            throw new KnockDownException("ohh...shut!!..KnockDown exception has been arraised");
        }
        else if(val<0.30)
        {
            throw new FallenException(" sorry...!! Fallen Exception occured");
        }
        System.out.println("game is going smoothly");
    }
}