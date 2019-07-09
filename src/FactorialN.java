public class FactorialN {
    int getFact(int n)
    {
        int fact = 1;
        while (n >= 1)
        {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
