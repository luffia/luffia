package com.zixue.List_;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 嘟嘟的掌柜
 * @constellation 白羊座
 */
@SuppressWarnings({"all"})
public class LinkedList002 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);

        //删除
        linkedList.remove();//这里默认删除第一个元素
        System.out.println(linkedList);

        Object o = linkedList.get(1);//得到双向链表的第二个元素。
        System.out.println(o);

        //迭代器必须要调用iterator
        System.out.println("======================");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);


        }

        //源码分析

//        源码首先执行
        //  public E remove() {
        //        return removeFirst();
        //    }

        //其次执行
        // public E removeFirst() {
        //        final Node<E> f = first;
        //        if (f == null)
        //            throw new NoSuchElementException();
        //        return unlinkFirst(f);
        //    }

        //最后执行
        //  private E unlinkFirst(Node<E> f) {
        //        // assert f == first && f != null;
        //        final E element = f.item;
        //        final Node<E> next = f.next;
        //        f.item = null;
        //        f.next = null; // help GC
        //        first = next;
        //        if (next == null)
        //            last = null;
        //        else
        //            next.prev = null;
        //        size--;
        //        modCount++;
        //        return element;
        //    }
    }
}
