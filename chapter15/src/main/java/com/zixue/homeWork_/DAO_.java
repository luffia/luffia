package com.zixue.homeWork_;

import java.util.*;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
public class DAO_<T> {
    private Map<String, T> map = new HashMap<>();

    //  1、创建一个 public void save(String id,T entity)方法：保存T类型对象到Map成员变量中
    public void save(String id, T entity) {
        map.put(id, entity);
    }

    // 2、从map中获取ID对应的对象
    public T get(String id) {
        return map.get(id);
    }

  // 3、删除指定ID对象
    public void delete(String id){
      map.remove(id);
    }


    // 4、update 替换map中K为ID的内容改为entity对象
    public void update(String id, T entity) {
        map.put(id, entity);//update就是再次put的方法
    }


    // 5、返回map中存放的所有T对象
    public List<T> list() {
//       分析：所有T对象要放在一个集合里所以要先定义一个接收的数组
//        把value封装到一个集合中返回
//        遍历Map将所有的value其实就是entity封装到ArrayList返回即可
        List<T> list = new ArrayList<>();
        Set<String> KeySet = map.keySet();//先把T取出来
        for (String key : KeySet) {//遍历map时把所有的key取出来
            //下面返回的就是一个User对象保存到AArrayList中
            list.add(get(key));//然后调用get方法取出来
        }
        return list;
    }
}
