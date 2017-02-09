package net.danielmaly.scheme.builtin.io;

import com.oracle.truffle.api.dsl.GenerateNodeFactory;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import net.danielmaly.scheme.builtin.BuiltinExpression;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@NodeInfo(shortName = "read")
@GenerateNodeFactory
public abstract class Read extends BuiltinExpression {

    private BufferedReader bis;

    @Specialization
    public String read() {
        if(bis == null) {
            bis = new BufferedReader(new InputStreamReader(System.in));
        }
        try {
            return bis.readLine();
        } catch (IOException e) {
            return "<EOF>";
        }
    }
}
