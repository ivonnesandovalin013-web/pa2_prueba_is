package com.edu.uce.negocio;

public class PedidoService {
    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        if (pedido.getTotal() > 100) {
            NotificadorMail n1 = new NotificadorMail();
            n1.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido mayor a 100 dólares");
        } else {
            NotificadorSMS n2 = new NotificadorSMS();
            n2.enviar(pedido.getNumero(), "Se ha creado un pedido menor o igual a 100 dólares");
        }

    }
}
