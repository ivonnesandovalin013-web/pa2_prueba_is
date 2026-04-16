import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Caso 1");

        Pedido pedido = new Pedido("Ivonne Sandovalin", "Sprite", 130, "ivonnesandovalin@outlook.com", "0998453962");

        PedidoService service = new PedidoService();
        service.registrar(pedido);

        System.out.println("Caso 2");

        Pedido pedido2 = new Pedido("Ivonne Sandovalin", "Sprite", 90, "ivonnesandovalin@outlook.com", "0998453962");

        service.registrar(pedido2);

        System.out.println("Caso 3");

        Pedido pedido3 = new Pedido("Ivonne Sandovalin", "Sprite", 40, "ivonnesandovalin@outlook.com", "0998453962");

        service.registrar(pedido3);

    }
}
