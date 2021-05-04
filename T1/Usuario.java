package T1;
public abstract class Usuario {

    //atributos
    private int codUsuario;
    private String nome;
    private Object tipo;



    //metodos especiais
    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario){
        this.codUsuario = codUsuario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Object getTipo(){
        return tipo;
    }

    public void setTipo(Object tipo){
        this.tipo = tipo;
    }
    
}