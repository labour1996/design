package design.demo.structural.装饰模式;

/**
 * 蜂蜜龟苓膏
 *
 * @author: lbo
 * @create: 2019/8/23 15:13
 * @version: 1.0
 * @email: lbo@oceansoft.com
 */

class HoneyHerbalJelly extends Decorator {
    public HoneyHerbalJelly(HerbalJelly herbalJelly) {
        super(herbalJelly);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("加蜂蜜");
    }
}