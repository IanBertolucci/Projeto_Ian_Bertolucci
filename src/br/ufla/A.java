package br.ufla;

public class A {
    private int A1;
    private float A2;

    public int getA1() {
        return A1;
    }

    public void setA1(int a1) {
        A1 = a1;
    }

    public float getA2() {
        return A2;
    }

    public void setA2(float a2) {
        A2 = a2;
    }

    public void MA1(){
        String nome = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(nome);
    }

    public void MA2(){
        String nome = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(nome);
    }

    public void MA3(){
        System.out.println("Alteração da classe A.");
    }
}
