package main;

import java.util.ArrayList;
import java.util.List;

public class Venda {

    private String data;
    private List<ItemVenda> itensVenda = new ArrayList<>();
    private Cliente cliente;
    private Frete frete;
    private Funcionario funcionario;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<ItemVenda> getItemVenda() {
        return itensVenda;
    }

    public void setItemVenda(List<ItemVenda> itemVenda) {
        this.itensVenda = itemVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void addItem(ItemVenda itemVenda){
        this.itensVenda.add(itemVenda);
    }

    public String toString(){

/*        String itens = "";

        for (ItemVenda i : itensVenda){
            itens += i.toString();
        }*/

        return "data: " + data + ", cliente: " + cliente.toString() + ", itemVenda: " +  itensVenda.toString() +
                ", " + frete.toString() + ", Funcionario: " + funcionario.toString();
    }
}
