import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

       Pedido pedido = new Pedido("Ivonne Sandovalin", "Sprite",1200,"ivonnesandovalin@outlook.com");

       PedidoService service = new PedidoService();
       service.registrar(pedido);

    }
}
