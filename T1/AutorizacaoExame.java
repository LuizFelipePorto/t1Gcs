package T1;

import java.sql.Date;
import java.util.Scanner;

public class AutorizacaoExame {

    //atributos e construtor
    private int codAut;
    private Date dataCadastro;
    private Object medicoSoli;
    private Object paciente;
    private Object exameSoli;

    Scanner sc = new Scanner(System.in);


    public AutorizacaoExame() {
        System.out.println("Iniciando autorização de exame...");
        System.out.print("Defina um código: ");
        setCodAut(codAut);
        System.out.print("Defina uma data de cadastro: ");
        setDataCadastro(dataCadastro);
        System.out.print("Defina o médico: ");
        setMedicoSoli(medicoSoli);
        System.out.print("Defina o paciente: ");
        setPaciente(paciente);
        System.out.print("Defina o tipo de exame: ");
        setExameSoli(exameSoli);
    }
    

    //metodos principais


    //metodos especiais
    public int getCodAut() {
        return codAut;
    }

    public void setCodAut(int codAut) {
        this.codAut = sc.nextInt();
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
        this.medicoSoli = sc.next();
    }

    public Object getPaciente() {
        return paciente;
    }

    public void setPaciente(Object paciente) {
        this.paciente = sc.next();
    }

    public Object getExameSoli() {
        return exameSoli;
    }

    public void setExameSoli(Object exameSoli) {
        this.exameSoli = sc.next();
    }


    @Override
    public String toString() {
        return "{" +
            " codAut='" + getCodAut() + "'" +
            ", dataCadastro='" + getDataCadastro() + "'" +
            ", medicoSoli='" + getMedicoSoli() + "'" +
            ", paciente='" + getPaciente() + "'" +
            ", exameSoli='" + getExameSoli() + "'" +
            "}";
    }
    

    

    




}