package com.zixue.CustomeGeneric_;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class CustomGeneric_ {
    public static void main(String[] args) {

    }
}
//Tiger  后面泛型，所以我们把 Tiger 称为自定义泛型类
//T,R,M 泛型标识符，
class Tiger<T,R,M>{
R r;  //属性可以使用泛型
T t;
M m;

    public Tiger(R r, T t, M m) {
        this.r = r;
        this.t = t;
        this.m = m;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public M getM() {//方法可以使用泛型
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

}