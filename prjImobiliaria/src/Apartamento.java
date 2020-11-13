//TÁ BOM AFONSO, TÁ BOM.
//SUBCLASSE OU CLASSE-FILHO
public class Apartamento extends Residencia{
    private String complemento;
    private int bloco;
    
    @Override
    public String exibir(){
        
        return super.exibir() +       
                "\nComplemento: " + complemento + 
                "\nBloco: " + bloco;
       
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    
    
    
}



