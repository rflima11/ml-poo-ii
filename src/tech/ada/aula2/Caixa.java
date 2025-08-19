package tech.ada.aula2;

public class Caixa<T> {

    private T item;

    public Caixa(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public <V> V getValue(V v) {
        return v;
    }
}
