package com.bsoftgroup.springcloudmanagementproperties.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsoftgroup.springcloudmanagementproperties.conexion.ConfiguracionDataSource;
import com.bsoftgroup.springcloudmanagementproperties.conexion.DatosConexion;

@RestController
public class DatosConexionController {
	@Autowired
	private ConfiguracionDataSource service;
	@GetMapping(path="/datosconexion")
	public DatosConexion getDatosConexion() {
	DatosConexion datosconexion= new DatosConexion
	(
	service.getDriverclassname(),
	service.getUrl(),
	service.getUsername(),
	service.getPassword());
	return datosconexion;
	}
}
