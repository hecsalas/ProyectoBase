package com.example.miproyectobase2.ApiRegionComuna

import com.example.miproyectobase2.API.Alumno
import com.example.miproyectobase2.API.AlumnoInsertRequest
import com.example.miproyectobase2.API.ApiDuocClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object RegionComunaRepository {

    suspend fun fetchRegionComuna(): Result<List<RegionComuna>> = withContext(Dispatchers.IO) {
        try {
            Result.success(ApiDuocRegionComuna.service.getRegionComuna())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

}