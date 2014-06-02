package kluverkamp.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * Role Entity
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
@Entity
@Table(name="roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private int id;
	
	@Column(name="name", unique = true, nullable = false)
	private String name;
	
    @OneToMany(mappedBy="role")
    private List<User> users;

	/**
	 * Get Role Id
	 * 
	 * @return int - Role Id
	 */

	public int getId() {
		return id;
	}
	
	/**
	 * Set Role Id
	 * 
	 * @param int - Role Id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Get Role Name
	 * 
	 * @return String - Role Name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set Role Name
	 * 
	 * @param String - Role Name
	 */
	public void setName(String name) {
		this.name = name;
	}
 
    
    
	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("id : ").append(getId());
		strBuff.append(", name : ").append(getName());

		return strBuff.toString();
	}
}
