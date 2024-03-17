package org.example.expenses;

public class Orzechowa extends JointExpenses{
    private int garbage;//śmieci
    private int UPC;
    private int gas;
    private int water;
    private int PZU;

    public Orzechowa(int net, int rent, int energy, int garbage, int UPC, int gas, int water, int PZU) {
        super(net, rent, energy);
        this.garbage = garbage;
        this.UPC = UPC;
        this.gas = gas;
        this.water = water;
        this.PZU = PZU;
    }
}
