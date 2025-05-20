Código comentado Curso Sistemas para Internet - FATEC - Máteria Estrutura de Dados 2 Segundo Sementre


Módulos de códigos comentados linha a linha:

Aqui estão os códigos comentados, linha a linha, e separados por módulos.


Equipamento.java
public class Equipamento {
    private String nome; // Nome do equipamento
    private String modelo; // Modelo do equipamento
    private String numeroSerie; // Número de série do equipamento

    // Construtor da classe Equipamento
    public Equipamento(String nome, String modelo, String numeroSerie) {
        this.nome = nome; // Inicializa o nome
        this.modelo = modelo; // Inicializa o modelo
        this.numeroSerie = numeroSerie; // Inicializa o número de série
    }

    // Método para obter o nome do equipamento
    public String getNome() {
        return nome; // Retorna o nome
    }

    // Método para definir o nome do equipamento
    public void setNome(String nome) {
        this.nome = nome; // Define o nome
    }

    // Método para obter o modelo do equipamento
    public String getModelo() {
        return modelo; // Retorna o modelo
    }

    // Método para definir o modelo do equipamento
    public void setModelo(String modelo) {
        this.modelo = modelo; // Define o modelo
    }

    // Método para obter o número de série do equipamento
    public String getNumeroSerie() {
        return numeroSerie; // Retorna o número de série
    }

    // Método para definir o número de série do equipamento
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie; // Define o número de série
    }

    @Override
    public String toString() {
        return "Equipamento{" + // Início da representação em string
                "nome='" + nome + '\'' + // Adiciona o nome à string
                ", modelo='" + modelo + '\'' + // Adiciona o modelo à string
                ", numeroSerie='" + numeroSerie + '\'' + // Adiciona o número de série à string
                '}'; // Fim da representação em string
    }
}



Node.java
class Node {
    Equipamento equipamento; // Objeto Equipamento armazenado no nó
    Node next; // Referência ao próximo nó na lista

    // Construtor da classe Node
    public Node(Equipamento equipamento) {
        this.equipamento = equipamento; // Inicializa o equipamento
        this.next = null; // Inicializa o próximo nó como nulo
    }
}



ListaEncadeadaEquipamentos.java
public class ListaEncadeadaEquipamentos {
    Node head; // Referência ao primeiro nó da lista

    // Construtor da classe ListaEncadeadaEquipamentos
    public ListaEncadeadaEquipamentos() {
        this.head = null; // Inicializa a cabeça da lista como nulo (lista vazia)
    }

    // Método para adicionar um novo equipamento à lista
    public void add(Equipamento equipamento) {
        Node novoNode = new Node(equipamento); // Cria um novo nó com o equipamento
        if (head == null) { // Se a lista estiver vazia
            head = novoNode; // O novo nó se torna a cabeça da lista
        } else { // Se a lista não estiver vazia
            Node temp = head; // Cria um nó temporário para percorrer a lista
            while (temp.next != null) { // Enquanto não chegar ao último nó
                temp = temp.next; // Move para o próximo nó
            }
            temp.next = novoNode; // O próximo do último nó aponta para o novo nó
        }
    }

    // Método para exibir os equipamentos da lista
    public void display() {
        Node atual = head; // Cria um nó atual para percorrer a lista
        while (atual != null) { // Enquanto não chegar ao final da lista
            System.out.print(atual.equipamento.getNome() + " (" + atual.equipamento.getModelo() + ") -> "); // Imprime o nome e modelo do equipamento
            atual = atual.next; // Move para o próximo nó
        }
        System.out.println("null"); // Imprime "null" para indicar o final da lista
    }

    // Método para remover um equipamento da lista pelo nome
    public void remove(String nome) {
        if (head == null) {
            return; // Lista vazia, não há nada para remover
        }

        if (head.equipamento.getNome().equals(nome)) {
            head = head.next; // Remove o primeiro nó se ele corresponder
            return;
        }

        Node atual = head;
        Node anterior = null;

        // Percorre a lista para encontrar o nó a ser removido
        while (atual != null && !atual.equipamento.getNome().equals(nome)) {
            anterior = atual;
            atual = atual.next;
        }

        if (atual != null) {
            // Se o nó foi encontrado, atualiza a referência do nó anterior para pular o nó atual
            anterior.next = atual.next;
        }
        // Se atual for null, o nó não foi encontrado
    }

    // Método para buscar um equipamento pelo nome
    public Equipamento buscar(String nome) {
        Node atual = head; // Cria um nó atual para percorrer a lista
        while (atual != null) { // Enquanto não chegar ao final da lista
            if (atual.equipamento.getNome().equals(nome)) { // Se o nome do equipamento corresponder
                return atual.equipamento; // Retorna o equipamento
            }
            atual = atual.next; // Move para o próximo nó
        }
        return null; // Retorna null se o equipamento não for encontrado
    }

    // Método para verificar se a lista está vazia
    public boolean isEmpty() {
        return head == null; // Retorna verdadeiro se a cabeça da lista for nulo
    }

    // Método para obter o tamanho da lista
    public int size() {
        int count = 0; // Inicializa o contador
        Node atual = head; // Cria um nó atual para percorrer a lista
        while (atual != null) { // Enquanto não chegar ao final da lista
            count++; // Incrementa o contador
            atual = atual.next; // Move para o próximo nó
        }
        return count; // Retorna o contador
    }
}



Main.java
public class Main {
    public static void main(String[] args) {
        ListaEncadeadaEquipamentos listaEquipamentos = new ListaEncadeadaEquipamentos(); // Cria uma lista encadeada de equipamentos

        // Cria alguns equipamentos (tratores)
        Equipamento trator1 = new Equipamento("Trator", "Modelo X", "TX123");
        Equipamento trator2 = new Equipamento("Colheitadeira", "Modelo Y", "CY456");
        Equipamento trator3 = new Equipamento("Plantadeira", "Modelo Z", "PZ789");

        // Adiciona os equipamentos à lista
        listaEquipamentos.add(trator1);
        listaEquipamentos.add(trator2);
        listaEquipamentos.add(trator3);

        // Exibe a lista de equipamentos
        System.out.println("Lista de Equipamentos:");
        listaEquipamentos.display();

        // Busca um equipamento pelo nome
        System.out.println("\nBuscar equipamento 'Colheitadeira':");
        Equipamento encontrado = listaEquipamentos.buscar("Colheitadeira");
        if (encontrado != null) { // Se o equipamento foi encontrado
            System.out.println("Equipamento encontrado: " + encontrado); // Imprime o equipamento encontrado
        } else { // Se o equipamento não foi encontrado
            System.out.println("Equipamento não encontrado."); // Imprime mensagem de não encontrado
        }

        // Remove um equipamento da lista
        System.out.println("\nRemover equipamento 'Trator':");
        listaEquipamentos.remove("Trator");
        listaEquipamentos.display(); // Exibe a lista após a remoção

        // Verifica o tamanho da lista
        System.out.println("\nTamanho da lista: " + listaEquipamentos.size());

        // Verifica se a lista está vazia
        System.out.println("A lista está vazia? " + listaEquipamentos.isEmpty());
    }
}
