package kluverkamp.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinTable;

/**
 * 
 * User Entity
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID", unique = true, nullable = false)
	private int id;
	
	@Column(name="NAME", unique = true, nullable = false)
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;
	
	@ManyToMany(cascade = {CascadeType.ALL},fetch=FetchType.EAGER)
	@JoinTable(name="users_meetings",joinColumns={@JoinColumn(name="user_id")}, 
	               inverseJoinColumns={@JoinColumn(name="meeting_id")})
	private Set<Meeting> meetings = new HashSet<Meeting>();
	
	/**
	 * Get User Id
	 * 
	 * @return int - User Id
	 */

	public int getId() {
		return id;
	}
	
	/**
	 * Set User Id
	 * 
	 * @param int - User Id
	 */
	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Get User Name
	 * 
	 * @return String - User Name
	 */

	public String getName() {
		return name;
	}
	
	/**
	 * Set User Name
	 * 
	 * @param String - User Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

	public Role getRole() {
		return this.role;
	}
 
	public void setRole(Role role) {
		this.role = role;
	}
	

	public Set<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(Set<Meeting> meetings) {
		this.meetings = meetings;
	}

	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("id : ").append(getId());
		strBuff.append(", name : ").append(getName());
		return strBuff.toString();
	}
}
