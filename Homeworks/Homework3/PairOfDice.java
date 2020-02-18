public class PairOfDice {
    Die die1 = new Die();
    Die die2 = new Die();

    public void setDie1(Die die1) {
        this.die1 = die1;
    }

    public void setDie2(Die die2) {
        this.die2 = die2;
    }

    public Die getDie1(){
        return die1;
    }
    public Die getDie2(){
        return die2;
    }

    public void diceRoll(){
        die1.rollVoid();
        die2.rollVoid();
    }

    public int pairSum(){
        return die1.getFaceValue() + die2.getFaceValue();
    }
    public String toString() {
        return "The colors of both dice are: " + die1.colorGetter() + ", " + die2.colorGetter() +
                "\nThe sum of the die values is " + pairSum();
    }
    


}
