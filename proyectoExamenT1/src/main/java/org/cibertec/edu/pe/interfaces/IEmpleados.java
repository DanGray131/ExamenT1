package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.modelo.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleados extends JpaRepository<Empleados, Integer>{
	
}
