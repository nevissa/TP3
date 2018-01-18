package domain;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

@Entity
public class Article {
	@Id
	private ObjectId id;
	private int stars;
	private String name;
	private List<Person>buyers;

	
	

}
