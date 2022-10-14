package modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="usuarios")
public class Usuarios {
    @Id
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

    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Sucursales sucursal;

}
