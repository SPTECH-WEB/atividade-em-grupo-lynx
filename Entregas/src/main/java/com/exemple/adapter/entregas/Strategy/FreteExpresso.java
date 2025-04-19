package com.exemple.adapter.entregas.Strategy;

public class FreteExpresso implements  FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 6.0;
    }
}
