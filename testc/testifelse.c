#include <stdio.h>
#include <stdlib.h>
int main()
{
	int a, b, c, d;
    printf("�������һ������");
    scanf("%d", &a);
    
    printf("������ڶ�������");
    scanf("%d", &b);
    
    printf("���������������");
    scanf("%d", &c);
    
    if (a > b) {
		
        d = a;
    } else {
		
        d = b;
    }
    if (d < c) {
		
        d = c;
    }
    
    printf("���������ǣ�%d\n", d);
    
	system("pause");
	return 0;
}
