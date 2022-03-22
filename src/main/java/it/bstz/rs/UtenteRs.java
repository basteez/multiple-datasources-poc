package it.bstz.rs;

import it.bstz.entity.postgres.Utente;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/utenti")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UtenteRs {


    @GET
    public List<Utente> getUtenti(){
        return Utente.find("SELECT u FROM Utente u").list();
    }
}

