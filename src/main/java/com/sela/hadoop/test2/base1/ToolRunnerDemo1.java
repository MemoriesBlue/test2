package com.sela.hadoop.test2.base1;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import java.util.Map;

/**
 * Created by jianlan on 15-7-12.
 */
public class ToolRunnerDemo1 extends Configured implements Tool {
    @Override
    public int run(String[] strings) throws Exception {
        Configuration conf = getConf();
        for (Map.Entry<String, String> stringEntry : conf) {
            System.out.println(stringEntry.getKey() + " : " + stringEntry.getValue());
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        int code = ToolRunner.run(new ToolRunnerDemo1(), args);
        System.exit(code);
    }
}
