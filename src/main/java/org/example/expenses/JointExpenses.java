package org.example.expenses;

public class JointExpenses implements JointExpensesMethod{
    private int net;
    private int rent;//czynsz
    private int energy;

    public JointExpenses(int net, int rent, int energy) {
        this.net = net;
        this.rent = rent;
        this.energy = energy;
    }

    @Override
    public void newBill(String whatBill, int value) {

    }

    @Override
    public void payTheBill(String whatBill, int value) {

    }

    @Override
    public void showBillToPay(String whatBill, int value) {

    }

    @Override
    public void showBillsPaid(String whatBill, int value) {

    }
}
