public class Fraction {
    // Vars
    private int num, den;


    // Constructors
    Fraction(Fraction frac) {
        this.num = frac.num;
        this.den = frac.den;
    }

    Fraction(double frac_double) {
        int den = 1;

        while ((int)frac_double != frac_double) {
            frac_double *= 10;

        }
        int div = div((int)frac_double,den);
        this.num = (int)frac_double / div;
        this.den = den / div;
    }


    // Functions
    int div(int first, int second) {
        while (first != 0 && second != 0) {
            if (first > second) {
                first %= second;
            } else {
                second %= first;
            }
        }

        return first + second;
    }

    public void sum(Fraction sum_frac) {
        int tmp = den * sum_frac.den;

        num = num * sum_frac.den + den * sum_frac.num;
        den = tmp;
        int div = div(num, den);

        num /= div;
        den /= div;
    }

    public void mult(Fraction mult_frac) {
        num *= mult_frac.num;
        den *= mult_frac.den;
        int div = div(num, den);

        num /= div;
        den /= div;
    }

    public void getFrac() {
        System.out.println(num + " : " + den);
    }
}
