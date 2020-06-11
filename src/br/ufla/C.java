package br.ufla;

public class C {
    String C1;
    int C2;

    public String getC1() {
        return C1;
    }

    public void setC1(String c1) {
        C1 = c1;
    }

    public int getC2() {
        return C2;
    }

    public void setC2(int c2) {
        C2 = c2;
    }

    public void MC1(){
        String nome = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(nome);
    }

    public void MC2(){
        String nome = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(nome);
    }
}
