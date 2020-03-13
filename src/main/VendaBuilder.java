package main;

import java.util.ArrayList;
import java.util.List;

public class VendaBuilder {

    private Venda venda;

    public VendaBuilder(){
        this.venda = new Venda();
    }

    public VendaBuilder data(String data){
        venda.setData(data);
        return this;
    }

    public VendaBuilder clientePf(String nome, String cpf){
        Cliente pf = new ClientePF(nome, cpf);
        venda.setCliente(pf);
        return this;
    }

    public VendaBuilder clientePj(String rs, String cnpf){
        Cliente pj = new ClientePJ(rs, cnpf);
        venda.setCliente(pj);
        return this;
    }

    public VendaBuilder frete(Frete frete){
        venda.setFrete(frete);
        return this;
    }

    public VendaBuilder funcionario(String nome){
        Funcionario funcionario = new Funcionario(nome);
        venda.setFuncionario(funcionario);
        return this;
    }

    public VendaBuilder item(ItemVenda itemVenda){
        venda.addItem(itemVenda);
        return this;
    }

    public Venda build(){
        return this.venda;
    }
}
