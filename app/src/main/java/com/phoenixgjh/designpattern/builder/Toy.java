package com.phoenixgjh.designpattern.builder;

import java.util.List;

/**
 * 参考文章：http://www.imooc.com/article/6205
 * Created by Phoenix on 2017/4/7.
 */

public class Toy {
    private String head;
    private String body;
    private List<String> legs;
    private List<String> hands;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getLegs() {
        return legs;
    }

    public void setLegs(List<String> legs) {
        this.legs = legs;
    }

    public List<String> getHands() {
        return hands;
    }

    public void setHands(List<String> hands) {
        this.hands = hands;
    }

    static class Builder {
        private Toy toy;

        public Builder() {
            toy = new Toy();
        }

        public Builder setHead(String head) {
            toy.setHead(head);
            return this;
        }

        public Builder setBody(String body) {
            toy.setBody(body);
            return this;
        }

        public Builder setLegs(List<String> legs) {
            toy.setLegs(legs);
            return this;
        }

        public Builder setHands(List<String> hands) {
            toy.setHands(hands);
            return this;
        }

        public Toy build() {
            return toy;
        }
    }
}
