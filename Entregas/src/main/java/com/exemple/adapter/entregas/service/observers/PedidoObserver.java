package com.exemple.adapter.entregas.service.observers;

import com.exemple.adapter.entregas.Model.Pedido;

public interface PedidoObserver {
    void notificar(Pedido pedido);
}
