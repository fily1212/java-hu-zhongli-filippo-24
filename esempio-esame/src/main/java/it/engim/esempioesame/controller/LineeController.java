package it.engim.esempioesame.controller;

import it.engim.esempioesame.model.Fermata;
import it.engim.esempioesame.model.Linea;
import it.engim.esempioesame.model.Preventivo;
import it.engim.esempioesame.payload.LineaConPreventivo;
import it.engim.esempioesame.repository.FermataRepository;
import it.engim.esempioesame.repository.LineaRepository;
import it.engim.esempioesame.repository.PreventivoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LineeController {

    @GetMapping("/linee")
    public List<LineaConPreventivo> getLinee(){
        List<LineaConPreventivo> lineeConP = new ArrayList<>();

        List<Linea> linee = LineaRepository.getLinee();
        List<Preventivo> preventivi =PreventivoRepository.getPreventivo();

         for (Linea l: linee){
             List<Preventivo> preventiviAmmissibili = new ArrayList<>();
             for (Preventivo p : preventivi){
                if(preventivoAmmissibile(l,p)){
                    preventiviAmmissibili.add(p);
                }
             }
             Preventivo pMinore = preventiviAmmissibili.get(0);
             for(Preventivo p: preventiviAmmissibili){
                 if(pMinore.getPrezzo()> p.getPrezzo())
                     pMinore = p;
             }
             lineeConP.add(new LineaConPreventivo(l,pMinore));


        }

        return lineeConP;
    }

    private boolean preventivoAmmissibile(Linea l, Preventivo p) {


        int nFermate = 0;
        int nExtraUrbane = 0;
        int nZone = 0;
        List<String> zoneViste = new ArrayList<>();
        for (Fermata f : l.getFermate()){
            nFermate++;
            if(!f.getZona().equals("U"))
                nExtraUrbane++;
            if(!zoneViste.contains(f.getZona())) {
                nZone++;
                zoneViste.add(f.getZona());
            }
        }
        return nFermate <= p.getMaxFermate() &&
                nExtraUrbane <= p.getMaxExtraurbane() &&
                nZone <= p.getMaxZone();
    }
}
