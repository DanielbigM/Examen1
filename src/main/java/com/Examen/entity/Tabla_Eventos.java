package com.Examen.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "historial_de_conciertos")
public class Tabla_Eventos implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
    private String artista;
    private int costoDolares;
    private String fecha;
    private int CatidadMaxima;
    private String lugar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getCostoDolares() {
        return costoDolares;
    }

    public void setCostoDolares(int costoDolares) {
        this.costoDolares = costoDolares;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCatidadMaxima() {
        return CatidadMaxima;
    }

    public void setCatidadMaxima(int CatidadMaxima) {
        this.CatidadMaxima = CatidadMaxima;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    
}
