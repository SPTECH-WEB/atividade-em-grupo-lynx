package com.exemple.adapter.entregas.Strategy;

public class FreteTransportadora implements FreteStrategy {
    private TransportadoraAdapter adapter;

    public FreteTransportadora(TransportadoraAdapter adapter) {
        this.adapter = adapter;
    }

    public double calcularFrete(double peso) {
        return adapter.calcularFreteExterno(peso);
    }
}
