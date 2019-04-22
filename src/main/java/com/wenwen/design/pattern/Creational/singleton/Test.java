package com.wenwen.design.pattern.Creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by sww_6 on 2019/4/9.
 * 序列化和反序列化对枚举来说是怎么处理的呢？
 *
 */
public class Test {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    EnumInstance instance = EnumInstance.getInstance();
    instance.setData(new Object());
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("single_file"));
    oos.writeObject(instance);

    File file = new File("single_file");
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
    EnumInstance newInstance = (EnumInstance) ois.readObject();

    System.out.println(instance.getData());
    System.out.println(newInstance.getData());
    System.out.println(instance.getData() == newInstance.getData());
  }
}
