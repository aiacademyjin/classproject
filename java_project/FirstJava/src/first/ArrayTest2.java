package first;

public class ArrayTest2 {

	public static void main(String[] args) {

		// 2차원 배열의 선언 : 자료형[][] 배열의 이름
		int[][] arr = null;
		
		// 2차원 배열의 생성 : new 자료형[행의 개수][열의 개수]
		arr = new int[3][4];
		
		// 2차원 배열의 참조 : 배열이름[행의 index][열의 index]  , index는 0부터 시작
		arr[0][0] = 10;	// 데이터 저장
		System.out.println("arr[0][0] => "+arr[0][0]);
		arr[1][3] = 13;
		System.out.println("arr[1][3] => "+arr[1][3]);
		
		// 2차원 배열은 1차원 배열을 가지는 배열이다
		System.out.println(arr.length);		// 2차원 배열 arr의 length 값은 1차원 배열의 개수를 가진다.
											// arr의 length 값은 2차원 배열의 행의 개수다
		System.out.println(arr[0].length);	// arr[0]는 첫번째 1차원배열을 가르키는 주소값을 저장하는 변수이다.
		System.out.println(arr[1].length);	// arr[1]는 두번째 1차원배열을 가르키는 주소값을 저장하는 변수이다.
		System.out.println(arr[2].length);  // arr[2]는 세번째 1차원배열을 가르키는 주소값을 저장하는 변수이다.

		
		System.out.println("2차원 배열의 요소 출력 ========================");
		// for 반복문을 이용해서 2차원 배열의 모든 요소를 참조	
		showData(arr);
//		for(int i=0; i<arr.length; i++) {	// 0, 1, 2
//			for(int j=0; j<arr[i].length; j++) {	// 0, 1, 2, 3
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		System.out.println("2차원 배열의 모든 요소에 데이터 저장 ========================");
		// 전체 요소에 값을 대입
		for(int i=0; i<arr.length; i++) {	// 0, 1, 2
			for(int j=0; j<arr[i].length; j++) {	// 0, 1, 2, 3
				arr[i][j] = i+j;
			}
		}
		
		System.out.println("2차원 배열의 요소 출력 ========================");
		showData(arr);
//		for(int i=0; i<arr.length; i++) {	// 0, 1, 2
//			for(int j=0; j<arr[i].length; j++) {	// 0, 1, 2, 3
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		// 가변배열
		int[][] arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[5];
		arr2[2] = new int[2];
		
		// 배열의 요소 출력
		System.out.println("가변 배열의 요소 출력 =====================");
		showData(arr2);
		
		String[][] place = new String[6][];
		place[0] = new String[2];
		place[1] = new String[4];
		place[2] = new String[3];
		place[3] = new String[3];
		place[4] = new String[3];
		place[5] = new String[3];
		
		System.out.println("자리 배치 =========================");
		showData(place);
		
		int[][] arr3 = {
				{1,2},
				{3,4,5},
				{6,7,8,9},
		};
		
		System.out.println("2차원 배열의 세로길이(1차원 배열의 개수) : " + arr3.length);
		for(int i=0; i<arr3.length ; i++ ) {
			System.out.println("arr3["+i+"].length : " + arr3[i].length);
		}
		
		// for-each 구문 : 배열의 원본 데이터의 수정이 아닌 일괄 참조의 목적일 때 사용할 수 있다.
		int[] arr4 = {1,2,3,4,5};
		
		int sum=0;		
		for(int n : arr4) {
			//System.out.println(n);
			sum += n;
		}
		
		System.out.println("배열 arr4의 요소들의 합 : " + sum);
		
		// for-each에서의 값의 변경 -> 배열에는 영향을 주지 않는다.
		for(int n : arr4) {
			n++;
			System.out.println(n);
		}
		
		System.out.println("============================");
		
		for(int n : arr4) {
			System.out.println(n);
		}
		
		
		
		
		
		
		
	}
	
	// 정수형 2차원 배열을 전달 받아 
	// 모든 요소의 값을 출력하는 메서드, 
	// 반환하는 데이터는 없다
	static void showData(int[][] arr) {
		
		System.out.println("2차원 배열의 요소 출력 ========================");
		for(int i=0; i<arr.length; i++) {	// 0, 1, 2
			for(int j=0; j<arr[i].length; j++) {	// 0, 1, 2, 3
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}
	
	static void showData(String[][] arr) {
		
		System.out.println("2차원 배열의 요소 출력 ========================");
		for(int i=0; i<arr.length; i++) {	// 0, 1, 2
			for(int j=0; j<arr[i].length; j++) {	// 0, 1, 2, 3
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}










