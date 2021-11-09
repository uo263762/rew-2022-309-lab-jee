package impl.tew.business.resteasy;

import java.util.List;

import com.tew.business.exception.EntityAlreadyExistsException;
import com.tew.business.exception.EntityNotFoundException;
import com.tew.business.resteasy.AlumnosServicesRs;
import com.tew.model.Alumno;

import impl.tew.business.classes.AlumnosAlta;
import impl.tew.business.classes.AlumnosBaja;
import impl.tew.business.classes.AlumnosBuscar;
import impl.tew.business.classes.AlumnosListado;
import impl.tew.business.classes.AlumnosUpdate;

public class AlumnosServicesRsImpl implements AlumnosServicesRs {

	public AlumnosServicesRsImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Alumno> getAlumnos() {
		// TODO Auto-generated method stub
		try {
			return new AlumnosListado().getAlumnos();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Alumno findById(Long id) throws EntityNotFoundException {
		// TODO Auto-generated method stub
		return new AlumnosBuscar().find(id);
	}

	@Override
	public void deleteAlumno(Long id) throws EntityNotFoundException {
		// TODO Auto-generated method stub
		new AlumnosBaja().delete(id);
	}

	@Override
	public void saveAlumno(Alumno alumno) throws EntityAlreadyExistsException {
		// TODO Auto-generated method stub
		new AlumnosAlta().save(alumno);
	}

	@Override
	public void updateAlumno(Alumno alumno) throws EntityNotFoundException {
		// TODO Auto-generated method stub
		new AlumnosUpdate().update(alumno);
	}

}
