# Problema: https://www.hackerrank.com/challenges/simple-array-sum/problem
# Score: 10



def simpleArraySum(ar):
    x=0
    for i in range(0,len(ar)):
        x = x + ar[i]
    return x


## Estos datos son para testear el codigo
ar = [1, 2, 3, 4, 10, 11]
simpleArraySum(ar)
