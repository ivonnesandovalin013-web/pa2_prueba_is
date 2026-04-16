package com.edu.uce.negocio;

public class NotificadorWhatsApp {

    public void enviar(String numero, String mensaje) {

        System.out.println("Se envia el pedido al numero de WhatsApp: " + numero);
        System.out.println("Con el mensaje: " + mensaje);
    }
}
