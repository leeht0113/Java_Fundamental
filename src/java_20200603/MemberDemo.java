package java_20200603;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = new MemberDao();
		int num = 10;
		String name = "택진형1";
		String addr = "한국1";
		//MemberDto m = new MemberDto(num, name, addr);
		/*
		int resultCount = mdao.insert(new MemberDto(num, name, addr));
		if(resultCount==1) {
			System.out.println("정상적인 회원 가입이 되었습니다.");
		}else {
			System.out.println("오류..");
		}
		*/
		
		/*
		int resultCount = mdao.update(new MemberDto(num, name, addr));
		if(resultCount==1) {
			System.out.println("회원이 정상적으로 수정 되었습니다.");
		}else {
			System.out.println("오류..");
		}
		*/
		
		int resultCount = mdao.delete(num);
		if(resultCount==1) {
			System.out.println("회원이 정상적으로 삭제 되었습니다.");
		}else {
			System.out.println("오류..");
		}
		
		
		
		
		
		
		
		
	}
}