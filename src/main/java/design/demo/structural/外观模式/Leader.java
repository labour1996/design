package design.demo.structural.外观模式;

/**
 * @author: lbo
 * @create: 2019/8/23 15:55
 * @version: 1.0
 * @email: lbo@oceansoft.com
 */
public class Leader {
    private Developer developer = new Developer();
    private Tester tester = new Tester();
    public void processDemand(String name) {
        developer.develop(name);
        tester.test(name);
    }
}
