package Chapter02;

/* Soldesk 과수원
 * 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5개, 7개, 5개이다.
 * 과수원에서 하루에 생산되는 총 과일의 갯수를  출력하고, 시간당(24) 전체 과일의 평균 생산갯수를 출력하시오.
 * (단, 평균값을 담는 데이터 타입은 float으로 정의 한다.)
 */
public class Example_01 {

	public static void main(String[] args) {
		
		//변수방 선언
		int pear=5; 
		int apple=7;
		int orange=5;
						
		//총개수 변수방은 fruitTotal
		int fruitTotal=pear+apple+orange;
				
		System.out.println("하루에 생산되는 과일의 총 개수 :" + fruitTotal);
		
		//시간당 평균 (fruitAvg)
		float hour=24f;
		float fruitAvg=fruitTotal/hour;
				
		System.out.println("시간당 생산되는 과일의 평균값 :" + fruitAvg);
		
	}
	
}
