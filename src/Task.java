public class Task {
    public static void main(String[] args) {
        Fraction first_frac = new Fraction(22.8);
        Fraction second_frac = new Fraction(13.37);
        Fraction third_frac = new Fraction(14.48);

        third_frac.mult(first_frac);
        first_frac.sum(second_frac);

        first_frac.getFrac();
        second_frac.getFrac();
        third_frac.getFrac();
    }
}
