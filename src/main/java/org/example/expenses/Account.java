package org.example.expenses;



public class Account  {

    private int orzechowaEnergy;
    private int towarowaEnergy;
    private int stoczniowcowEnergy;
    private int orzechowaGarbage;//śmieci
    private int orzechowaUPC;
    private int orzechowaGas;
    private int orzechowaWater;
    private int orzechowaPZU;
    private int towarowaGarageRent;
    public int milleniumInstallment;
    public int pkoInstallment;
    public int tithe;// dziesięcina
    public int childAllowance; // 800 +

    public void showAccountInformation() {
        System.out.println("Stan konta Orzechowa energia: " + orzechowaEnergy);
    }
}
