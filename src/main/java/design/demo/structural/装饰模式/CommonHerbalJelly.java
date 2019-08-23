package design.demo.structural.装饰模式;

/**
 * @author: lbo
 * @create: 2019/8/23 15:12
 * @version: 1.0
 * @email: lbo@oceansoft.com
 */
class CommonHerbalJelly extends HerbalJelly {
    /**
     * 普通龟苓膏
     */
    @Override
    public void process() {
        System.out.println("盛一碗龟苓膏");
    }
}

