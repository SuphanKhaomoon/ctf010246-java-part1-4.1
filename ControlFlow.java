package CTF01.Java.part1.No4_1;

public class ControlFlow
{

	public static void main(String[] args)
	{
//		1.ประกาศตัวแปร score = อะไรก็ได้
//			a. ถ้า score >= 80 ให้ print ว่า Good
//			b. ถ้า score >= 50 แต่น้อยกว่า 80 ให้ print ว่า normal
//			c. ถ้า score < 50 ให้ print ว่า fail
		
		int score = 60;
		if (score >= 80)
		{
			System.out.println("Good");
		}
		else if (score >= 50)
		{
			System.out.println("normal");
		}
		else if (score < 50)
		{
			System.out.println("fail");
		}
		
//		2. จากข้อ 1 ให้ประกาศตัวแปร boolean ว่า isHandSome เพิ่มเข้ามาเป็นค่าอะไรก็ได้
//			a. แก้โจทย์จาก ข้อ 2 ถ้าเกิด isHandSome = true แล้ว ไม่ว่าจะได้ score เท่าไหร่ก็จะ
//		print Good ตลอด
		
		boolean isHandSome = true;
		score = 45;
		if (score >= 80 || isHandSome == true)
		{
			System.out.println("Good");
		}
		else if (score >= 50)
		{
			System.out.println("normal");
		}
		else if (score < 50)
		{
			System.out.println("fail");
		}
		

	}

}
