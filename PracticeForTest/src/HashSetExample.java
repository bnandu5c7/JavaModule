import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        Novel obj= new Novel(1,"olden days",450,"shakespere",300);
        Novel obj1= new Novel(4,"hybrid System",560,"steven",230);
        Novel obj2= new Novel(1,"olden days",450,"shakespere",300);
        Novel obj3= new Novel(2,"the programmer",550,"hopper",234);
        Novel obj4= new Novel(3,"fashion",455,"clovesto",150);
        Novel obj5= new Novel(1,"olden days",450,"shajaha",300);
        Novel obj6= obj3;
        HashSet<Novel> hash = new HashSet<Novel>();   
        hash.add(obj);
        hash.add(obj1);
        hash.add(obj2);
        hash.add(obj3);
        hash.add(obj4);
        hash.add(obj5);
        hash.add(obj6);
        Iterator<Novel> nobj= hash.iterator();
        while(nobj.hasNext())
        {
            Novel n=(Novel)nobj.next();
            System.out.println(" "+n);
        }


    }
    
}
class Novel
{
    int nId;
    String nName;
    float price;
    String nAuthor;
    int nPages;
    

    public Novel(int nId, String nName, float price, String nAuthor, int nPages) {
        this.nId = nId;
        this.nName = nName;
        this.price = price;
        this.nAuthor = nAuthor;
        this.nPages = nPages;
    }

    @Override
    public String toString() {
        return "Novel [nId=" + nId + ", nName=" + nName + ", price=" + price + ", nAuthor=" + nAuthor + ", nPages="
                + nPages + "]";
    }

    public int getnId() {
        return nId;
    }

    public String getnName() {
        return nName;
    }

    public float getPrice() {
        return price;
    }

    public String getnAuthor() {
        return nAuthor;
    }

    public int getnPages() {
        return nPages;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + nId;
        result = prime * result + ((nName == null) ? 0 : nName.hashCode());
        result = prime * result + Float.floatToIntBits(price);
        result = prime * result + ((nAuthor == null) ? 0 : nAuthor.hashCode());
        result = prime * result + nPages;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Novel other = (Novel) obj;
        if (nId != other.nId)
            return false;
        if (nName == null) {
            if (other.nName != null)
                return false;
        } else if (!nName.equals(other.nName))
            return false;
        if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
            return false;
        if (nAuthor == null) {
            if (other.nAuthor != null)
                return false;
        } else if (!nAuthor.equals(other.nAuthor))
            return false;
        if (nPages != other.nPages)
            return false;
        return true;
    }







    
}
