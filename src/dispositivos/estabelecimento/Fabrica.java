package dispositivos.estabelecimento;

import dispositivos.equipamentos.copiadora.Copiadora;
import dispositivos.equipamentos.digitalizadora.Digitalizadora;
import dispositivos.equipamentos.digitalizadora.Scanner;
import dispositivos.equipamentos.impressora.DeskJet;
import dispositivos.equipamentos.impressora.Impressora;
import dispositivos.equipamentos.impressora.LaserJet;
import dispositivos.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Scanner scanner = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
