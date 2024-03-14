public class ExceptionHandle {
    public static void main(String args[]) 
  { 
    try{
     Boxer boxer =new Boxer(); 
     boxer.drop();
    }
    catch(LossGameException e2){
      System.out.println("errorrrrrrrr"+e2);
    }
    catch(BleedingException e1)
    { 
      System.out.println("some disturbance created in middle of the game"+e1);
    }    
}
}

