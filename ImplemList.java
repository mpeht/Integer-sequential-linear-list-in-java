/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist01;

/**
 *
 * @author mpeht
 */
public class ImplemList implements List {

    private int[] vet;
    private int begin, size, end, qtd;

    public ImplemList(int size) {
        this.begin = 0;
        this.end = 0;
        this.qtd = 0;
        this.size = size;
        this.vet = new int[size];
    }

    public int[] getVet() {
        return vet;
    }

    public void setVet(int[] vet) {
        this.vet = vet;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public boolean insert(int value) {
        if (!isFull()) {
            this.vet[end] = value;
            qtd++;
            end++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int remove(int sumary) {
        if (!isEmpty()) {
            for (int i = sumary; i < vet.length; i++) {
                int aux = vet[sumary + 1];
                vet[sumary] = aux;
            }
        } else {
        }
        qtd--;
        end--;
        return 0;
    }

    @Override
    public int replace(int newValue, int position) {
        int temp;
        if ((position < qtd)) {
            temp = vet[position];
            vet[position] = newValue;
        } else {

        }
        return 0;
    }

    @Override
    public int size() {
        return qtd;
    }

    @Override
    public boolean isEmpty() {
        if (qtd == 0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean isFull() {
        if (qtd == vet.length) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void toPrint() {
        int i;
        for (i = 0; i < vet.length; i++) {
            System.out.println("Item " + (i + 1) + " " + vet[i]);
        }
    }

}
