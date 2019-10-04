package com.teaching.enums;

public enum CourseCommentStatus {

    //type：类型：0-评论；1-答疑
    TYPE_COMMENT(0),
    TYPE_ANSWER(1),
    ;


    private int value;

    CourseCommentStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
