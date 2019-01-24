package Programa;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		// Insertar Objetos
		
		/*
		Festival f1 = new Festival();
		f1.setNombre("medusa");
		f1.setFecha("24/01/2019");
		f1.setLugar("Cullera");
		session.save(f1);
		
		Festival f2 = new Festival();
		f2.setNombre("Hibernate");
		f2.setFecha("24/01/2019");
		f2.setLugar("Catarroja");
		session.save(f2);
		
		Actuacion a1 = new Actuacion();
		a1.setEscenario("escenario");
		a1.setHora("15:00");
		session.save(a1);
		
		Actuacion a2 = new Actuacion();
		a2.setEscenario("Crealab");
		a2.setHora("15:30");
		session.save(a2);
		
		Grupo g1 = new Grupo();
		g1.setNombre("help");
		g1.setEstilo("rock");
		g1.setMiembros(3);
		session.save(g1);
		
		Grupo g2 = new Grupo();
		g2.setNombre("nombre");
		g2.setEstilo("estilo");
		g2.setMiembros(2);
		session.save(g2);
		*/
		
		// Recuperar Objetos
		
		/*
		Festival recuperarF1 = session.get(Festival.class, "medusa");
		System.out.println("He recuperado: Nombre del festival: "+recuperarF1.getNombre()+", Lugar: "+recuperarF1.getLugar()+", Fecha: "+recuperarF1.getFecha());
		Festival recuperarF2 = session.get(Festival.class, "Hibernate");
		System.out.println("He recuperado: Nombre del festival: "+recuperarF2.getNombre()+", Lugar: "+recuperarF2.getLugar()+", Fecha: "+recuperarF2.getFecha());
		
		Actuacion recuperarA1 = session.get(Actuacion.class, "15:00");
		System.out.println("He recuperado: Hora: "+recuperarA1.getHora()+", Escenario: "+recuperarA1.getEscenario());
		Actuacion recuperarA2 = session.get(Actuacion.class, "15:30");
		System.out.println("He recuperado: Hora: "+recuperarA2.getHora()+", Escenario: "+recuperarA2.getEscenario());
		
		Grupo recuperarG1 = session.get(Grupo.class, "help");
		System.out.println("He recuperado: Nombre del grupo: "+recuperarG1.getNombre()+", Estilo: "+recuperarG1.getEstilo()+", y Numero de miembros: "+recuperarG1.getMiembros());
		
		Grupo recuperarG2 = session.get(Grupo.class, "nombre");
		System.out.println("He recuperado: Nombre del grupo: "+recuperarG2.getNombre()+", Estilo: "+recuperarG2.getEstilo()+", y Numero de miembros: "+recuperarG2.getMiembros());
		*/
		
		//Intentar cambiar el nombre de la tabla
		
		/*
		Query q = session.createQuery("Update Lugar from festival to localizacion");
		*/
		session.getTransaction().commit();
		session.close();
		
		HibernateUtilities.getSessionFactory().close();

	}

}
