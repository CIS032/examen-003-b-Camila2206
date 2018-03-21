
package Examen;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Camila Cueva
 */
@Entity
@Table(name = "PROFESORES", catalog = "", schema = "CAMILA")
@NamedQueries({
    @NamedQuery(name = "Profesores_1.findAll", query = "SELECT p FROM Profesores_1 p")
    , @NamedQuery(name = "Profesores_1.findByCedula", query = "SELECT p FROM Profesores_1 p WHERE p.cedula = :cedula")
    , @NamedQuery(name = "Profesores_1.findByNombres", query = "SELECT p FROM Profesores_1 p WHERE p.nombres = :nombres")
    , @NamedQuery(name = "Profesores_1.findByApellidos", query = "SELECT p FROM Profesores_1 p WHERE p.apellidos = :apellidos")
    , @NamedQuery(name = "Profesores_1.findByHorasClase", query = "SELECT p FROM Profesores_1 p WHERE p.horasClase = :horasClase")
    , @NamedQuery(name = "Profesores_1.findByCarrera", query = "SELECT p FROM Profesores_1 p WHERE p.carrera = :carrera")
    , @NamedQuery(name = "Profesores_1.findByTipoProfesor", query = "SELECT p FROM Profesores_1 p WHERE p.tipoProfesor = :tipoProfesor")
    , @NamedQuery(name = "Profesores_1.findByHorasComplementarias", query = "SELECT p FROM Profesores_1 p WHERE p.horasComplementarias = :horasComplementarias")})
public class Profesores_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CEDULA")
    private String cedula;
    @Column(name = "NOMBRES")
    private String nombres;
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Column(name = "HORAS_CLASE")
    private Integer horasClase;
    @Column(name = "CARRERA")
    private String carrera;
    @Column(name = "TIPO_PROFESOR")
    private String tipoProfesor;
    @Column(name = "HORAS_COMPLEMENTARIAS")
    private Integer horasComplementarias;

    public Profesores_1() {
    }

    public Profesores_1(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        String oldCedula = this.cedula;
        this.cedula = cedula;
        changeSupport.firePropertyChange("cedula", oldCedula, cedula);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        String oldNombres = this.nombres;
        this.nombres = nombres;
        changeSupport.firePropertyChange("nombres", oldNombres, nombres);
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        String oldApellidos = this.apellidos;
        this.apellidos = apellidos;
        changeSupport.firePropertyChange("apellidos", oldApellidos, apellidos);
    }

    public Integer getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(Integer horasClase) {
        Integer oldHorasClase = this.horasClase;
        this.horasClase = horasClase;
        changeSupport.firePropertyChange("horasClase", oldHorasClase, horasClase);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        String oldCarrera = this.carrera;
        this.carrera = carrera;
        changeSupport.firePropertyChange("carrera", oldCarrera, carrera);
    }

    public String getTipoProfesor() {
        return tipoProfesor;
    }

    public void setTipoProfesor(String tipoProfesor) {
        String oldTipoProfesor = this.tipoProfesor;
        this.tipoProfesor = tipoProfesor;
        changeSupport.firePropertyChange("tipoProfesor", oldTipoProfesor, tipoProfesor);
    }

    public Integer getHorasComplementarias() {
        return horasComplementarias;
    }

    public void setHorasComplementarias(Integer horasComplementarias) {
        Integer oldHorasComplementarias = this.horasComplementarias;
        this.horasComplementarias = horasComplementarias;
        changeSupport.firePropertyChange("horasComplementarias", oldHorasComplementarias, horasComplementarias);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesores_1)) {
            return false;
        }
        Profesores_1 other = (Profesores_1) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "examen_final_progra.Profesores_1[ cedula=" + cedula + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
