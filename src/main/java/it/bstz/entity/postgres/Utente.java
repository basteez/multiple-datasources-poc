package it.bstz.entity.postgres;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="utenti")
public class Utente extends PanacheEntityBase {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column()
    public String uuid;

    @Column
    public String username;

    @Column
    public String nome;

    @Column
    public String cognome;
}
