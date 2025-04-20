package com.exemple.adapter.entregas.Adapter;

public class TransportadoraExterna {

    public void enviarEntrega(String nomeCliente, String produto, double peso) {
        System.out.println("🚚 Transportadora Externa");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Produto: " + produto);
        System.out.println("Peso: " + peso + "kg");
    }
}
