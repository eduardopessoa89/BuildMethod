package main;

public class ClientePJ implements Cliente {

    private String razaoSocial;
    private String cnpj;

    public ClientePJ(String razaoSocial, String cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toString(){
        return "razão social: " + this.razaoSocial + ", cnpj: " + this.cnpj;
    }
}
