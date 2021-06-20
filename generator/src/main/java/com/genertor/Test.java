package com.genertor;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;


/**
 * @oauth: qiangSW
 * @date: 2020/1/17 12:51
 * @description: com.genertor
 * @doc:
 */
public class Test {

    public static void main(String[] args) {
        List<Map<String, Object>> list1 = Lists.newArrayList();

        List<Map<String, Object>> list2 = Lists.newArrayList();

        boolean b = list1.retainAll(list2);
        System.out.println(b);

    }
}
