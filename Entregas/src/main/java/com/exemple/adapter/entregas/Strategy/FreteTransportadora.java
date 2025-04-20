package com.exemple.adapter.entregas.Strategy;

import com.exemple.adapter.entregas.Adapter.TransportadoraAdapter;

public class FreteTransportadora implements FreteStrategy {
    private TransportadoraAdapter adapter;

    public FreteTransportadora(TransportadoraAdapter adapter) {
        this.adapter = adapter;
    }

    public double calcularFrete(double peso) {
        return adapter.calcularFreteExterno(peso);
    }
}
