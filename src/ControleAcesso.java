import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class ControleAcesso {
    private List<Integer> codigosRegistrados;
    private LocalDateTime ultimaEntrada;

    public ControleAcesso() {
        codigosRegistrados = new ArrayList<>();
        ultimaEntrada = null;
    }

    public void registrarCodigo(int codigo) {
        if (codigosRegistrados.contains(codigo)) {
            System.out.println("Obrigado pela visita");
        } else {
            codigosRegistrados.add(codigo);
            ultimaEntrada = LocalDateTime.now();
            System.out.println("Bem-vindo, acesso liberado");
        }
    }
    public LocalDateTime getUltimaEntrada() {
        return ultimaEntrada;
    }
}
