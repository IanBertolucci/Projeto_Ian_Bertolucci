package br.ufla;

public class B {
    private int B1;
    private float B2;

    public int getB1() {
        return B1;
    }

    public void setB1(int b1) {
        B1 = b1;
    }

    public float getB2() {
        return B2;
    }

    public void setB2(float b2) {
        B2 = b2;
    }

    public void MB1(){
        String nome = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(nome);
    }

    public void MB2(){
        String nome = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(nome);
    }

    public void MB3(){
        String nome = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(nome);
    }
}
