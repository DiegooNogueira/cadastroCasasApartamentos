//TÁ BOM AFONSO, TÁ BOM.
//SUPERCLASSE OU CLASSE-PAI
public class Residencia {
  
    private String proprietario;
    private String rua;
    private int    numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String UF;
    
    public String exibir(){
        return "Proprietario: " + proprietario   +
               "\nRua: "        + rua            +
               "\nNúmero: "     + numero         +
               "\nCep: "        + cep            +
               "\nBairro: "     + bairro         +
               "\nCidade: "     + cidade         +
               "\nUF: "         + UF;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    
    
}


