package design.demo.structural.装饰模式;

/**
 * 牛奶龟苓膏
 *
 * @author: lbo
 * @create: 2019/8/23 15:14
 * @version: 1.0
 * @email: lbo@oceansoft.com
 */
class MilkHerbalJelly extends Decorator {
    public MilkHerbalJelly(HerbalJelly herbalJelly) {
        super(herbalJelly);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("加牛奶");
    }
}