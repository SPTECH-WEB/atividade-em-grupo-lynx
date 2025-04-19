package com.exemple.adapter.entregas.Strategy;

public class FreteEconomico implements  FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 3.0;
    }
}
