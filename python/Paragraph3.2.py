


for i in range(20):
    for j in range(i):
        print('*' ,end='')
    print('')


def print_len():

  a = ['dog', 'cat', 'axe']
  for i in range(len(a)):
    print(i, a[i])





def print_range():
    for i in range(5):
        print(i)



def print_for():


    words = ['cat','dog','axe']
    for w in words:
       print(w, len(w))







def print_if():

    x = int(input('please enter an integer: '))
    if x < 0:
        x = 0
        print('negative changed to zero')
    elif x==0:
        print('zero')
    elif x==1:
        print('single')
    else:
        print('more')






class WhileLoopExample(object):

    @staticmethod
    def print_fibonacci_coma():
        a,b = 0,1
        while b < 10000:
            print(b, end='; ')
            a,b = b, a+b

    @staticmethod
    def print_value():
        i = 7*8
        print('the value of i is', i)

    @staticmethod
    def print_fibonacci():
        a,b = 0,1
        while b < 10:
            print(b)
            a,b = b, a+b


WhileLoopExample.print_fibonacci_coma()