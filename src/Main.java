import equalityofline.EqualityofLine;
import lengthofline.LengthofLine;
import linegreaterequalless.LineGreaterEqualLess;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Computation Problem \n");
        LengthofLine l1 = new LengthofLine();
        EqualityofLine e1 = new EqualityofLine();
        LineGreaterEqualLess gel = new LineGreaterEqualLess();
        l1.Length();
        e1.Equal();
        gel.lineGreatLessEqual();
    }
}