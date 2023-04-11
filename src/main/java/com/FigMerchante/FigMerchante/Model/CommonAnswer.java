package com.FigMerchante.FigMerchante.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "commonAnswer")
public class CommonAnswer {

    @Id
    @GeneratedValue
    private Integer id;

    private String question_1;
    private String question_2;
    private String question_3;
    private String question_4;
    private String question_5;
    private String question_6;
    private String question_7;
    private String question_8;
    private String question_9;
    private String question_10;
    private String question_11;
    private String question_12;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion_1() {
        return question_1;
    }

    public void setQuestion_1(String question_1) {
        this.question_1 = question_1;
    }

    public String getQuestion_2() {
        return question_2;
    }

    public void setQuestion_2(String question_2) {
        this.question_2 = question_2;
    }

    public String getQuestion_3() {
        return question_3;
    }

    public void setQuestion_3(String question_3) {
        this.question_3 = question_3;
    }

    public String getQuestion_4() {
        return question_4;
    }

    public void setQuestion_4(String question_4) {
        this.question_4 = question_4;
    }

    public String getQuestion_5() {
        return question_5;
    }

    public void setQuestion_5(String question_5) {
        this.question_5 = question_5;
    }

    public String getQuestion_6() {
        return question_6;
    }

    public void setQuestion_6(String question_6) {
        this.question_6 = question_6;
    }

    public String getQuestion_7() {
        return question_7;
    }

    public void setQuestion_7(String question_7) {
        this.question_7 = question_7;
    }

    public String getQuestion_8() {
        return question_8;
    }

    public void setQuestion_8(String question_8) {
        this.question_8 = question_8;
    }

    public String getQuestion_9() {
        return question_9;
    }

    public void setQuestion_9(String question_9) {
        this.question_9 = question_9;
    }

    public String getQuestion_10() {
        return question_10;
    }

    public void setQuestion_10(String question_10) {
        this.question_10 = question_10;
    }

    public String getQuestion_11() {
        return question_11;
    }

    public void setQuestion_11(String question_11) {
        this.question_11 = question_11;
    }

    public String getQuestion_12() {
        return question_12;
    }

    public void setQuestion_12(String question_12) {
        this.question_12 = question_12;
    }

    public String getQuestion_13() {
        return question_13;
    }

    public void setQuestion_13(String question_13) {
        this.question_13 = question_13;
    }

    public String getQuestion_14() {
        return question_14;
    }

    public void setQuestion_14(String question_14) {
        this.question_14 = question_14;
    }

    public String getQuestion_15() {
        return question_15;
    }

    public void setQuestion_15(String question_15) {
        this.question_15 = question_15;
    }

    public String getQuestion_16() {
        return question_16;
    }

    public void setQuestion_16(String question_16) {
        this.question_16 = question_16;
    }

    public String getQuestion_17() {
        return question_17;
    }

    public void setQuestion_17(String question_17) {
        this.question_17 = question_17;
    }

    public String getQuestion_18() {
        return question_18;
    }

    public void setQuestion_18(String question_18) {
        this.question_18 = question_18;
    }

    private String question_13;
    private String question_14;
    private String question_15;
    private String question_16;
    private String question_17;
    private String question_18;

}
