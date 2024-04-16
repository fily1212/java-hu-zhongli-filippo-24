package it.engim.esempioesame.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Preventivo {
    private int id;
    private String azienda;
    private String piano;
    private int maxFermate;
    private int maxExtraurbane;
    private int maxZone;
    private double prezzo;
}
