//TÁ BOM AFONSO, TÁ BOM.
//SUBCLASSE OU CLASSE-FILHO
public class Casa extends Residencia{
    private String tipo;
    private String fundo;
        
        @Override
    public String exibir(){
        
        return super.exibir() +       
                "\nTipo: " + tipo + 
                "\nFundo: " + fundo;
       
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFundo() {
        return fundo;
    }

    public void setFundo(String fundo) {
        this.fundo = fundo;
    }
    
}



