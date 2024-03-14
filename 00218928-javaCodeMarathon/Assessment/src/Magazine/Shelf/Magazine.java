package Magazine.Shelf;

public class Magazine {
    int magazineNumber;
    String magazineName;
    String magazineAuthor;
    int noOfPages;
    double magazinePrice;
    public Magazine() {
    }
    public Magazine(int magazineNumber, String magazineName, String magazineAuthor, int noOfPages,
            double magazinePrice) {
        this.magazineNumber = magazineNumber;
        this.magazineName = magazineName;
        this.magazineAuthor = magazineAuthor;
        this.noOfPages = noOfPages;
        this.magazinePrice = magazinePrice;
    }
    public int getMagazineNumber() {
        return magazineNumber;
    }
    public void setMagazineNumber(int magazineNumber) {
        this.magazineNumber = magazineNumber;
    }
    public String getMagazineName() {
        return magazineName;
    }
    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }
    public String getMagazineAuthor() {
        return magazineAuthor;
    }
    public void setMagazineAuthor(String magazineAuthor) {
        this.magazineAuthor = magazineAuthor;
    }
    public int getNoOfPages() {
        return noOfPages;
    }
    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }
    public double getMagazinePrice() {
        return magazinePrice;
    }
    public void setMagazinePrice(double magazinePrice) {
        this.magazinePrice = magazinePrice;
    }
    @Override
    public String toString() {
        return "Magazine [magazineNumber=" + magazineNumber + ", magazineName=" + magazineName + ", magazineAuthor="
                + magazineAuthor + ", noOfPages=" + noOfPages + ", magazinePrice=" + magazinePrice + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + magazineNumber;
        result = prime * result + ((magazineName == null) ? 0 : magazineName.hashCode());
        result = prime * result + ((magazineAuthor == null) ? 0 : magazineAuthor.hashCode());
        result = prime * result + noOfPages;
        long temp;
        temp = Double.doubleToLongBits(magazinePrice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Magazine other = (Magazine) obj;
        if (magazineNumber != other.magazineNumber)
            return false;
        if (magazineName == null) {
            if (other.magazineName != null)
                return false;
        } else if (!magazineName.equals(other.magazineName))
            return false;
        if (magazineAuthor == null) {
            if (other.magazineAuthor != null)
                return false;
        } else if (!magazineAuthor.equals(other.magazineAuthor))
            return false;
        if (noOfPages != other.noOfPages)
            return false;
        if (Double.doubleToLongBits(magazinePrice) != Double.doubleToLongBits(other.magazinePrice))
            return false;
        return true;
    }
    





}
