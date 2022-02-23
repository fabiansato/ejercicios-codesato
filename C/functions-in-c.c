// https://www.hackerrank.com/challenges/functions-in-c/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
#include <stdio.h>
/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}


int max_of_four(int a, int b, int c, int d) {
    int max = 0;
    
 if(max <= a) max = a;
 if(max <= b) max = b;
 if(max <= c) max = c;
 if(max <= d) max = d;
 return max;   
    }
