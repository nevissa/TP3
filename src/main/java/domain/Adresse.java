package domain;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Adresse {
	@Id
	private ObjectId id;
	private String street;
	private String city;
	private String postCode;
	private String country;
	

}
