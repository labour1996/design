package design.demo.structural.外观模式;

/**
 * 需求同学
 *
 * @author: lbo
 * @create: 2019/8/23 15:51
 * @version: 1.0
 * @email: lbo@oceansoft.com
 */
class Demander {
    private Developer developer = new Developer();
    private Tester tester = new Tester();

    public void demand(String name) {
        System.out.println("提需求：" + name);
        developer.develop(name);
        tester.test(name);
    }
}
