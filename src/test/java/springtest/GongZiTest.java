package springtest;

import com.jeramtough.jtlog.facade.L;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * <pre>
 * Created on 2022/1/21 下午12:13
 * by @author WeiBoWen
 * </pre>
 */
public class GongZiTest {

    public static void main(String[] args) {
        countDoubleSalary((7800 * 0.8) + 150);
//        countDoubleSalary((7800) * 0.8);
    }

    public static void countDoubleSalary(double mySalary) {
        int dayForDouble = 43;

        double daySalary = mySalary / 21.75;
        double hourSalary = daySalary / 8;

        //赔偿一半
        double salaryBan = mySalary / 2;
        L.debug("赔偿一半:" + new BigDecimal(salaryBan).setScale(2, RoundingMode.HALF_UP));

        //两种加班费
        double plusSalary1 = hourSalary * 10 * 2;
        double plusSalary2 = hourSalary * 8 * 1.5;
        //加班费合计
        double plusSalarySum = plusSalary1 + plusSalary2 ;
        L.debug("加班费:" + new BigDecimal(plusSalarySum).setScale(2, RoundingMode.HALF_UP));

        //双倍工资
        double doubeSalary = dayForDouble * daySalary;
        L.debug("双倍工资:" + new BigDecimal(doubeSalary).setScale(2, RoundingMode.HALF_UP));

        //2月份未支付工资
        double februarySalary=11*daySalary;
        februarySalary=februarySalary+plusSalarySum;
        L.debug("2月份未支付工资和加班费:" + new BigDecimal(februarySalary).setScale(2,
                RoundingMode.HALF_UP));

        double sum = doubeSalary + salaryBan ;
        L.debug(new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP));

        //总计
        L.debug("x加x:" + new BigDecimal(februarySalary+sum).setScale(2,
                RoundingMode.HALF_UP));
    }
}
