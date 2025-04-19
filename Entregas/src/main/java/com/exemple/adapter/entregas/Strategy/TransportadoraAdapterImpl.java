package com.exemple.adapter.entregas.Strategy;

public class TransportadoraAdapterImpl implements TransportadoraAdapter {

    private final TransportadoraExterna transportadoraExterna;

    public TransportadoraAdapterImpl() {
        this.transportadoraExterna = new TransportadoraExterna();
    }

    @Override
    public double calcularFreteExterno(double peso) {
        transportadoraExterna.enviarEntrega("Cliente", "Produto", peso);
        return peso * 12.0;
    }
}
