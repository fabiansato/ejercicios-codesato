	#include <stdio.h>
/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/
    void increment(int *v) {
        (*v)++; 
    }


    
      	int main() {
        int a;
        scanf("%d", &a);
        increment(&a);
        printf("%d", a);
    	return 0;      
    }     