import controller.DividaController;
import controller.TransacaoController;

public class Main {
    public static void main(String[] args) {
        TransacaoController transacaoController = new TransacaoController();
        transacaoController.menuPrincipal();

        /*DividaController dividaController = new DividaController();
        dividaController.menuPrincipal();*/
    }
}