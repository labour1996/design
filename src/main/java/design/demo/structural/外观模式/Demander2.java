package design.demo.structural.外观模式;

/**
 * @author: lbo
 * @create: 2019/8/23 15:55
 * @version: 1.0
 * @email: lbo@oceansoft.com
 */
public class Demander2 {

    private Leader leader = new Leader();

    public void demand(String name) {
        System.out.println("提需求：" + name);
       leader.processDemand(name);
    }
}
