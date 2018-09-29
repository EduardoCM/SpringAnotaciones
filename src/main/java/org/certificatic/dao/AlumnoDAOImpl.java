package org.certificatic.dao;

import org.apache.log4j.Logger;
import org.certificatic.bean.Alumno;
import org.certificatic.bean.Test;
import org.springframework.stereotype.Repository;

@Repository
public class AlumnoDAOImpl implements AlumnoDAO {

	private static final Logger logger = 
			Logger.getLogger(AlumnoDAOImpl.class);
	
	@Override
	public void GuardarAlumno(Alumno almno) {
		logger.info("Guardando a la base de datos");
		logger.info(almno);
	}
	
	

}
