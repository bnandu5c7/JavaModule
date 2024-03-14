package Magazine.Shelf;

import java.util.HashSet;
import java.util.Iterator;

public class MagazineTest {
    public static void main(String[] args) {
        Magazine m = new Magazine(101,"what young Indian wants","chattan bagh",200,450.50);
        Magazine m1 = new Magazine(104,"Indian Culture","steven clove",150,500);
        Magazine m2= new Magazine(102,"Nuclear family","shwaran",120,350);
        Magazine m3 = new Magazine(105,"cooperate world","rivazz",135,250);
        Magazine m4 = new Magazine(103,"rural culture","shwarista",300,660);
        Magazine m5 = m1;
        HashSet<Magazine> hs = new HashSet<Magazine>();
        hs.add(m);
        hs.add(m1);
        hs.add(m2);
        hs.add(m3);
        hs.add(m4);
        hs.add(m5);
        Iterator<Magazine> obj=hs.iterator();
        while(obj.hasNext())
        {
            Magazine mg=(Magazine) obj.next();
            System.out.println(" the  unique values are :"+mg);
        }

    }
    
}
