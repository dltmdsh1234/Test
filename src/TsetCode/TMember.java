package TsetCode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import maisSrc.Member;

public class TMember {
	//���� �׽�Ʈ�� �ϱ� ���ؼ��� ���̺귯��(Junit)�� �߰��Ѵ�
	//Junit : ������ ���� �׽�Ʈ�� ������ �ִ� �����ӿ�ũ
	//  <���Ǵ� ������̼�>
	// @Test : @Test�� ����� �޼��尡 �׽�Ʈ�� �����Ѵ�.
	// @Ignore : �׽�Ʈ�� �������� �ʴ´�.
	// @Before : @Tset�� ����� �޼��尡 ����Ǳ� ���� ����
	// => sysout���δ� �ֿܼ� ����� ���������
	//    ����(assert)�޼���� �׽�Ʈ�� ����� �Ǻ��Ѵ�.
	//    ->assertEquals(���갪, ������)
	//    ���� ���� �޼���� ���󰪰� �������� ��ġ�ϸ� ����, ��ġX�� ����
	//
	//   Junit �޼��� ����
	// 1. assertEquals(a, b) - ��ü �Ǵ� ���� ��ġ�ϴ°�?
	// 2. assertArrayEquals(a, b) - �迭�� ���� ��ġ�ϴ°�?
	// 3. assertSame(a, b) - ���� ��ü�ΰ�?
	// 4. assertTrue(a) - ������ �� �ΰ�?
	// 5. assertNotNull(a) - ��ü�� Null�� �ƴѰ�?
	// 5. assertNull(a) - ��ü�� Null�ΰ�?
	
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
