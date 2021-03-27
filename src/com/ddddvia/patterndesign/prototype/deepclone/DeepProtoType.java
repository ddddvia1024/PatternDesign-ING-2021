package com.ddddvia.patterndesign.prototype.deepclone;

import java.io.*;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class DeepProtoType implements Cloneable, Serializable {
    private String name;
    private String age;
    private Sheep sheep;

    public DeepProtoType(String name, String age, Sheep sheep) {
        this.name = name;
        this.age = age;
        this.sheep = sheep;
    }

    public Sheep getSheep() {
        return sheep;
    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sheep=" + sheep +
                '}';
    }

    /**
     * 深拷贝
     *
     * @return DeepProtoType
     */
    public DeepProtoType deepClone() {

        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        DeepProtoType deepProtoType = null;
        try {
            //序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            //反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            deepProtoType = (DeepProtoType) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                    byteArrayOutputStream.close();
                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return deepProtoType;
    }
}
