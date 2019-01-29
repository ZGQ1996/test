package homework2;

/**
 * @author 张冬
 * @version 创建时间：2018年12月21日 上午9:20:18 解释:
 */
public class Cat implements Animal {

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("我们一起学猫叫,一起喵喵 喵喵喵");
	}

	@Override
	public String getAnimaName() {
		// TODO Auto-generated method stub
		String name = "波斯猫";
		System.out.println("猫的品种-->" + name);
		return name;
	}

}
