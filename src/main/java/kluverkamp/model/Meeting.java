package kluverkamp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name="meetings")
public class Meeting {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private int id;
	
	@Column(name="name", unique = true, nullable = false)
	private String name;
	
	@Column(name="location")
	private String location;
	
	@ManyToMany(mappedBy="meetings")
	private Set<User> users = new HashSet<User>();

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
 
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
    
    
	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("id : ").append(getId());
		strBuff.append(", name : ").append(getName());

		return strBuff.toString();
	}
}
