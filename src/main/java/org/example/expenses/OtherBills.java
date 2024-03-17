package org.example.expenses;

public class OtherBills {
    public int milleniumInstallment;
    public int pkoInstallment;
    public int tithe;// dziesięcina
    public int childAllowance; // 800 +

    public OtherBills(int milleniumInstallment, int pkoInstallment, int tithe, int childAllowance) {
        this.milleniumInstallment = milleniumInstallment;
        this.pkoInstallment = pkoInstallment;
        this.tithe = tithe;
        this.childAllowance = childAllowance;
    }
}
