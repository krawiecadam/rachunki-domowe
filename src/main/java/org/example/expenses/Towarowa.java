package org.example.expenses;

public class Towarowa extends JointExpenses {
    private int garageRent;

    public Towarowa(int net, int rent, int energy, int garageRent) {
        super(net, rent, energy);
        this.garageRent = garageRent;
    }
}
