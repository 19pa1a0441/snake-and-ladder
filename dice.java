public class Dice {
    private int numberOfDices;
    Dice(int numberOfDices) {
        this.numberOfDices = numberOfDices;
    }  
    int rollDice(){
        int dice = ((int) (Math.random()*(6*numberOfDices - 1*numberOfDices))) + 1;
        return dice;
    }
}
