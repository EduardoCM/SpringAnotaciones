package org.certificatic.service;

import org.apache.log4j.Logger;
import org.certificatic.bean.Alumno;
import org.certificatic.dao.AlumnoDAO;
import org.certificatic.dao.AlumnoDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	private static final Logger logger = 
			Logger.getLogger(AlumnoServiceImpl.class);
	
	@Autowired
	AlumnoDAO alumnoDao;
	
	@Override
	public void GuardarAlumno(Alumno almno) {
		logger.info("Alumno Service");
		alumnoDao.GuardarAlumno(almno);
	}

	
}
