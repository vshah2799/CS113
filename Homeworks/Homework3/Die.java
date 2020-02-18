public class Die {
    private final int MAX = 6;  // maximum face value
    private int faceValue;  // current value showing on the die
    private String color;

    public void colorSetter(String x){
        color = x;
    }
    public String colorGetter(){
        return color;
    }


    //  Constructor: Sets the initial face value.
    public Die()
    {
        faceValue = 1;
    }

    //  Rolls the die and returns the result.
    public int roll()
    {
        faceValue = (int)(Math.random() * MAX) + 1;
        return faceValue;
    }

    //  Face value mutator.
    public void setFaceValue(int value)
    {
        faceValue = value;
    }

    //  Face value accessor.
    public int getFaceValue()
    {
        return faceValue;
    }

    //  Returns a string representation of this die.
    public String toString()
    {
        String result = Integer.toString(faceValue);

        return result;
    }





    public static void println(String x) {
        System.out.println(x);
    }
}
