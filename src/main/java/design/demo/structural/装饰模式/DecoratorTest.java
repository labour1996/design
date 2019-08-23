package design.demo.structural.装饰模式;

/**
 * @author: lbo
 * @create: 2019/8/23 15:14
 * @version: 1.0
 * @email: lbo@oceansoft.com
 */
public class DecoratorTest {
    public static void main(String[] args) {
        CommonHerbalJelly commonHerbalJelly = new CommonHerbalJelly
                ();
        HoneyHerbalJelly honeyHerbalJelly = new HoneyHerbalJelly(commonHerbalJelly);
        // 小明的蜂蜜龟苓膏
        honeyHerbalJelly.process();
        MilkHerbalJelly milkHerbalJelly = new MilkHerbalJelly(honeyHerbalJelly);
        // 小红的蜂蜜牛奶龟苓膏
        milkHerbalJelly.process();
    }
}
