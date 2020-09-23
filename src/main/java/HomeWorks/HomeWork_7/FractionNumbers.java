package HomeWorks.HomeWork_7;

import java.util.Objects;

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
 //       return new FractionNumbers(nom, deNom);
        return reduction(nom, deNom);
    }
    public FractionNumbers minus(FractionNumbers num) {
        int nom = this.nominator * num.getDenominator() - num.getNominator() * this.getDenominator();
        int deNom = this.denominator * num.getDenominator();
        return reduction(nom, deNom);
    }
    public FractionNumbers multiply(FractionNumbers num) {
        int nom = this.nominator * num.getNominator();
        int deNom = this.denominator * num.getDenominator();
        return reduction(nom, deNom);
    }
    public FractionNumbers derive(FractionNumbers num) {
        int nom = this.nominator * num.getDenominator();
        int deNom = this.denominator * num.getNominator();
        return reduction(nom, deNom);
    }

    public FractionNumbers reduction (int nom, int deNom) { // method for reducing fractions
        double counter = nom;
         while (counter>1) {
            if (deNom%counter == 0 && nom%counter == 0) {
                nom = (int) (nom/counter);
                deNom = (int) (deNom/counter);
            }
            counter--;
        }
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
        if (denominator>1) {
        return String.valueOf(nominator +"/"  +denominator);
    } else return String.valueOf(nominator);
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumbers numbers = (FractionNumbers) o;
        return nominator == numbers.nominator &&
                denominator == numbers.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominator, denominator);
    }
}
