package br.ufla;

public class D {
    String D1 = "Uma string.";
    String D2 = "Outra string";

    public String getD1() {
        return D1;
    }

    public void setD1(String d1) {
        D1 = d1;
    }

    public String getD2() {
        return D2;
    }

    public void setD2(String d2) {
        D2 = d2;
    }

    public void MD1(){
        System.out.println(D1);
    }

    public void MD2(){
        System.out.println(D2);
    }
    
    public void MD4(){
        String nome = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(nome);
    }

    public void MD3(){
        String nome = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println(nome);
    }
}
