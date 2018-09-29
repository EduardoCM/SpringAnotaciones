package org.certificatic.bean;

import org.apache.log4j.Logger;
import org.certificatic.service.AlumnoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static final Logger logger = 
			Logger.getLogger(Test.class);
	
	
	public static void main(String[] args) {
		
	ApplicationContext appContext = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		Alumno alumno = (Alumno) appContext.getBean("alumno");
	
		AlumnoService alumnoService = (AlumnoService) appContext.getBean("alumnoServiceImpl");
		
		alumnoService.GuardarAlumno(alumno);
		
		((ClassPathXmlApplicationContext)appContext).close();
	}

}










