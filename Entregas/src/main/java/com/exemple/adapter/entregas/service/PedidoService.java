package com.exemple.adapter.entregas.service;

import com.exemple.adapter.entregas.Strategy.FreteTransportadora;
import org.springframework.stereotype.Service;


import com.exemple.adapter.entregas.Model.Pedido;
import com.exemple.adapter.entregas.repository.PedidoRepository;


@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public java.util.List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
}
