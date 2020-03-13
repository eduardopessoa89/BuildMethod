package test;

import main.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class VendaTest {

    @Test
    public void vendaBuilderPF(){
        Produto produto = new Produto("Banana", 12.30);
        ItemVenda itemVenda = new ItemVenda(5, produto);

        Frete frete = new Frete(12.00);

        Venda venda = new VendaBuilder()
                .data("15/10/2020")
                .clientePf("eduardo", "123456")
                .item(itemVenda)
                .funcionario("Jack")
                .frete(frete)
                .build();

        assertEquals("data: 15/10/2020, cliente: nome: eduardo, cpf: 123456, " +
                        "itemVenda: [quantidade: 5, descrição: Banana, preço: 12.3], Frete: 12.0, Funcionario: Jack",
                venda.toString());
    }

    @Test
    public void vendaBuilderPJ(){
        Produto produto = new Produto("Toalhas de papel", 13.90);
        Frete frete = new Frete(152.20);

        ItemVenda itemVenda = new ItemVenda(50, produto);

        Venda venda = new VendaBuilder()
                .data("12/05/1999")
                .funcionario("Eli")
                .clientePj("Empresa Ltda", "14523654")
                .frete(frete)
                .item(itemVenda)
                .build();

        assertEquals("data: 12/05/1999, cliente: razão social: Empresa Ltda, cnpj: 14523654, " +
                        "itemVenda: [quantidade: 50, descrição: Toalhas de papel, preço: 13.9], Frete: 152.2, Funcionario: Eli",
                venda.toString());
    }

    @Test
    public void vendaBuilderPFMaisDeUmItem(){
        Produto produto = new Produto("Banana", 12.30);
        Produto produto1 = new Produto("Maça", 15.50);
        ItemVenda itemVenda = new ItemVenda(5, produto);
        ItemVenda itemVenda1 = new ItemVenda(8, produto1);

        Frete frete = new Frete(12.00);

        Venda venda = new VendaBuilder()
                .data("15/10/2020")
                .clientePf("eduardo", "123456")
                .item(itemVenda)
                .item(itemVenda1)
                .funcionario("Jack")
                .frete(frete)
                .build();

        assertEquals("data: 15/10/2020, cliente: nome: eduardo, cpf: 123456, " +
                        "itemVenda: [quantidade: 5, descrição: Banana, preço: 12.3, quantidade: 8, descrição: Maça, preço: 15.5], Frete: 12.0, Funcionario: Jack",
                venda.toString());
    }
}
