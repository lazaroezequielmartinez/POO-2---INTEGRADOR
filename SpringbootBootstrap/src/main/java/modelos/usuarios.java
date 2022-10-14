package modelos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dni")
    private Integer dni;
    @Column(name="nombre")
    private String nombres;
    @Column(name="apellido")
    private String apellidos;
    @Column(name="email")
    private String email;
    @Column(name="rol")
    private String rol;

}
