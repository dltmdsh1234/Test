package TsetCode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import maisSrc.Member;

public class TMember {
	//단위 테스트를 하기 위해서는 라이브러리(Junit)를 추가한다
	//Junit : 독립된 단위 테스트를 지원해 주는 프레임워크
	//  <사용되는 어노테이션>
	// @Test : @Test가 선언된 메서드가 테스트를 수행한다.
	// @Ignore : 테스트를 실행하지 않는다.
	// @Before : @Tset가 선언된 메서드가 실행되기 전에 수행
	// => sysout으로는 콘솔에 결과를 출력하지만
	//    단정(assert)메서드로 테스트의 결과를 판별한다.
	//    ->assertEquals(예산값, 실제값)
	//    위의 단정 메서드는 예상값과 실제값이 일치하면 성공, 일치X면 실패
	//
	//   Junit 메서드 종류
	// 1. assertEquals(a, b) - 객체 또는 값이 일치하는가?
	// 2. assertArrayEquals(a, b) - 배열의 값이 일치하는가?
	// 3. assertSame(a, b) - 같은 객체인가?
	// 4. assertTrue(a) - 조건이 참 인가?
	// 5. assertNotNull(a) - 객체가 Null이 아닌가?
	// 5. assertNull(a) - 객체가 Null인가?
	
	Member newMember;
	Member oldMember;
	
	@Test
	public void test1() {
//		System.out.println(newMember);
//		System.out.println(oldMember);
//		assertEquals(newMember, oldMember);
		if(newMember == null) {
			System.out.println("ok");
		}
		assertTrue(newMember == null);
	}
	
	@Before
	public void test2() {
		newMember = new Member();
		oldMember = new Member();
		
		
		System.out.println(newMember.add(5, 6));
	}
	
	
}
