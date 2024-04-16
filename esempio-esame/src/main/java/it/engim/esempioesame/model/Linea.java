package it.engim.esempioesame.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class Linea {

    private int id;
    private String nome;
    private List<Fermata> fermate;

}
