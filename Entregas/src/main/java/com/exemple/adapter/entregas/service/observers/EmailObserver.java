package com.exemple.adapter.entregas.service.observers;

import com.exemple.adapter.entregas.Model.Pedido;
import org.springframework.stereotype.Component;

@Component
public class EmailObserver implements PedidoObserver {

    @Override
    public void notificar(Pedido pedido) {
        System.out.println("E-mail enviado para " + pedido.getCliente());
    }
}
