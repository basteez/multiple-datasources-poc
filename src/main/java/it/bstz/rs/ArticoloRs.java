package it.bstz.rs;

import it.bstz.entity.mysql.Articolo;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/articoli")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ArticoloRs {


    @GET
    public List<Articolo> getArticoli(){
        return Articolo.find("SELECT a FROM Articolo a").list();
    }
}
