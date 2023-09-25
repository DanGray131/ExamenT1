package org.cibertec.edu.pe.services;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadosService;
import org.cibertec.edu.pe.interfaces.IEmpleados;
import org.cibertec.edu.pe.modelo.Empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadosService implements IEmpleadosService{

	@Autowired
	private IEmpleados data;
	
	@Override
	public List<Empleados> Listado() {
		return (List<Empleados>)data.findAll();
	}

	@Override
	public int grabar(Empleados e) {
		int res = 0;
		Empleados ObjA = data.save(e);
		if(ObjA.equals(null))res = 1;
		return res;
	}

}
