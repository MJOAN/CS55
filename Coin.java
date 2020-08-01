/*
  * Course: CS55 Java Programming
  * Santa Monica College: Summer 2020
  * Student: Mariam Joan
  * Student ID: 1370114
  * Program Description: Print out coinside of coin after each toss from a Coin class
 */

class Coin {
    /* create member variables coinside */
    private String coinSide;

    /* default constructor call toss() */
    public Coin() {
        toss();
    }

    /* member method boolean */
    public boolean isHeadsUp(Coin coinSide) {
        return true ? (coinSide.equals("heads"))  : false;
    }

    /* getter method returns coinside */
    public String getCoinSide(Coin coinSide) {
        return String.valueOf ( coinSide );
    }

    /* setter method sets coinside */
    public void setCoinSide(String coinSide) {
        this.coinSide = coinSide;
    }

    /* Return a string representation of coinSide*/
    public String toString(){
        return coinSide;
    }

    /* toss() uses math.random for toss outcome of 0 or 1 */
    public void toss() {
        boolean outcome = (Math.random() < 0.5);
        if (outcome == true) {
            setCoinSide("heads");
        } else
            setCoinSide("tails");
    }
}

class Demo {
    /* class Demo to demo Coin class toss() */
    public static void main(String[] args) {
        Coin c = new Coin ();
        System.out.println ( "The current coin side facing up is heads" );

        for (int i = 0; i < 10; i++) {
            c.toss();
            System.out.println ( "The side that is facing up now is: " +  c.toString());
        }
    }
}

