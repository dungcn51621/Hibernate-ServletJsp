package model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huypn
 * Crate java bean to show jsp
 */
public class EmployeeBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String age;
	private Date birthday;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
