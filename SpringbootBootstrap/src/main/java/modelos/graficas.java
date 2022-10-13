package modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "graficas")
public class graficas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_grafica", nullable = false)
    private Integer id;
    @Column(name="nombre", nullable = false, length = 45)
    private String nombre;
    @Column(name="razon_social")
    private Integer razon_social;
    @Column(name="calle")
    private String calle;
    @Column(name="altura")
    private String altura;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(Integer razon_social) {
        this.razon_social = razon_social;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }
}

