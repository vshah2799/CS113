public class TestPairOfDice {
    public static void main(String[] args){
        PairOfDice newPair = new PairOfDice("Red", "Blue");
        System.out.println(newPair.toString());
        newPair.diceRoll();
        System.out.println(newPair.toString());
    }
}
