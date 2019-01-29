package homework1;

/**
 * @author 张冬
 * @version 创建时间：2018年12月20日 下午10:07:38 解释:
 */
public class MulTab {

	public static void main(String[] args) {
		ShowMT();
	}

	public static void ShowMT() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + j * i + "	");
				try {
					Thread.sleep(1000);// 休眠一分钟
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.print("\n");

		}
	}
}
