package cn.sm1234.domain;

public class Customer {

	private Integer id;
	private String name;
	private String gender;
	private String telephone;
	private String address;
	private Integer yuangongid;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Integer getYuangongid() {
		return yuangongid;
	}
	public void setYuangongid(Integer yuangongid) {
		this.yuangongid = yuangongid;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", telephone=" + telephone
				+ ", address=" + address + ", yuangongid=" + yuangongid + "]";
	}
	
}
