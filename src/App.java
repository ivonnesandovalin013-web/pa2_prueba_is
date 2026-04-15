import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido = new Pedido("Ivonne Sandovalin", "Sprite", 100, "ivonnesandovalin@outlook.com", "0998453962");

        PedidoService service = new PedidoService();
        service.registrar(pedido);

    }
}
