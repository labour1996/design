package design.demo.structural.装饰模式;

/**
 * 龟苓膏装饰器
 *
 * @author: lbo
 * @create: 2019/8/23 15:13
 * @version: 1.0
 * @email: lbo@oceansoft.com
 */
abstract class Decorator extends HerbalJelly {
    private HerbalJelly herbalJelly;

    public Decorator(HerbalJelly herbalJelly) {
        this.herbalJelly = herbalJelly;
    }

    @Override
    public void process() {
        this.herbalJelly.process();
    }
}