package ch.clip.security6.simple.taskmanager.security.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="")
public class Buchung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean akzeptiert;
    private Date anfangsDatum;
    private Date endDatum;
    private Platz platz;
    @ManyToOne
    @JoinColumn(name="benutzer_id",  nullable=false)
    private Benutzer benutzer;
}
