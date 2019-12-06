package cn.sm1234.domain;

public class Yuangong {
	private Integer id;
	private Integer yuangongid;
	private String yuangongname;
	private String yuangongsex;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getYuangongid() {
		return yuangongid;
	}
	public void setYuangongid(Integer yuangongid) {
		this.yuangongid = yuangongid;
	}
	public String getYuangongname() {
		return yuangongname;
	}
	public void setYuangongname(String yuangongname) {
		this.yuangongname = yuangongname;
	}
	public String getYuangongsex() {
		return yuangongsex;
	}
	public void setYuangongsex(String yuangongsex) {
		this.yuangongsex = yuangongsex;
	}
	@Override
	public String toString() {
		return "Yuangong [id=" + id + ", yuangongid=" + yuangongid + ", yuangongname=" + yuangongname + ", yuangongsex="
				+ yuangongsex + "]";
	}
	
	
}
