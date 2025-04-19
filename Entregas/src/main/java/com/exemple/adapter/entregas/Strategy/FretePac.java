package com.exemple.adapter.entregas.Strategy;

public class FretePac implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 1.5;
    }
}
