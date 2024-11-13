
package Eleicoes.classes;

import java.util.Date;


public class Voto {
    private String branco;
     private String valido;
     private Date dataVoto;

    public Voto() {
    }

    public Voto(String branco, String valido, Date dataVoto) {
        this.branco = branco;
        this.valido = valido;
        this.dataVoto = dataVoto;
    }

    public String getBranco() {
        return branco;
    }

    public void setBranco(String branco) {
        this.branco = branco;
    }

    public String getValido() {
        return valido;
    }

    public void setValido(String valido) {
        this.valido = valido;
    }

    public Date getDataVoto() {
        return dataVoto;
    }

    public void setDataVoto(Date dataVoto) {
        this.dataVoto = dataVoto;
    }
    
     
    
}
