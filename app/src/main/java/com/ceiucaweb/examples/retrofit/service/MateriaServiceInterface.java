package com.ceiucaweb.examples.retrofit.service;

import com.ceiucaweb.examples.retrofit.domain.Materia;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Servicio para llamadas REST de Materias
 * Created by juanma on 12/09/14.
 */
public interface MateriaServiceInterface {

    @GET("/Materias")
    List<Materia> getMaterias();

}
