package com.hsm.base;

import lombok.Data;

/**
 * 参数传递
 */
public class ParamTransfer {
    public static void main(String[] args) {
        User user = new User();
        user.setName("张三");
        user.setAge(40);
        ParamTransfer.modify(user);
        System.out.println(user);
    }
    public static void modify(User user){
        //通过引用指向的地址修改值可以修改成功
        user.setAge(50);
        //修改了引用的地址，导致后续修改和传入的引用没有关系
        user = new User();
        user.setName("李四");
        user.setAge(30);
    }
}
@Data
class User{
    private String name;
    private Integer age;
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
