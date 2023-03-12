java-class:
    private;
    嵌套类;
    

```
Walrus a = new Walrus(1000, 8.3);
Walrus b;
b = a;
b.weight = 5;
// ? 上下区别 ? 即为类型的区别 ...
int x = 5;
int y;
y = x;
x = 2;

```

java- lists：
初步探索建立阶段：
 Intlist -> SLlist -> Dlist -> Arrays;

Arrays:
  System.arraycopy(b, 0, x, 3, 2) in java  == x[3:5] = b[0:2] in python

通用版本使用泛型(generics)；
  java不允许泛型数组;所以 items = (Item[]) new Object[100];


简单优化
  缓存：设置变量存储；
  哨兵节点;

  
question: 
1.  如果双精度比整数更通用，为什么我们不总是使用它们呢？这样做有什么缺点吗？
2.  存储 32 条目 int 数组和 300 条目 int 数组的地址的内存成本有多少不同？
3. 重新解释哨兵节点是什么以及它为什么重要。问问自己，如果删除哨兵，您的代码是否会出错。哨兵是你的 IntList 的必要组成部分吗？
4.  没有大小变量而每次只计算大小的缺点是什么？
5.  如果哨兵节点是一个空节点，它会改变什么吗？或者 Intlist 是否能够运行？

小结：
    1.java里的数据类型存储方式为：引用类型本质为指针，指向数据所存在的地址(个人认为[] and . in java == & in c and c++ == 取指针所指数据)；而对于基本类型，自身即相当于地址，数据寄放在自身；

暂且结束，有个别题目没做；