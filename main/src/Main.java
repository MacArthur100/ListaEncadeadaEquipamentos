public class Main {
    public static void main(String[] args) {
        ListaEncadeadaEquipamentos listaEquipamentos = new ListaEncadeadaEquipamentos();

        Equipamento trator1 = new Equipamento("Trator", "Modelo X", "TX123");
        Equipamento trator2 = new Equipamento("Colheitadeira", "Modelo Y", "CY456");
        Equipamento trator3 = new Equipamento("Plantadeira", "Modelo Z", "PZ789");

        listaEquipamentos.add(trator1);
        listaEquipamentos.add(trator2);
        listaEquipamentos.add(trator3);

        System.out.println("Lista de Equipamentos:");
        listaEquipamentos.display();

        System.out.println("\nBuscar equipamento 'Colheitadeira':");
        Equipamento encontrado = listaEquipamentos.buscar("Colheitadeira");
        if (encontrado != null) {
            System.out.println("Equipamento encontrado: " + encontrado);
        } else {
            System.out.println("Equipamento não encontrado.");
        }

        System.out.println("\nRemover equipamento 'Trator':");
        listaEquipamentos.remove("Trator");
        listaEquipamentos.display();

        System.out.println("\nTamanho da lista: " + listaEquipamentos.size());
        System.out.println("A lista está vazia? " + listaEquipamentos.isEmpty());
    }
}