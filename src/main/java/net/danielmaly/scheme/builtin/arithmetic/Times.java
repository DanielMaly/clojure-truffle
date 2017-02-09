package net.danielmaly.scheme.builtin.arithmetic;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

@NodeInfo(shortName = "*")
@GenerateNodeFactory
public abstract class Times extends BuiltinExpression {

    @Specialization
    public long times(long a, long b) {
        checkOverflow(a, b);
        return a * b;
    }

    @Specialization
    public double times(double a, double b) {
        return a * b;
    }

    private static void checkOverflow(long a, long b) {
        long maximum = Long.signum(a) == Long.signum(b) ? Long.MAX_VALUE : Long.MIN_VALUE;

        if (a != 0 && (b > 0 && b > maximum / a ||
                b < 0 && b < maximum / a))
        {
            throw new ArithmeticException("Operation " + a + " * " + b + " has overflowed");
        }
    }

}
