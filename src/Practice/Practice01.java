package Practice;

import javax.swing.JOptionPane;



public class Practice01 {
	
	public int num;
	
/*
	public int score (int num) {                                       //공동으로 쓸수 있는 B를 만들어준다.ex) public int/public String +이름(들어갈 단어의 형식)    //void=B1
		this.num=num;                                                  //리셋을 시켜줄수있는 this사용                       
		System.out.println("점수를 올리겠습니다.");                          //실행했을때 처음 나오는 문장
		return num++;                                                  //return을 사용하여 다시 위로 올리기                                     //void형식을 사용시에는 return문 사용안함;
	}                                                                                                                                   //여기서 뽑아준다 syso 값만큼 내려준다.
	*/
	public void score (int num) {                                   
		this.num=num;                                                             
		System.out.println("점수를 내리겠습니다.");      
		System.out.println("소리를 "+num+"만큼 내리겠습니다.");                                           
		                                                 
	}
	
	
	/*
	public static void main(String[] args) {                           //원래방 A
		Practice01 prc=new Practice01();                               //새로운 클래스b                                                     //새로운 클래스b
		int num=prc.score(8);                                          //b를 c에 넣어준다.                                                  //b.B1(값)
		System.out.println("점수를 "+num+"만큼 올립니다.");                  //c를 뽑아낸다.
		*/
		
		public static void main(String[] args) {                          
			Practice01 prc=new Practice01();                              
			prc.score(9);
			
		

	}//main

}//class
