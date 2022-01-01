package com.iflytek.lfasr.demo;

/**
 * 对应云服务返回的实体
 */
public class Entity {
    private String bg;          // 句子相对于本音频的起始时间，单位为ms
    private String ed;          // 句子相对于本音频的终止时间，单位为ms
    private String onebest;     // 句子内容
    private String speaker;     // 说话人编号，从1开始，未开启说话人分离时speaker都为0

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getEd() {
        return ed;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }

    public String getOnebest() {
        return onebest;
    }

    public void setOnebest(String onebest) {
        this.onebest = onebest;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "bg='" + bg + '\'' +
                ", ed='" + ed + '\'' +
                ", onebest='" + onebest + '\'' +
                ", speaker='" + speaker + '\'' +
                '}';
    }
}
