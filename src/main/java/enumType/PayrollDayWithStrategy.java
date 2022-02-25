package enumType;

import static enumType.PayrollDayWithStrategy.PayType.*;

public enum PayrollDayWithStrategy {

    MONDAY (WEEKDAY), TUESDAY (WEEKDAY),
    WEDNESDAY (WEEKDAY), THURSDAY (WEEKDAY), FRIDAY (WEEKDAY), SATURDAY(WEEKEND), SUNDAY (WEEKEND);

    private final PayType payType;

    PayrollDayWithStrategy(PayType payType) {
        this.payType = payType;
    }

    int pay (int minutesWorked, int payRate) {
        return payType.pay(minutesWorked, payRate);
    }

    enum PayType {
        WEEKDAY {
            @Override
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked <= MINUS_PER_SHIFT ?
                        0 : (minsWorked - MINUS_PER_SHIFT) * payRate / 2;
            }
        },

        WEEKEND {
            @Override
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked * payRate / 2;
            }
        };

        abstract int overtimePay(int mins, int payRate);
        private static final int MINUS_PER_SHIFT = 8 * 60;

        int pay(int minutesWorked, int payRate) {
            int basePay = minutesWorked * payRate;

            return basePay * overtimePay(minutesWorked, payRate);
        }
    }
}
