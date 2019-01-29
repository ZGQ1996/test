package homework1;

/**
 * @author 张冬
 * @version 创建时间：2018年12月20日 下午10:06:34 解释:
 */
public class User {

	public static void main(String[] args) {

		Cube cube1 = new Cube(1, 2, 3);

		Cube cube2 = new Cube(4, 5);

		cube2.setHeight((int) (1 + Math.random() * (10 - 1 + 1)));//从1到10的int型随数

		int area = cube1.area(cube1);
		int volume = cube1.volume(cube1);

		System.out.println("面积1------>:" + area + "体积1------>:" + volume);

		int area2 = cube2.area(cube2);
		int volume2 = cube2.volume(cube2);

		System.out.println("面积2------>:" + area2 + "体积2------>:" + volume2);
	}

}
