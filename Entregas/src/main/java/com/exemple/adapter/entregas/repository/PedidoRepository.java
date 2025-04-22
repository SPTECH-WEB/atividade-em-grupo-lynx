package com.exemple.adapter.entregas.repository;

import com.exemple.adapter.entregas.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
