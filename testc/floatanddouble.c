#include <stdio.h>
#include <stdlib.h>
int main()
{
	//float��double�ľ�������
    float a = 3.1415926535897932626;
    double b = 3.1415926535897932626;
    printf("folat���͵�ֵ��%.15f\n", a);//.15��ʾ������15λ�������ڱ�ʾС��ʱ��doubleҪ���Ӿ�ȷ
    printf("double���͵�ֵ��%.15lf\n", b);
	system("pause");
	return 0;
}
