package ch.clip.security6.simple.taskmanager.security.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Setter
@Getter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Benutzer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vorname;
    private String nachname;
    private String passwort;
    private String email;
    @OneToMany(mappedBy="benutzer")
    private ArrayList<Buchung> buchungen;


}
