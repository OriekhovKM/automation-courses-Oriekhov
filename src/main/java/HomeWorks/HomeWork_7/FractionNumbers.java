package HomeWorks.HomeWork_7;

public class FractionNumbers {
    private int nominator;
    private int denominator;

    public FractionNumbers(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public FractionNumbers plus (FractionNumbers num) {
        int nom = this.nominator * num.getDenominator() + num.getNominator() * this.getDenominator();
        int deNom = this.denominator * num.getDenominator();
        return new FractionNumbers(nom, deNom);
    }
    public FractionNumbers minus(FractionNumbers num) {
        int nom = this.nominator * num.getDenominator() - num.getNominator() * this.getDenominator();
        int deNom = this.denominator * num.getDenominator();
        return new FractionNumbers(nom, deNom);
    }
    public FractionNumbers multiply(FractionNumbers num) {
        int nom = this.nominator * num.getDenominator();
        int deNom = this.denominator * num.getDenominator();
        return new FractionNumbers(nom, deNom);
    }
    public FractionNumbers derive(FractionNumbers num) {
        int nom = this.nominator * num.getDenominator();
        int deNom = this.denominator * num.getNominator();
        return new FractionNumbers(nom, deNom);
    }

    public int getNominator() {
        return nominator;
    }

    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return String.valueOf(nominator +"/"  +denominator);
    }
}
