public class Parent
{
  public static void main(String[] args) {
    try{
      child obj= new child();
      obj.CheckingForHostel();
    }
    catch(PgHostelNotFoundException e)
    {
      System.out.println(e);
    }
     catch(comfortAreaNotFoundException e1)
    {
      System.out.println(e1);
    }
  }

}



 class child {
    public void CheckingForHostel() throws PgHostelNotFoundException
    {
        double value = Math.random();
      
        if(value>0.99)
        {
            throw new comfortAreaNotFoundException("sorry..! the required room is not found");
        }
        else if(value<0.98 && value>0.25)
        {
             throw new PgHostelNotFoundException("ohh..! required hostel is not having any vacancies");
        }
     
        System.out.println("requied hstl and comfort zone is met");
     
    }   
}

