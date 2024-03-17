package org.example.expenses;

public interface JointExpensesMethod {
    void newBill(String fromWho, int value);
    void payTheBill(String whatBill, int value);

    void showBillToPay(String fromWho, int value);
    void showBillsPaid(String fromWho, int value);

}
