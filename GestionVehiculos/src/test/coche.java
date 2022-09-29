/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Objects;

/**
 *
 * @author aniba
 */
public class coche {
    String Matricula;
    String Marca;
    String Modelo;
    String Color;
    Double Tarifa;
    Boolean Disponible;

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Double getTarifa() {
        return Tarifa;
    }

    public void setTarifa(Double Tarifa) {
        this.Tarifa = Tarifa;
    }

    public Boolean getDisponible() {
        return Disponible;
    }

    public void setDisponible(Boolean Disponible) {
        this.Disponible = Disponible;
    }

    @Override
    public String toString() {
        return "coche{" + "Matricula=" + Matricula + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", Tarifa=" + Tarifa + ", Disponible=" + Disponible + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.Matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final coche other = (coche) obj;
        if (!Objects.equals(this.Matricula, other.Matricula)) {
            return false;
        }
        return true;
    }

    public coche(String Matricula, String Marca, String Modelo, String Color, Double Tarifa, Boolean Disponible) {
        this.Matricula = Matricula;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Tarifa = Tarifa;
        this.Disponible = Disponible;
    }
    
    
    
    
}