package it.engim.esempioesame.payload;

import it.engim.esempioesame.model.Linea;
import it.engim.esempioesame.model.Preventivo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LineaConPreventivo extends Linea {
    private String nomeDitta;
    private String nomePiano;
    private double prezzo;

    public LineaConPreventivo(Linea l, Preventivo p){
        super(l.getId(),l.getNome(),l.getFermate());
        nomeDitta = p.getAzienda();
        nomePiano= p.getPiano();
        prezzo = p.getPrezzo();
    }
}
