package codingway.reserva;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Reserva.class)
public abstract class Reserva_ {

	public static volatile SingularAttribute<Reserva, String> nomeAluno;
	public static volatile SingularAttribute<Reserva, Date> dataExpira;
	public static volatile SingularAttribute<Reserva, String> nomeLivro;
	public static volatile SingularAttribute<Reserva, Date> dataPrevista;
	public static volatile SingularAttribute<Reserva, Integer> idReserva;
	public static volatile SingularAttribute<Reserva, String> email;
	public static volatile SingularAttribute<Reserva, String> nomeAutor;
	public static volatile SingularAttribute<Reserva, String> status;

}

