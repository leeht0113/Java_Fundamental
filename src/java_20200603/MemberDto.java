package java_20200603;
//Member 테이블의 데이터를 관리하기 위한 클래스
//Member 테이블의 칼럼(num, name, addr)을 멤버변수로 정하면 됨.
//DTO : Data Transfer Object
public class MemberDto {
	private String addr;
	private String name;
	private int num;
	//default constructor
		//alt + shift + s => c
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	//alt + shift + s => o
	public MemberDto(int num,String name,String addr) {
		super();
		this.addr = addr;
		this.name = name;
		this.num = num;
	}
	//alt + shift + r => 
	public String getAddr() {
		return addr;
	}
	

	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
}
