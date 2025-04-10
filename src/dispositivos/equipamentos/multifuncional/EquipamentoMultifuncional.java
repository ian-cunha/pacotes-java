package dispositivos.equipamentos.multifuncional;

import dispositivos.equipamentos.copiadora.Copiadora;
import dispositivos.equipamentos.digitalizadora.Digitalizadora;
import dispositivos.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("Copiando com o equipamento multifuncional...");
    }

    public void digitalizar() {
        System.out.println("Digitalizando com o equipamento multifuncional...");
    }

    public void imprimir() {
        System.out.println("Imprimindo com o equipamento multifuncional...");
    }
}
