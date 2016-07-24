package com.example.bernieshi.demoapplication;

import java.util.List;

import rx.subjects.Subject;

/**
 * Created by bernie.shi on 2016/7/24.
 */
public class DemoTextUtil {
    public static boolean isEmpty(List<Subject> subjectList) {
        boolean isEmpty = subjectList.isEmpty() ? true : false;
        return isEmpty;
    }
}
