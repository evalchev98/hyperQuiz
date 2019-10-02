package HyperQuiz.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public class BaseEntity {
	private String id;

	public BaseEntity() {
	}

	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(
			name="system-uuid",
			strategy = "uuid"
	)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}