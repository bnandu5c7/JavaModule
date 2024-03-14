package School.karate.Exceptions;

public class KarateFuMaster {
    public static void main(String[] args) {
        try{
            KarateMaster obj = new KarateMaster();
            obj.KnockDown();
        }
        catch(KnockDownException e)
        {
            System.out.println(e);
        }
        catch(FallenException e1)
        {
            System.out.println(e1);
        }
    }
    
}
