/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_AsignacionGestionCitas;

import java.sql.Date;
import java.util.List;

/**
 *
 * @author 
 * omar manjarres
 * jhon chaparro
 *              
 */
public class AsignacionGestionCita
{
    private String Usuario;
    private String Contraseña;
    private String Fecha_Creacion_cita;
    private String Hora;
    private List   CargarDatosP;
   
    // Actualizacion de datos;
    private String Nombre;
    private String Apellido;
    private String Fecha_nacimiento;
    private int    N_identificacion;
    private String Email;
    private String Direccion;
    private String Telefono;

    //constructor
    
    public AsignacionGestionCita(String Usuario, String Contraseña, String Fecha_Creacion_cita, String Hora, List CargarDatosP, String Nombre, String Apellido, String Fecha_nacimiento, int N_identificacion, String Email, String Direccion, String Telefono) {
        this.Usuario = Usuario;  
        this.Contraseña = Contraseña;
        this.Fecha_Creacion_cita = Fecha_Creacion_cita;
        this.Hora = Hora;
        this.CargarDatosP = CargarDatosP;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.N_identificacion = N_identificacion;
        this.Email = Email;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getFecha_Creacion_cita() {
        return Fecha_Creacion_cita;
    }

    public void setFecha_Creacion_cita(String Fecha_Creacion_cita) {
        this.Fecha_Creacion_cita = Fecha_Creacion_cita;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public List getCargarDatosP() {
        return CargarDatosP;
    }

    public void setCargarDatosP(List CargarDatosP) {
        this.CargarDatosP = CargarDatosP;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public int getN_identificacion() {
        return N_identificacion;
    }

    public void setN_identificacion(int N_identificacion) {
        this.N_identificacion = N_identificacion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
}
