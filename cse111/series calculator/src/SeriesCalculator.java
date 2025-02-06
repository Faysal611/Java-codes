public class SeriesCalculator {
    private int n;
    public SeriesCalculator(int n) {
        this.n = (n / 2) * (2 * 1 + (n - 1) * 2); 
    }

    public void sum() {
        System.out.println("Sum of the series: " + n);
    }
}