package design.demo.structural.适配器模式;

/**
 * @author: lbo
 * @create: 2019/8/23 15:41
 * @version: 1.0
 * @email: lbo@oceansoft.com
 */
/**
 * 充电器适配器
 */
class ChargerAdapter implements Target {
    private BritishCharger britishCharger;
    public ChargerAdapter(BritishCharger britishCharger) {
        this.britishCharger = britishCharger;
    }
    @Override
    public void chargeByChineseStandard() {
        System.out.println("使用中英式插头转换器");
        britishCharger.chargeByBritishStandard();
    }
}
