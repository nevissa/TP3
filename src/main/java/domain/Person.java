package domain;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

@Entity
public class Person {
	@Id
	private ObjectId id;
	private String name;
	private List<Adresse>adresses;

}
