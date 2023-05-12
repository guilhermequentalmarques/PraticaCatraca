 public class ControleAcessoTest {
     public static void main(String[] args) {
         ControleAcesso controleAcesso = new ControleAcesso();

         controleAcesso.registrarCodigo(123);
         System.out.println("Última entrada: " + controleAcesso.getUltimaEntrada());

         controleAcesso.registrarCodigo(123);
         System.out.println("Última entrada: " + controleAcesso.getUltimaEntrada());
     }
 }
