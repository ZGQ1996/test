package homework1;

/**
 * @author 张冬
 * @version 创建时间：2018年12月20日 下午10:07:15 解释:
 */
public class Cube {

	private int length;// 长
	private int width;// 宽
	private int height;// 高

	public Cube(int a, int b, int c) {
		length = a;
		width = b;
		height = c;
	}

	public Cube(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// 设置长方体的高
	public int setHeight(int h) {
		return this.height = h;
	}

	// 计算长方体表面积
	public int area(Cube c) {
		return 2 * (c.length * c.width + c.length * c.height + c.width * c.height);
	}

	// 计算长方体体积
	public int volume(Cube c) {
		return c.width * c.length * c.height;
	}

	@Override
	public String toString() {
		return "Cube [length=" + length + ", width=" + width + ", height=" + height + "]";
	}

}
