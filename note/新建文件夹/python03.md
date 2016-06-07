#####每日学习笔记
May 30, 2016 7:39 PM

 
>其实我自己都感到奇怪，我怎么突然开始学起python了，本来只是一个简单的想法，只是要抓取一些笑话来玩，没想到自己竟然学起python来一发不可收拾了。
还有一点，就是这几天看知乎或者github以及一些技术博客看到别人都懂好多，精通多门技术，自己不要盲目跟风，自己一样都没学好，还是安安静静、踏踏实实的把手头的东西做好罢。
在教室学习没有联网，就看python 核心编程入门指南来学习吧。

###插曲：编码风格
* 使用 4 空格缩进，而非 TAB。在小缩进（可以嵌套更深）和大缩进（更易读）之间，4 空格是一个很好的折中。TAB 引发了一 些混乱，最好弃用。
* 折行以确保其不会超过 79 个字符。
* 可能的话，注释独占一行
* 使用文档字符串
* 把空格放到操作符两边，以及逗号后面，但是括号里侧不加空格： a = f(1, 2) + g(3, 4) 
* 推荐类名用 驼峰命名， 函数和方法名用 小写_和_下划线。总是用 self 作为方法的第一个参 数（关于类和方法的知识详见 初识类 ）。
* 不要使用花哨的编码，如果你的代码的目的是要在国际化 环境。Python 的默认情况下，UTF-8， 甚至普通的 ASCII 总是工作的最好。

###数据结构
1.把链表当作堆栈使用
链表方法使得链表可以很方便的做为一个堆栈来使用，堆栈作为特定的数据结构，最先进入的元素最 后一个被释放（后进先出）。用 append() 方法可以把一个元素添加到堆栈顶。用不指定索引的 pop() 方法可以把一个元素从堆栈顶释放出来。
```
>>> stack = [3, 4, 5] 
>>> stack.append(6) 
>>> stack.append(7) 
>>> stack 
[3, 4, 5, 6, 7]
>>> stack.pop() 
7 
>>> stack 
[3, 4, 5, 6]
```
2.把链表当作队列使用
	也可以把链表当做队列使用，队列作为特定的数据结构，最先进入的元素最先释放（先进先出）。 不过，列表这样用效率不高。相对来说从列表末尾添加和弹出很快；在头部插入和弹出很慢（因为， 为了一个元素，要移动整个列表中的所有元素）。 要实现队列，使用 collections.deque ，它为在首尾两端快速插入和删除而设计
 ```
>>> from collections import deque
>>> queue = deque(["Eric", "John", "Michael"])
>>> queue.append("Terry") # Terry arrives
>>> queue.append("Graham") # Graham arrives 
>>> queue.popleft() # The first to arrive now leaves 
'Eric' 
>>> queue.popleft() # The second to arrive now leaves 
'John'
>>> queue # Remaining queue in order of arrival 
deque(['Michael', 'Terry', 'Graham'])

```

### del 语句
有个方法可以从列表中按给定的索引而不是值来删除一个子项： del 语句。它不同于有返回值的 pop() 方法。语句 del 还可以从列表中删除切片或清空整个列表（我们以前介绍过一个方法是将空 列表赋值给列表的切片）
```
>>> a = [-1, 1, 66.25, 333, 333, 1234.5] 
>>> del a[0] 
>>> a 
[1, 66.25, 333, 333, 1234.5] 
```
###类
感觉其实跟java差不多的
类是面向对象的核心，它扮演相关数据及逻辑容器的角色。因为Python并不要求你以面向对象的方式编程（与java不同），所以也可以不学习类。
所以我就先不学了，哈哈哈哈
###定制模块 
Python 为你提供两个钩子 (hook) 来定制交互环境: sitecustomize 和 usercustomize. 要知道它如何工作, 你需要先找到你的 user site-package 目录的位置. 打开 Python 并运行这段代码: 
```
 >>> import site 
 >>> site.getusersitepackages()
'/home/user/.local/lib/python3.2/site-packages'```

现在你可以在那个目录下创建一个名为 usercustomize.py 的文件, 并 在里面放置任何你想放的东西. 它将影响到每一次 Python 的调用, 除非使 用了 -s 选项来禁用了自动导入功能.

###字典遍历技巧
```
 >>> knights = {'gallahad': 'the␣pure', 'robin': 'the␣brave'} 
 >>> for k, v in knights.items(): 
 ... 	print(k, v)
 gallahad the pure 
 robin the brave 
```

```

>>>for i, v in enumerate(['tic', 'tac', 'toe']):
...		print(i,v)
0 tic
1 tac
2 toe
```
