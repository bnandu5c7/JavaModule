public class Demo1 {
    public static void main(String args[]) throws Exception {
        Boxer boxer = new Boxer();
    }
}

class Boxer {
    Boxer() throws LossGameException {
        double value = Math.random() % 10;
        if (value > 0.1&&value<0.5) {
            throw new LossGameException("ohh!! mann you lost the game");

        }
       // else
        //{
          //  System.out.println("win the game ");
        //}

    }

    void drop() {
        double val = Math.random() % 10;
        if (val >0.5&&val<0.9) {
            throw new BleedingException("hurry!!!....it seems that its bleeding you can drop the game");
        }
         //else
         //{
         //System.out.println("it says that you dont have any problem you can continue the game");
        //}
    }
}

class LossGameException extends Exception {
    LossGameException(String msg) {

        super(msg);
    }
}

class BleedingException extends RuntimeException {
    BleedingException(String msg) {
        super(msg);
    }
}
