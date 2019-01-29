package homework2;

/**
 * @author 张冬
 * @version 创建时间：2018年12月21日 上午9:16:25 解释:
 */
public class Simulaor {

	public void playSound(Animal animal) {

		animal.cry();
		String animaName = animal.getAnimaName();
		System.out.println("动物的品种是--->"+animaName);
	}

}
