package chessoracle;

public class Lista {

    private node head = null;

    public Lista() {
    }

    public Lista(node head) {
        this.head = head;
    }

    public void setHead(Object value) {
        head.setValue(value);
    }

    public Object getHead() {
        return head.getValue();
    }

    public void insert(int posicion, Object value) {
        node referencia = head;
        if (this.size() <= posicion) {
            for (int i = 0; i < posicion; i++) {
                if (referencia.hasNext()) {
                    referencia = referencia.getNext();
                } else {
                    System.out.println("Array Index Out Of Bound");
                }
            }
            node siguiente = referencia.getNext();
            referencia.setNext(new node(value, null));
            referencia = referencia.getNext();
            referencia.setNext(siguiente);
        }
    }

    public Object at(int posicion) {
        node temp = head;

        for (int i = 0; i < posicion; i++) {
            if (temp.hasNext()) {
                temp = temp.getNext();
            } else {
                break;
            }
        }

        return temp.getValue();
    }

    public void erase(int posicion) {
        node temp = head;
        if (posicion ==-1) {
            posicion++;
        }
        if (posicion != 0) {
            for (int i = 1; i < posicion; i++) {
                temp = temp.getNext();
            }
            if (temp.hasNext()) {
                node eliminado = temp.getNext();
                temp.setNext(eliminado.getNext());
            } else {
                head = null;
            }
        }else{
            node nuevo_head=head.getNext();
            head = nuevo_head;
        }
    }

    public void concat(Lista lista) {
        node temp = head;

        while (temp.hasNext()) {
            temp = temp.getNext();
        }
        temp.setNext(lista.first());
    }

    public Object find(Object value) {
        node temp = head;
        int cont = 0;
        boolean esta = false;
        boolean salir = false;
        while (!salir) {
            if ((temp.getValue()) == value) {
                salir = true;
                esta = true;
            } else {
                temp = temp.getNext();
                cont++;
            }
        }

        if (esta) {
            return cont - 1;
        } else {
            return -1;
        }
    }

    public int size() {
        int cont = 0;
        node temp = head;
        if (head != null) {
            cont++;
            while (temp.hasNext()) {
                if (temp.hasNext()) {
                    temp = temp.getNext();
                    cont++;
                }
            }
            return cont;
        } else {
            return 0;
        }
    }

    public void push_back(Object value) {
        node temp = head;
        if (head != null) {
            while (temp.hasNext()) {
                temp = temp.getNext();
            }
            temp.setNext(new node(value, null));
        } else {
            head = new node(value, null);
        }
    }

    public node first() {
        return head;
    }
}
