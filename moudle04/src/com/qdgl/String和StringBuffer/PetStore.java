package com.qdgl.String和StringBuffer;

/**
 * @Auther: lishuaiwu
 * @Date: 2021/1/18 0018
 * @Description: com.qdgl.test01 宠物店
 * @Version: 1.0
 */
public class PetStore {
    // 提供动物 传入宠物名字
    public static Animate getAnimate (String petName) { // 多态应用2 父类做返回值
        Animate an = null;
        if ("猫".equals(petName)) {
            an = new Cat();
        }
        if ("狗".equals(petName)) {
            an = new Dog();
        }
        return an;
    }
}
