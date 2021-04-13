
package model;

import java.time.Instant;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subreddit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// @NotBlanck(message = "Post Name cannot be emty or Null")
	private String name;
	
	// @NotBlanck(message = "Post Name cannot be emty or Null")
	private String description;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Post> posts;
	
	private Instant createdDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	
}
