package homework2;

/**
 * @author 张冬
 * @version 创建时间：2018年12月21日 上午9:19:22 解释:
 */
public class Dog implements Animal {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("我们一起学狗叫,一起汪汪 汪汪汪");
	}

	@Override
	public String getAnimaName() {
		// TODO Auto-generated method stub
		String name = "比特犬";
		System.out.println("狗的品种-->" + name);
		return name;
	}

}
