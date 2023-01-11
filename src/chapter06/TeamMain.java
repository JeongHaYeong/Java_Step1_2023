package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team=new TeamGroup();
		TeamMember t=new TeamMember();
		//메서드를 통해서 팀명을 초기화
		t.setTeamName("스마일");
		System.out.println("팀명 : "+t.getTeamName());
		team.init(); //팀명준비
		team.Disp();
		
		t.setmName("신진혁");
		System.out.println("팀장명 : "+t.getmName());
		t.setMphone("010-XXXX-4078");
		System.out.println("팀장 전화번호 : "+t.getMphone());
		t.setsName("조현수");
		System.out.println("부 팀장명 : "+t.getsName());

		
	}

}
