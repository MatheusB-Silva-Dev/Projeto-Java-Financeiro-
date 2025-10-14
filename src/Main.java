import controller.DividaController;
import controller.TransacaoController;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*TransacaoController transacaoController = new TransacaoController();
        transacaoController.menuPrincipal();*/

        DividaController dividaController = new DividaController();
        dividaController.menuPrincipal();
    }
}