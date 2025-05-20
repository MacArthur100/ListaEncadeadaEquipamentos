public class ListaEncadeadaEquipamentos {
    Node head;

    public ListaEncadeadaEquipamentos() {
        this.head = null;
    }

    public void add(Equipamento equipamento) {
        Node novoNode = new Node(equipamento);
        if (head == null) {
            head = novoNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = novoNode;
        }
    }

    public void display() {
        Node atual = head;
        while (atual != null) {
            System.out.print(atual.equipamento.getNome() + " (" + atual.equipamento.getModelo() + ") -> ");
            atual = atual.next;
        }
        System.out.println("null");
    }

    public void remove(String nome) {
        if (head == null) {
            return;
        }

        if (head.equipamento.getNome().equals(nome)) {
            head = head.next;
            return;
        }

        Node atual = head;
        Node anterior = null;
        while (atual != null && !atual.equipamento.getNome().equals(nome)) {
            anterior = atual;
            atual = atual.next;
        }

        if (atual != null) {
            anterior.next = atual.next;
        }
    }

    public Equipamento buscar(String nome) {
        Node atual = head;
        while (atual != null) {
            if (atual.equipamento.getNome().equals(nome)) {
                return atual.equipamento;
            }
            atual = atual.next;
        }
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Node atual = head;
        while (atual != null) {
            count++;
            atual = atual.next;
        }
        return count;
    }
}
