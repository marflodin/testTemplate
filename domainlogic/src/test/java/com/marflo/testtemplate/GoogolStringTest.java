package com.marflo.testtemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class GoogolStringTest {

    GoogolString googolString = new GoogolString();
    String string;

    public GoogolStringTest(String string) {
        this.string = string;
    }

    @Parameterized.Parameters
    public static List<String> data() {
        List<String> parameters = new ArrayList<>();
        parameters.add("1");
        parameters.add("28314");
        return parameters;
    }

    @Test
    public void testSwitch() throws Exception {
        String result = googolString.switchString(string);
        System.out.println(result);
    }
}
