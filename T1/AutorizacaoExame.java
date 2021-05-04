package T1;

import java.sql.Date;

public class AutorizacaoExame {

    //atributos
    private int codAut;
    private Date dataCadastro;
    private Object medicoSoli;
    private Object paciente;
    private Object exameSoli;


    //metodos principais


    //metodos especiais
    public int getCodAut() {
        return codAut;
    }

    public void setCodAut(int codAut) {
        this.codAut = codAut;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Object getMedicoSoli() {
        return medicoSoli;
    }

    public void setMedicoSoli(Object medicoSoli) {
        this.medicoSoli = medicoSoli;
    }

    public Object getPaciente() {
        return paciente;
    }

    public void setPaciente(Object paciente) {
        this.paciente = paciente;
    }

    public Object getExameSoli() {
        return exameSoli;
    }

    public void setExameSoli(Object exameSoli) {
        this.exameSoli = exameSoli;
    }

    




}