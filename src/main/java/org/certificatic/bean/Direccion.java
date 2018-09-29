package org.certificatic.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Direccion {

	private String calle;
	private String cp;

	public String getCalle() {
		return calle;
	}

	@Autowired
	public void setCalle(@Value("New York" )String calle) {
		this.calle = calle;
	}

	public String getCp() {
		return cp;
	}

	@Autowired
	public void setCp(@Value("55667")String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", cp=" + cp + "]";
	}

}
