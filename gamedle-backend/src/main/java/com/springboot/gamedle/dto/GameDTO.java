package com.springboot.gamedle.dto;

import org.bson.types.ObjectId;

public class GameDTO {


    private ObjectId _id;
    private String nombre;
    private String compania;
    private int ano_lanzamiento;
    private String generos;
    private String plataforma;

    public GameDTO() {
    }

    public GameDTO( ObjectId _id, String nombre, String compania, int ano_lanzamiento, String generos, String plataforma) {
        this._id = _id;
        this.nombre = nombre;
        this.compania = compania;
        this.ano_lanzamiento = ano_lanzamiento;
        this.generos = generos;
        this.plataforma = plataforma;
    }

    public GameDTO( String nombre, String compania, int ano_lanzamiento, String generos, String plataforma) {
        this.nombre = nombre;
        this.compania = compania;
        this.ano_lanzamiento = ano_lanzamiento;
        this.generos = generos;
        this.plataforma = plataforma;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getAno_lanzamiento() {
        return ano_lanzamiento;
    }

    public void setAno_lanzamiento(int ano_lanzamiento) {
        this.ano_lanzamiento = ano_lanzamiento;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId id) {
        this._id = _id;
    }





}
